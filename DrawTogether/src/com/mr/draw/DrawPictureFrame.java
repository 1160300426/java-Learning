package com.mr.draw;
/*
  *��ͼ������
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
	//����һ��8λ��BGR��ɫ������ͼ��.
	BufferedImage image = new BufferedImage(570, 390, BufferedImage.TYPE_INT_BGR);
	Graphics gs = image.getGraphics();           //���ͼ��Ļ�ͼ����.
	Graphics2D gs2D = (Graphics2D)gs;
	DrawPictureCanvas canvas = new DrawPictureCanvas();
	Color foreColor = Color.BLACK;
	Color backColor = Color.WHITE;
	
	//����¼�.
	int foreX = -1;
	int foreY = -1;
	boolean rubber = false;      //��Ƥ��ʶ��.
	
	public DrawPictureFrame() {
		setResizable(false);          //���岻�ܸı��С.
		setTitle("��ͼ����");            //���ñ���.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //����ر���ֹͣ����.
		setBounds(500, 100, 574, 460);          //���ô��ڵ�λ�úͿ��.
		init();
		addListener();
	}
	
	/*
	 * �����ʼ��.
	*/
	public void init() {
		gs2D.setColor(backColor);
		gs2D.fillRect(0, 0, 570, 390);  //�ñ���ɫ�����������.
		gs2D.setColor(foreColor);
		canvas.setImage(image);
		getContentPane().add(canvas);
	}
	/*
	 * Ϊ�����Ӷ���������.
	*/
	private void addListener() {
		//�����������ƶ��¼�����.
		canvas.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(final MouseEvent e) {       //�������קʱ.
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
				canvas.repaint();   //���»���.
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
	 * ����������.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawPictureFrame frame = new DrawPictureFrame();  //�����������.
		frame.setVisible(true);                   //�ô���ɼ�.
	}
}