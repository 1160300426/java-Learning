package mutableHazardous;

import java.util.ArrayList;
import java.util.List;
/**
 * list的不可变性
 * */
public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a = new ArrayList<>();
		a.add("cat");
		List<String> b = a;
		b.add("dog");
		System.out.println(a);
		System.out.println(b);
	}

}
