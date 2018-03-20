package testForIterator;

import java.util.ArrayList;
import java.util.List;

public class testForArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		List<Integer> indexArray = new ArrayList<>();
		int index = 0;
		
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);
		
		/*
		 * 输出[6,8,10]与预期不同.
		 * */
		for (Integer integer : list) {
			if (integer %2 == 0) {
				indexArray.add(index);
			}
			index++;
		}
		for(Integer i : indexArray) {
			list.remove(i);
		}
		System.out.println(list);
	}
}
