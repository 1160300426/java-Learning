import java.util.Scanner;                              //导入包.
class  day2 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println(1000);
		System.out.println('l');
		System.out.println(true);
		
		System.out.println("请输入一个整数：\n");
		Scanner sc = new Scanner(System.in);           //创建对象,键盘录入.
		int x = sc.nextInt();                          //录入一个整数.
		//System.out.println(x);

		System.out.println("请输入第二个整数：\n");
		int y = sc.nextInt();
		//System.out.println(y);

        boolean equal = x == y;
		if (equal)
		{
			System.out.println("x与y相等\n");
		}
		else {
			System.out.println("x与y不相等\n");
		}
		System.out.println("x和y最大值：\n");
		if (x > y)
		{
			System.out.println("最大值为：" + x);
		}
		else {
			System.out.println("最大值为：" + y);
		}
	}
}
