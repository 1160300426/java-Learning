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
		//设置为边界布局，组件水平间距和垂直间距都为2.
		container.setLayout(new BorderLayout(2,2));
		buttonEAST = new JButton("东区");
		buttonWEST = new JButton("西区");
		buttonSOUTH = new JButton("南区");
		buttonNORTH = new JButton("北区");
		buttonCENTER = new JButton("中心区");
		//将按钮添加到各个区.
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
