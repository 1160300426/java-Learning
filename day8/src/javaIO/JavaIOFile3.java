package javaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JavaIOFile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("D:\\test\\data.txt");   //�����ļ�����.
			//ʹ���ļ����󴴽��ļ������������൱�ڴ��ļ�.
			FileInputStream fileInputStream = new FileInputStream(file);
			byte[] buf = new byte[(int) (file.length())];
			fileInputStream.read(buf);    //һ�ζ�ȡ�ļ��������ݴ�ŵ��ֽ�������.
			String str = new String(buf);     //�����ֽ����鴴���ַ���.
			System.out.println(str);
			fileInputStream.close();          //�ر���.
		}
		catch (FileNotFoundException fnfe) {     //�����ļ��޷��ҵ��쳣.
			System.out.println("�ļ���ʧ�ܡ�");
		}
		catch (IOException ioe) {                //��������/����쳣.
			System.out.println("�ļ������쳣��");
		}
	}

}
