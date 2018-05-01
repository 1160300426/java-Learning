package testRegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpFirstLearn {
	public static void main(String[] args) {
		String string0 = "ABCD";
		String pattern0 = "([a-zA-Z]+)";
		
		Pattern r0 = Pattern.compile(pattern0);
		Matcher m0 = r0.matcher(string0);
		if (m0.find()) {
			System.out.println("Found : " + m0.group(1));
		}
		
		// TODO Auto-generated method stub
		String string = "Vertex = <\"Server1\",    \"Server\", <\"192.168.1.2\">> ";
		String pattern = "\"([a-zA-Z0-9]+)\",\\s*\"([a-zA-Z0-9]+)\",\\s*<\"([a-zA-Z0-9.]+)\">";
		
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
		
		
		String string2 = "VertexType = “Movie”, “Actor”, “Director” ";
		String pattern2 = "([a-zA-Z]+)";
		
		Pattern r2 = Pattern.compile(pattern2);
		Matcher m2 = r2.matcher(string2);
//		if (m2.find()) {
//			System.out.println("Found value2: " + m2.group(0));
//	        System.out.println("Found value2: " + m2.group(1));
//		} else {
//			System.out.println("NO MATCH");
//		}
		
		while (m2.find()) {
	        System.out.println("Found value2: " + m2.group(1));
		} 
		
		//引号需要加反斜杠转义。
		String string3 = "GraphType = \"GraphPoet\"";
		String pattern3 = "([a-zA-Z]+)";
		
		System.out.println("String3 : " + string3);
		Pattern r3 = Pattern.compile(pattern3);
		Matcher m3 = r3.matcher(string3);
		
		while (m3.find()) {
			System.out.println("Found value3: " + m3.group(1));
		}
		
		String string4 = "Edge = <\"SRFD\", \"MovieDirectorRelation\", \"-1\",  \"TheShawshankRedemption\", \"FrankDarabont\", \"No\"> ";
		String pattern4 = "<\"([a-zA-Z0-9]+)\",\\s+\"([a-zA-Z]+)\",\\s+\"([0-9.-]+)\",\\s+\"([a-zA-Z0-9]+)\",\\s+\"([a-zA-Z0-9]+)\",\\s+\"([a-zA-Z]+)\">";
		
		System.out.println("String4:" + string4);
		Pattern r4 = Pattern.compile(pattern4);
		Matcher m4 = r4.matcher(string4);
		if (m4.find()) {
			System.out.println("Found value: " + m4.group(0));
	        System.out.println("Found value: " + m4.group(1));
	        System.out.println("Found value: " + m4.group(2));
	        System.out.println("Found value: " + m4.group(3)); 
	        System.out.println("Found value: " + m4.group(4));
	        System.out.println("Found value: " + m4.group(5));
	        System.out.println("Found value: " + m4.group(6)); 
		} else {
			System.out.println("NO MATCH");
		}
		
		String string5 = "HyperEdge = <\"ActorsInSR\", \"SameMovieHyperEdge\", {\"TimRobbins\", \"MorganFreeman\"}> ";
		String pattern5 = "<\"([a-zA-Z0-9]+)\",\\s+\"([a-zA-Z0-9]+)\",\\s+\\{([a-zA-Z0-9\", ]+)\\}>";
		
		System.out.println(pattern5);
		Pattern r5 = Pattern.compile(pattern5);
		Matcher m5 = r5.matcher(string5);
		if (m5.find()) {
			System.out.println("Found value: " + m5.group(0));
	        System.out.println("Found value: " + m5.group(1));
	        System.out.println("Found value: " + m5.group(2));
	        System.out.println("Found value: " + m5.group(3)); 
		}
		
		String string6 = "HyperEdge = <\"ActorsInSR\", \"SameMovieHyperEdge\", {\"TimRobbins\", \"MorganFreeman\"}>";
		String pattern6 = "([a-zA-Z0-9]+)";
		
		Pattern r6 = Pattern.compile(pattern6);
		Matcher m6 = r6.matcher(string6);
		if (m6.find()) {
			System.out.println(m6.group(1));
		}
		
		String pattern6_1 = "([a-zA-Z]+)";
		Pattern r6_1 = Pattern.compile(pattern6_1);
		Matcher m6_1 = r6_1.matcher(string6);
		if (m6_1.find()) {
			System.out.println(m6_1.group(1));
		}
		
		Pattern r6_2 = Pattern.compile(pattern6_1);
		Matcher m6_2 = r6_2.matcher(string6);
		if (m6_2.find()) {
			System.out.println(m6_2.group(1));
		}
	}
}