package javaSwing;

import javax.swing.JFrame;

public class JavaJFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("第一个java窗口");//创建框架.
		frame.setSize(800, 1000);             //设置框架大小.
		frame.setResizable(false);           //设置不能改变框架大小.
		frame.setLocationRelativeTo(null);   //框架居中.
		frame.setVisible(true);              //设置框架可见性.
		//关闭框架时程序结束.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
