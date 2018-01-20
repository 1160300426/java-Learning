package javaSwing;
import javax.swing.*;

import java.awt.Color;
import java.awt.color.*;
public class JavaJPanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("JPanel示例");
		frame.setSize(800, 600);
		frame.setLayout(null);          //将frame的布局管理器设为null.
		JPanel panel = new JPanel();    //创建面板.
		panel.setSize(300,200);         //设置面板的宽和高.
		panel.setBackground(Color.BLUE);//设置面板的背景色.
		frame.add(panel);               //将面板添加到frame中.
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
