/*实现相同的功能*/
package javaEvent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class EventDemo4 {
	JFrame frame;
	JButton okButton,cancelButton;
	EventDemo4(String title) {
		frame = new JFrame(title);
		frame.setSize(800,600);
		frame.setLayout(new FlowLayout());
		okButton = new JButton("确定");
		cancelButton = new JButton("取消");
		frame.add(okButton);
		frame.add(cancelButton);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ButtonEvent buttonEvent = new ButtonEvent();    //创建内部类对象.
		okButton.addActionListener(buttonEvent);        //内部类对象注册为监听器.
		cancelButton.addActionListener(buttonEvent);    //内部类对象注册为监听器.
	}
	class ButtonEvent implements ActionListener {   //内部类做监听器类.
		public void actionPerformed(ActionEvent e) { 
			if (e.getSource() == okButton)            //事件源是“确定”按钮.
				frame.setTitle("点击了确定按钮");      //直接访问frame.
			else                                      //事件源是“取消”按钮.
				frame.setTitle("点击了取消按钮");      //直接访问frame.
		}
	}
}
public class JavaActionEventEdition4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventDemo4 evd = new EventDemo4("事件响应");
	}
}
