package com.mr.draw;           //类所在的包名.

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;

public class DrawPictureCanvas extends Canvas{
	private Image image = null;          //创建画板中展示的图片对象.
	
	/*
	 * 设置画板中的图片
	*/
	
	public void setImage(Image image) {
		this.image = image;
	}
	
	/*
	 * 重写paint()方法
	 */
	@Override
	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, null);            //在画布上绘制图像.
	}
	
	@Override
	public void update(Graphics g) {
		paint(g);     
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
