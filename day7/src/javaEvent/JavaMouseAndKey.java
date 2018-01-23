package javaEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MouseAndKeyDemo {
	JFrame frame;
	int lastX = 0, lastY = 0;    //��������λ������.
	public MouseAndKeyDemo() {
		frame = new JFrame("���Ӱװ�");
		//���������ı���ɫ��Ϊ��ɫ.
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setForeground(Color.blue);        //����ͼ��ǰ��ɫ��Ϊ��ɫ.
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ʹ�������ദ������¼�.
		frame.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {  //����������ʱ
				lastX = e.getX();     //��ȡ��������λ��.
				lastY = e.getY();
			}
		});
		//ʹ�������ദ������¼�.
		frame.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) { //�϶����ʱ.
				int x = e.getX();                 //��ȡ�������λ��.
				int y = e.getY();
				Graphics g = frame.getGraphics();
				g.drawLine(lastX, lastY, x, y);           //����.
				lastX = e.getX();            //�����µ�λ�����긳��lastX��lastY
				lastY = e.getY(); 
			}
		});
		//ʹ�������ദ������¼�.
		frame.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {  //�û�����ʱ.
				//��ȡ������ַ���תΪ�ַ���.
				String s = String.valueOf(e.getKeyChar());
				//�����ַ�.
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
