package javaLayout;
import java.awt.*;
import javax.swing.*;
class BorderLayoutDemo {
	JFrame frame;
	JButton buttonEAST,buttonWEST,buttonSOUTH,buttonNORTH,buttonCENTER;
	public BorderLayoutDemo(String title) {
		frame = new JFrame(title);
		frame.setSize(260,180);
		Container container = frame.getContentPane();
		//����Ϊ�߽粼�֣����ˮƽ���ʹ�ֱ��඼Ϊ2.
		container.setLayout(new BorderLayout(2,2));
		buttonEAST = new JButton("����");
		buttonWEST = new JButton("����");
		buttonSOUTH = new JButton("����");
		buttonNORTH = new JButton("����");
		buttonCENTER = new JButton("������");
		//����ť��ӵ�������.
		frame.add(BorderLayout.EAST,buttonEAST);
		frame.add(BorderLayout.WEST,buttonWEST);
		frame.add(BorderLayout.SOUTH,buttonSOUTH);
		frame.add(BorderLayout.NORTH,buttonNORTH);
		frame.add(BorderLayout.CENTER,buttonCENTER);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
public class JavaBorderLayout {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutDemo("BoederLayout");
	}

}
