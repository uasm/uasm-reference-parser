import org.eclipse.emf.ecore.EObject;
import de.uni.ulm.uasm.parsers.UASMParsers;
import uasm2asmeta.maps.AsmetaMapProvider;

public class AsmetaParserTest {

	public static void main(String[] args) {

		AsmetaMapProvider mapperProvider = new AsmetaMapProvider();
		UASMParsers<Object> parser = new UASMParsers<>(mapperProvider);
		String spec = "asm example\n" + "controlled counter -> Integer initially 0\n"
				+ "controlled a -> Integer initially counter\n" + "rule r_Main(blubb) =\n" + "par\n"
				+ "counter := counter +1\n" + "if counter >= 10 then\n" + "a := (a+1)*2\n" + "endpar\n";
		Object obj = parser.getRootParser().parse(spec);
		System.out.println(obj.toString());		
		
	}
}
