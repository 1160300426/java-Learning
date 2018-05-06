package testSanner;

import java.util.Scanner;
public class Cylinder {
	int r;
	int height;
	
	/**
	 * �޲�����������
	 * */
	public Cylinder() {
		// TODO Auto-generated constructor stub
		this.r = 0;
		this.height = 0;
	}
	
	/**
	 * �в�����������
	 * */
	public Cylinder(int r, int height) {
		this.r = r;
		this.height = height;
	}
	/**
	 * ����Բ����İ뾶��
	 * @param Ҫ���õİ뾶ֵ��
	 * */
	public void setR(int r) {
		this.r = r;
	}
	/**
	 * ����Բ����ĸߡ�
	 * @param Ҫ���õĸ߶ȡ�
	 * */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * ���������
	 * @return Բ����������
	 * */
	public double calculateV() {
		return Math.PI * r * r * height;
	}
	/**
	 * ��ӡ�����
	 * */
	public void printV() {
		System.out.println("Բ��������Ϊ��" + calculateV());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 0, height = 0;
		
		Scanner s = new Scanner(System.in);  
		System.out.println("������뾶��");
		String lin = s.nextLine();
		r = Integer.parseInt(lin);
		
		System.out.println("������ߣ�");
		lin = s.nextLine();
		height = Integer.parseInt(lin);
		s.close();
		
		Cylinder cylinder = new Cylinder();
		cylinder.setR(r);
		cylinder.setHeight(height);
		cylinder.printV();
		
	}

}
