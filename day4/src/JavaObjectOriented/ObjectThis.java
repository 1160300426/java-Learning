package JavaObjectOriented;
class Count {
	private int i = 0;
	Count increment(){
		i++;
		return this;
	}
	void print(){
		System.out.println("i = " + i);
	}
}
//this��ʽ����.
public class ObjectThis {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count x = new Count();
		x.increment().increment().increment().print();
	}
}
