package javaSwing;
import java.awt.FlowLayout;
import java.awt.color.*;
import javax.swing.*;

public class JavaJButton {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("JButton示例");
		frame.setSize(800, 600);
		JButton buttonOK,buttonCancel;  //声明两个按钮对象.
		//将frame的布局管理器设为流式布局管理器.
		frame.getContentPane().setLayout(new FlowLayout());
		buttonOK = new JButton("确定");        //创建按钮.
		buttonCancel = new JButton("取消");
		frame.add(buttonOK);                   //将按钮添加到frame中.
		frame.add(buttonCancel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
