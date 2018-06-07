package testRegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestInter {

	public static void main(String[] args) {
		String string0 = "2018-05-20 00:00:14";
		String pattern0 = "(\\d{4}-\\d{2}-\\d{2})\\s+(\\d{2}:\\d{2}:\\d{2})";
		
		Pattern r0 = Pattern.compile(pattern0);
		Matcher m0 = r0.matcher(string0);
		if (m0.find()) {
			System.out.println("Found : " + m0.group(1));
			System.out.println("Found : " + m0.group(2));
		}
	}
}
