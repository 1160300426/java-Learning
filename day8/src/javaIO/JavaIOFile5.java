package javaIO;
import java.io.*;
public class JavaIOFile5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String string = "Hello World";
			File file = new File("Output.txt");
			//创建流.
			FileOutputStream fileOutputStream = new FileOutputStream(file,true);
			for (int i = 0;i < string.length();i++) {   //逐个将字符写入文件.
				fileOutputStream.write(string.charAt(i));
			}
			fileOutputStream.close(); //关闭流.
		} catch (FileNotFoundException fnfe) {
			System.out.println("文件打开失败!!!");
		} catch (IOException ioe) {
			System.out.println("文件输出异常");
		}
		System.out.println("HelloWorld已写入文件");
	}
}
