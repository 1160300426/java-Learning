package javaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JavaIOFile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("D:\\test\\data.txt");   //创建文件对象.
			//使用文件对象创建文件输入流对象，相当于打开文件.
			FileInputStream fileInputStream = new FileInputStream(file);
			byte[] buf = new byte[(int) (file.length())];
			fileInputStream.read(buf);    //一次读取文件所有数据存放到字节数组中.
			String str = new String(buf);     //利用字节数组创建字符串.
			System.out.println(str);
			fileInputStream.close();          //关闭流.
		}
		catch (FileNotFoundException fnfe) {     //捕获文件无法找到异常.
			System.out.println("文件打开失败。");
		}
		catch (IOException ioe) {                //捕获输入/输出异常.
			System.out.println("文件输入异常。");
		}
	}

}
