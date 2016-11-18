package uasm2asmeta.maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.asmeta.parser.OCL_Checker;
import org.asmeta.parser.ParseException;
import org.asmeta.parser.Utility;

import asmeta.definitions.DerivedFunction;
import asmeta.definitions.Function;
import asmeta.definitions.StaticFunction;
import asmeta.definitions.domains.Domain;
import asmeta.definitions.domains.DomainsFactory;
import asmeta.structure.FunctionDefinition;
import asmeta.structure.Header;
import asmeta.structure.StructureFactory;
import asmeta.terms.basicterms.VariableTerm;
import de.uni.ulm.uasm.parsers.UASMParsers;
import uasm2asmeta.maps.AsmetaMapProvider.ID;

public class AsmetaDefinitionMap extends AsmetaCompondStructMap{

	static Logger logger = Logger.getLogger(AsmetaDefinitionMap.class);

	private asmeta.definitions.domains.DomainsFactory domainsFactory;

	
	String defType;
	AsmetaDefinitionMap(StructureFactory structurePack, String nonTerminal) {
		super(structurePack);
		logger.debug("creating mapper for " + nonTerminal);
		defType = nonTerminal;
	}

	// this for DEFINITION
	@Override
	public Object map(Object[] from) {
		logger.debug("definition - mapping " + from  + " [" + from.getClass().getSimpleName()+ "]");
		switch(defType){
		case UASMParsers.CONTROLLED_FUNCTION:
			// id of the function
		    String func_name = find(from,ID.class).id;
		    // id of the domain
		    String dom_name = find(from,ID.class).id;
			FunctionDefinition func_def = structurePack.createFunctionDefinition();
			List<VariableTerm> variables = Collections.EMPTY_LIST;
			Header header = null;
			HashMap<String, List<Function>> declared_Func = null;
			Object func_dom;
			try {
				buildFunctionDefinition(variables , declared_Dom, dom_name, domainsFactory, header, func_name, declared_Func, func_def);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    return func_def;		    
		}
		//Body body = structurePack.createBody();
//		List<Object> result = new ArrayList<>();
//		flat(from, result);
//		logger.debug("body - mapping " + result.toString());
//		Body body = structurePack.createBody();
//		for (Object f : result) {
//			if (f == null)
//				continue;
//			System.out.println(f.getClass().getName() + " - " +f.toString());
//		}
		return "DEFINITION";
	}
	/**
	 * 
	 * @param variables
	 * @param declared_Dom
	 * @param dom_name
	 * @param domainsFactory
	 * @param header
	 * @param declared_Func
	 * @param func_name
	 * @param func_def
	 * @return
	 * @throws ParseException
	 */
	public static void buildFunctionDefinition(List<VariableTerm> variables, HashMap<String, Domain> declared_Dom,
			String dom_name, DomainsFactory domainsFactory, Header header, String func_name,
			HashMap<String, List<Function>> declared_Func, FunctionDefinition func_def) throws ParseException {
		Domain func_dom;
		if (variables.size() == 0)
			func_dom = null;
		else if (variables.size() == 1) {
			func_dom = (Domain) declared_Dom.get(dom_name);
			if (func_dom == null)
				func_dom = Utility.getBasicDomain(domainsFactory, dom_name);
			if (func_dom == null)
				func_dom = Utility.getPredefinedAbstractDomain(domainsFactory, dom_name);
			if (func_dom == null)
				func_dom = Utility.getStructuredDomain(domainsFactory, dom_name, header.getSignature());
			if (func_dom == null)
				throw new ParseException("Error: The domain" + dom_name
						+ " has not been declared. There not exists a function with this domain.\n");
		} else {
			dom_name = "Prod(".concat(dom_name).concat(")");
			func_dom = Utility.getStructuredDomain(domainsFactory, dom_name, header.getSignature());
			if (func_dom == null)
				throw new ParseException("Error: The domain" + dom_name
						+ " has not been declared. There not exists a function with this domain.\n");
		}
		// check if the function has been declared
		Function f = Utility.getFunction(func_name, func_dom, false, new HashMap<String, Domain>(), declared_Func);
		if (f == null)
			throw new ParseException("Error: The function " + func_name + "(" + dom_name + ")"
					+ " has not been declared. It cannot be defined!\n");
		// check if the function has already been defined
		if (f.getDefinition() != null)
			throw new ParseException(
					"Error: The function " + func_name + "(" + dom_name + ")" + " has been defined twice.\n");
		// set the reference to the function to define
		func_def.setDefinedFunction(f);
		f.setDefinition(func_def);
		// create the association
		// X ADefinitionDefinedFunction a_FuncDef_Func =
		// structurePack.getADefinitionDefinedFunction();
		// X a_FuncDef_Func.add(f,func_def);
		// check ocl constraint 1
		if (!((f instanceof StaticFunction) || (f instanceof DerivedFunction)))
			throw new ParseException("Error: Only static and derived functions can be defined.\n"
					+ "       At the definition of the function " + func_name + "(" + dom_name + ")" + ".\n");
		if (!OCL_Checker.checkFunctionDefinition(func_def))
			throw new ParseException(OCL_Checker.getMsgErr() + "\n       At the definition of the function " + func_name
					+ "(" + dom_name + ")" + ".\n");
	}

}
