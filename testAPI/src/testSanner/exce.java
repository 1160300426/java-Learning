package testSanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public  class exce {
	public static String throwException() {
		File file = new File("11.txt");
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String myLine = reader.readLine();
			System.out.println(myLine);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		return "";
	}
}
