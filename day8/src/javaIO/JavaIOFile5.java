package javaIO;
import java.io.*;
public class JavaIOFile5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String string = "Hello World";
			File file = new File("Output.txt");
			//������.
			FileOutputStream fileOutputStream = new FileOutputStream(file,true);
			for (int i = 0;i < string.length();i++) {   //������ַ�д���ļ�.
				fileOutputStream.write(string.charAt(i));
			}
			fileOutputStream.close(); //�ر���.
		} catch (FileNotFoundException fnfe) {
			System.out.println("�ļ���ʧ��!!!");
		} catch (IOException ioe) {
			System.out.println("�ļ�����쳣");
		}
		System.out.println("HelloWorld��д���ļ�");
	}
}
