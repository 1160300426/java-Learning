package testAddAll;

import java.util.ArrayList;
import java.util.List;

public class ListAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add(i + "\n");
		}
		List<String> list2 = new ArrayList<>();
		list2.add("a");
		list2.addAll(list);
		System.out.println(list2);
	}
}
