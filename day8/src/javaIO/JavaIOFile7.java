/*�������ַ������ԡ�#������������Щ�ַ���д���ļ��У�Ҫ��һ���ַ���ռһ��*/
package javaIO;
import java.io.*;
import java.util.*;
public class JavaIOFile7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fileWriter = new FileWriter("Output1.txt"); //������.
			Scanner sc = new Scanner(System.in);
			//��ȡ��ǰϵͳ�Ļ��з�.
			String ch = System.getProperty("line.separator");
			String s;
			System.out.println("����������ַ����ԡ�#������");
			while (true) {
				s = sc.nextLine();
				if (s.equals("#")) {
					break;
				}else {
					fileWriter.write(s);   //���ַ���д�������.
					fileWriter.write(ch);  //д�뻻�з�.
				}
			}
			fileWriter.close();
			System.out.println("�ѱ��浽Output1.txt");
		} catch (FileNotFoundException fnfe) {
			System.out.println("���ļ�ʧ��!!!");
		} catch (IOException ioe) {
			System.out.println("�ļ�����ʧ��!!!");
		}
	}

}
