package fooMethod;

public class B extends A{
	public B() {
		
	}
	@Override
	public void foo() { 
		super.foo();
	}
	
	public void bar() {
		System.out.println("B.bar");
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.foo();
	}

}
