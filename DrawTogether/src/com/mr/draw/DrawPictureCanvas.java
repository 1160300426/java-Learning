package com.mr.draw;           //�����ڵİ���.

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;

public class DrawPictureCanvas extends Canvas{
	private Image image = null;          //����������չʾ��ͼƬ����.
	
	/*
	 * ���û����е�ͼƬ
	*/
	
	public void setImage(Image image) {
		this.image = image;
	}
	
	/*
	 * ��дpaint()����
	 */
	@Override
	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, null);            //�ڻ����ϻ���ͼ��.
	}
	
	@Override
	public void update(Graphics g) {
		paint(g);     
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
