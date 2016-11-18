package uasm2asmeta.maps;
import org.apache.log4j.Logger;

import asmeta.structure.Asm;
import asmeta.structure.Body;
import asmeta.structure.Header;
import asmeta.structure.StructureFactory;
import uasm2asmeta.maps.AsmetaMapProvider.ID;

// return the asmeta MAP
// from the child to asmeta
class AsmetaMachineMap extends AsmetaCompondStructMap {

	static Logger logger = Logger.getLogger(AsmetaMachineMap.class); 
	
	AsmetaMachineMap(StructureFactory structurePack) {
		super(structurePack);
	}

	//Asm ::= ('asm' | 'asmmodule') Id Header Body
	@Override
	public Asm map(Object[] from) {
		logger.debug("reading abstract machine");
		Asm asmMachine = structurePack.createAsm("pippo",false);
		// get the ID
		ID id = findAndNull(from,ID.class);
		// get the header
		Header header = findAndNull(from,Header.class);
		asmMachine.setHeaderSection(header);
		header.setAsm(asmMachine);
		asmMachine.setName(id.id);
		// get the body
		Body body = findAndNull(from,Body.class);
		asmMachine.setBodySection(body);
		body.setAsm(asmMachine);
		//
		/*for(Object f: from){
			if (f == null) continue;
			System.out.println(f.getClass().getName());
			System.out.println(f.toString());
			//System.out.println(((EDataType)f).getName());
		}*/
		return asmMachine;
	}

}
