package testComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class testMain {
	public static void main(String[] args) {
//		SortedSet<String> strings = new TreeSet<>();
//		strings.addAll(Arrays.asList("yolanda", "zach", "alice", "bob"));
//		System.out.println("Ä¬ÈÏÅÅÐò£º" + strings);
		
//		Comparator<String> compareByLength = new CompareStringByLength();
//		SortedSet<String> strings = new TreeSet<>(compareByLength);
//		strings.addAll(Arrays.asList("yolanda", "zach", "alice", "bob"));
//		System.out.println("°´ÕÕ×Ö·û´®³¤¶ÈÅÅÐò£º" + strings);
		
//		SortedSet<String> strings = new TreeSet<>(new CompareStringByLength());
//		strings.addAll(Arrays.asList("yolanda", "zach", "alice", "bob"));
		
		SortedSet<String> strings = new TreeSet<>(new Comparator<String>() {
		    @Override public int compare(String s1, String s2) {
		        if (s1.length() == s2.length()) {
		            return s1.compareTo(s2);
		        }
		        return s1.length() - s2.length();
		    }
		});
		strings.addAll(Arrays.asList("yolanda", "zach", "alice", "bob"));
		System.out.println("°´ÕÕ×Ö·û´®³¤¶ÈÅÅÐò£º" + strings);
	}
}
