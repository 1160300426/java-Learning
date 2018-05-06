package testSanner;

import java.util.Scanner;
public class Cylinder {
	int r;
	int height;
	
	/**
	 * 无参数构造器。
	 * */
	public Cylinder() {
		// TODO Auto-generated constructor stub
		this.r = 0;
		this.height = 0;
	}
	
	/**
	 * 有参数构造器。
	 * */
	public Cylinder(int r, int height) {
		this.r = r;
		this.height = height;
	}
	/**
	 * 设置圆柱体的半径。
	 * @param 要设置的半径值。
	 * */
	public void setR(int r) {
		this.r = r;
	}
	/**
	 * 设置圆柱体的高。
	 * @param 要设置的高度。
	 * */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * 计算体积。
	 * @return 圆柱体的体积。
	 * */
	public double calculateV() {
		return Math.PI * r * r * height;
	}
	/**
	 * 打印体积。
	 * */
	public void printV() {
		System.out.println("圆柱体的体积为：" + calculateV());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 0, height = 0;
		
		Scanner s = new Scanner(System.in);  
		System.out.println("请输入半径：");
		String lin = s.nextLine();
		r = Integer.parseInt(lin);
		
		System.out.println("请输入高：");
		lin = s.nextLine();
		height = Integer.parseInt(lin);
		s.close();
		
		Cylinder cylinder = new Cylinder();
		cylinder.setR(r);
		cylinder.setHeight(height);
		cylinder.printV();
		
	}

}
