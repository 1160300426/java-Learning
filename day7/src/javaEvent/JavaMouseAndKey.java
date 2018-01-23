package javaEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MouseAndKeyDemo {
	JFrame frame;
	int lastX = 0, lastY = 0;    //鼠标的最新位置坐标.
	public MouseAndKeyDemo() {
		frame = new JFrame("电子白板");
		//将内容面板的背景色设为白色.
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setForeground(Color.blue);        //将绘图的前景色设为蓝色.
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//使用匿名类处理鼠标事件.
		frame.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {  //按下鼠标左键时
				lastX = e.getX();     //获取鼠标的最新位置.
				lastY = e.getY();
			}
		});
		//使用匿名类处理鼠标事件.
		frame.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) { //拖动鼠标时.
				int x = e.getX();                 //获取鼠标最新位置.
				int y = e.getY();
				Graphics g = frame.getGraphics();
				g.drawLine(lastX, lastY, x, y);           //画线.
				lastX = e.getX();            //将最新的位置坐标赋给lastX、lastY
				lastY = e.getY(); 
			}
		});
		//使用匿名类处理键盘事件.
		frame.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {  //敲击键盘时.
				//获取输入的字符，转为字符串.
				String s = String.valueOf(e.getKeyChar());
				//绘制字符.
				frame.getGraphics().drawString(s, lastX, lastY);
				lastX += 10;
			}
		});
	}
}
public class JavaMouseAndKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseAndKeyDemo();
	}

}
