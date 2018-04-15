package testForIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class testIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			list.add(i+10);
		}
		Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
        	int wa = iter.next();
        	iter.remove();
        	list.add(wa + 1);
        }
        System.out.println(list);
	}
}
