package javaSwing;
import java.awt.FlowLayout;
import java.awt.color.*;
import javax.swing.*;

public class JavaJButton {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("JButtonʾ��");
		frame.setSize(800, 600);
		JButton buttonOK,buttonCancel;  //����������ť����.
		//��frame�Ĳ��ֹ�������Ϊ��ʽ���ֹ�����.
		frame.getContentPane().setLayout(new FlowLayout());
		buttonOK = new JButton("ȷ��");        //������ť.
		buttonCancel = new JButton("ȡ��");
		frame.add(buttonOK);                   //����ť��ӵ�frame��.
		frame.add(buttonCancel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
