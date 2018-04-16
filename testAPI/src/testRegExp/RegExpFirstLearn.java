package testRegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpFirstLearn {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Vertex = <¡°Server1¡±, ¡°Server¡±, <¡°192.168.1.2¡±>> ";
		String pattern = "¡°([a-zA-Z1-9]+)¡±,\\s+¡°([a-zA-Z1-9]+)¡±, <¡°([a-zA-Z1-9.]+)¡±>";
		
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(string);
		if (m.find()) {
			System.out.println("Found value: " + m.group(0));
	        System.out.println("Found value: " + m.group(1));
	        System.out.println("Found value: " + m.group(2));
	        System.out.println("Found value: " + m.group(3)); 
		} else {
			System.out.println("NO MATCH");
		}
		
		
		String string2 = "VertexType = ¡°Movie¡±, ¡°Actor¡±, ¡°Director¡± ";
		String pattern2 = "([a-zA-Z]+)";
		
		Pattern r2 = Pattern.compile(pattern2);
		Matcher m2 = r2.matcher(string2);
		if (m2.find()) {
			System.out.println("Found value2: " + m2.group(0));
	        System.out.println("Found value2: " + m2.group(1));
		} else {
			System.out.println("NO MATCH");
		}
	}
}
