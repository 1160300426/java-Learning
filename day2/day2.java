import java.util.Scanner;                              //�����.
class  day2 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println(1000);
		System.out.println('l');
		System.out.println(true);
		
		System.out.println("������һ��������\n");
		Scanner sc = new Scanner(System.in);           //��������,����¼��.
		int x = sc.nextInt();                          //¼��һ������.
		//System.out.println(x);

		System.out.println("������ڶ���������\n");
		int y = sc.nextInt();
		//System.out.println(y);

        boolean equal = x == y;
		if (equal)
		{
			System.out.println("x��y���\n");
		}
		else {
			System.out.println("x��y�����\n");
		}
		System.out.println("x��y���ֵ��\n");
		if (x > y)
		{
			System.out.println("���ֵΪ��" + x);
		}
		else {
			System.out.println("���ֵΪ��" + y);
		}
	}
}
