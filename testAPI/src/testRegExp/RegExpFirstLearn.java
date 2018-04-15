package testRegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpFirstLearn {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Vertex = <¡°Server1¡±, ¡°Server¡±, <¡°192.168.1.2¡±>> ";
		String pattern = "[a-zA-z1-9]";
		
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(string);
		if (m.find()) {
			System.out.println("Found value: " + m.group(0) );
	        System.out.println("Found value: " + m.group(1) );
	        System.out.println("Found value: " + m.group(2) );
	        System.out.println("Found value: " + m.group(3) ); 
		} else {
			System.out.println("NO MATCH");
		}
	}
}
