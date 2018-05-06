package testRegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string0 = "LiGuojian";
		String pattern0 = "([G]+)";
		
		Pattern r0 = Pattern.compile(pattern0);
		Matcher m0 = r0.matcher(string0);
		if (m0.find()) {
			System.out.println("Found : " + m0.group(1));
		}
	}

}
