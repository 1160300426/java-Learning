package com.mr.draw;
/*
  *画图主窗体
*/

import javax.swing.JFrame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DrawPictureFrame extends JFrame{
	//创建一个8位的BGR颜色分量的图像.
	BufferedImage image = new BufferedImage(570, 390, BufferedImage.TYPE_INT_BGR);
	Graphics gs = image.getGraphics();           //获得图像的绘图对象.
	Graphics2D gs2D = (Graphics2D)gs;
	DrawPictureCanvas canvas = new DrawPictureCanvas();
	Color foreColor = Color.BLACK;
	Color backColor = Color.WHITE;
	
	//鼠标事件.
	int foreX = -1;
	int foreY = -1;
	boolean rubber = false;      //橡皮标识符.
	
	public DrawPictureFrame() {
		setResizable(false);          //窗体不能改变大小.
		setTitle("画图程序");            //设置标题.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //窗体关闭则停止程序.
		setBounds(500, 100, 574, 460);          //设置窗口的位置和宽高.
		init();
		addListener();
	}
	
	/*
	 * 组件初始化.
	*/
	public void init() {
		gs2D.setColor(backColor);
		gs2D.fillRect(0, 0, 570, 390);  //用背景色填充整个画布.
		gs2D.setColor(foreColor);
		canvas.setImage(image);
		getContentPane().add(canvas);
	}
	/*
	 * 为组件添加动作监听器.
	*/
	private void addListener() {
		//画板添加鼠标移动事件监听.
		canvas.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(final MouseEvent e) {       //当鼠标拖拽时.
				if (foreX > 0 && foreY > 0) {
					if (rubber) {
						gs2D.setColor(backColor);
						gs2D.fillRect(foreX, foreY, 10, 10);
					} else {
						gs2D.drawLine(foreX, foreY, e.getX(), e.getY());
					}
				}
				foreX = e.getX();
				foreY = e.getY();
				canvas.repaint();   //更新画布.
			}
		});
		canvas.addMouseListener(new MouseAdapter() {
			public void mouseReleased(final MouseEvent arg0) {
				foreX = -1;
				foreY = -1;
			}
		});
	}
	/*
	 * 程序主方法.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawPictureFrame frame = new DrawPictureFrame();  //创建窗体对象.
		frame.setVisible(true);                   //让窗体可见.
	}
}