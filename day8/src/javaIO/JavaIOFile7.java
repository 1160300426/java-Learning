/*输入多个字符串，以“#”结束，将这些字符串写入文件中，要求一个字符串占一行*/
package javaIO;
import java.io.*;
import java.util.*;
public class JavaIOFile7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fileWriter = new FileWriter("Output1.txt"); //创建流.
			Scanner sc = new Scanner(System.in);
			//获取当前系统的换行符.
			String ch = System.getProperty("line.separator");
			String s;
			System.out.println("请输入多行字符，以“#”结束");
			while (true) {
				s = sc.nextLine();
				if (s.equals("#")) {
					break;
				}else {
					fileWriter.write(s);   //将字符串写入输出流.
					fileWriter.write(ch);  //写入换行符.
				}
			}
			fileWriter.close();
			System.out.println("已保存到Output1.txt");
		} catch (FileNotFoundException fnfe) {
			System.out.println("打开文件失败!!!");
		} catch (IOException ioe) {
			System.out.println("文件输入失败!!!");
		}
	}

}
