/*从键盘上输入一串字符，将这些字符写入文件.*/
package javaIO;
import java.io.*;
import java.util.*;
public class JavaIOFile4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//创建输出流对象.
			FileOutputStream fileOutputStream = new FileOutputStream("Output.txt");
			System.out.print("请输入一行字符：");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();           //输入一行字符.
			byte buffer[] = s.getBytes();        //将字符串转换为字节数组.
			fileOutputStream.write(buffer);    //写入输出流.
			fileOutputStream.close();        //关闭输出流.
			System.out.println("已保存到文件Output.txt!!");
			
		}
		catch (FileNotFoundException fnfe) {
			System.out.println("文件打开失败");
		}
		catch (IOException ioe) {
			System.out.println("文件输出异常");
		}
	}

}
