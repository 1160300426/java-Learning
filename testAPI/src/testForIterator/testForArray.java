package testForIterator;

import java.util.ArrayList;
import java.util.List;

public class testForArray {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(10);
		for (Integer integer : list) {
			//��δ������. �������Ƴ��ᱨ��.
			if (integer % 2 == 0) {
				list.remove(integer);
			}
		}
		System.out.println(list);
	}
}
