package testForIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class testForArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(10);
		
		/*
		 * 使用迭代器本身的remove方法.
		 * */
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			int i = iter.next();
			if (i % 2 == 0) {
				iter.remove();
			}
		}
		System.out.println(list);
	}
}
