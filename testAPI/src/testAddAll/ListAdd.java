package testAddAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add(i + " ");
		}
		List<String> list2 = new ArrayList<>();
		list2.add("a");
		list2.addAll(list);
		System.out.println(list2);
		
		list = Arrays.asList("yello", "bobby", "alice", "aaa");
		System.out.println("list:" + list);
		list2.clear();
		list2.add("hey");
		list2.addAll(list);
		System.out.println("list2:" + list2);
	}
}
