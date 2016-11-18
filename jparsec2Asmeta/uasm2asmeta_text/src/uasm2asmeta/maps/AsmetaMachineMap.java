package uasm2asmeta.maps;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.log4j.Logger;

import uasm2asmeta.maps.AsmetaMapProvider.ID;

// return the asmeta MAP
// from the child to asmeta
class AsmetaMachineMap extends AsmetaCompoundStructMap {

	static Logger logger = Logger.getLogger(AsmetaMachineMap.class); 
	

	//Asm ::= ('asm' | 'asmmodule') Id Header Body
	@Override
	public StringBuffer map(Object[] from) {
		logger.debug("reading abstract machine");
		StringBuffer asmMachine = new StringBuffer("asm ");
		// get the ID
		ArrayList<Object> fromList = new ArrayList<>(Arrays.asList(from));
		fromList.remove(0); // remove keyword
		ID id = findAndRemove(ID.class,fromList);
		asmMachine.append(id.id).append('\n');
		// get the header
		for(Object f: fromList){
			if (f == null) continue;
			//logger.debug("adding " + f.getClass().getName() + " " + f.toString());
			System.out.println(f.toString());
			appendAndIndent(asmMachine, f.toString());
		}
		return asmMachine;
	}

}
