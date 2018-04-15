package testString;

public class testStringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ÚÈÒ«±ó";
		String b = "ÚÈÒ«±ó";
		String c = new String("ÚÈÒ«±ó");
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.hashCode() + "\n" + b.hashCode() + "\n" + c.hashCode());
		
		Integer integer = new Integer(127);
		int i = 127;
		System.out.println(integer.equals(i));
		System.out.println(i == integer);
		
		Integer integer2 = new Integer(128);
		int j = 128;
		System.out.println(integer2.equals(j));
		System.out.println(j == integer2);
	}
}
