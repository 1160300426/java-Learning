/*�Ӽ���������һ���ַ�������Щ�ַ�д���ļ�.*/
package javaIO;
import java.io.*;
import java.util.*;
public class JavaIOFile4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//�������������.
			FileOutputStream fileOutputStream = new FileOutputStream("Output.txt");
			System.out.print("������һ���ַ���");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();           //����һ���ַ�.
			byte buffer[] = s.getBytes();        //���ַ���ת��Ϊ�ֽ�����.
			fileOutputStream.write(buffer);    //д�������.
			fileOutputStream.close();        //�ر������.
			System.out.println("�ѱ��浽�ļ�Output.txt!!");
			
		}
		catch (FileNotFoundException fnfe) {
			System.out.println("�ļ���ʧ��");
		}
		catch (IOException ioe) {
			System.out.println("�ļ�����쳣");
		}
	}

}
