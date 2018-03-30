package mutableHazardous;

import java.util.Arrays;
import java.util.List;

/**
 * 测试mutable类型的参数变化
 * */
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myData = Arrays.asList(-5, -3, -2);
	    System.out.println(sumAbsolute(myData));
	    System.out.println(sum(myData));
	}
	/** @return the sum of the numbers in the list */
	public static int sum(List<Integer> list) {
	    int sum = 0;
	    for (int x : list)
	        sum += x;
	    return sum;
	}
	/** @return the sum of the absolute values of the numbers in the list */
	public static int sumAbsolute(List<Integer> list) {
	    // let's reuse sum(), because DRY, so first we take absolute values
	    for (int i = 0; i < list.size(); ++i)
	        list.set(i, Math.abs(list.get(i)));
	    return sum(list);
	}
}
