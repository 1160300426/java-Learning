目录

[TOC]

# 前面
今天突然发现java集合类中的排序方式可以利用Comparator接口实现自定义，感觉很有意思，在这里与大家分享一下。

# 默认排序
如果我们不写自定义的排序，那么Collection默认的排序是按照字符串的字典序，考察下面代码：

```
SortedSet<String> strings = new TreeSet<>();
strings.addAll(Arrays.asList("yolanda", "zach", "alice", "bob"));
System.out.println("默认排序：" + strings);
```
输出的strings的结果为：

> 默认排序：[alice, bob, yolanda, zach]


可以看到，如果不增加自定义的排序方法，那么集合类的排序方式为字典序。

# 自定义排序类

如果要用自定义的排序方法，首先需要创建自定义排序类：

```
/**
* 根据字符串的长度比较。
*/
public class CompareStringByLength implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		if (o1.length() == o2.length()) {
            return o1.compareTo(o2);
        }
        return o1.length() - o2.length();
	}
}
```
这里解释一下comparaTo方法，该方法返回从左至右不相同的那个字符的ASCII码之差，如果没用不同的字符则返回0。当长度不等且最短的字符串是长字符串的前缀时，返回二者之差。

# 测试

可能很多人看到这里还是不懂这个排序类该怎么用，下面请看我的测试代码：

```
Comparator<String> compareByLength = new CompareStringByLength();
SortedSet<String> strings = new TreeSet<>(compareByLength);
strings.addAll(Arrays.asList("yolanda", "zach", "alice", "bob"));		
System.out.println("按照字符串长度排序：" + strings);
```
还是对这几个字符串进行排序，可以看到，输出结果发生变化：

> 按照字符串长度排序：[bob, zach, alice, yolanda]

不再是默认的字典序了，而是按照我们自定义的字符串长度排序。

当然，为了简洁，我们也可以省略一个变量：

```
SortedSet<String> strings = new TreeSet<>(new CompareStringByLength());
strings.addAll(Arrays.asList("yolanda", "zach", "alice", "bob"));
```
此外，如果该类只使用一次，也可以使用匿名类，更简洁：

```
SortedSet<String> strings = new TreeSet<>(new Comparator<String>() {
	@Override public int compare(String s1, String s2) {
		if (s1.length() == s2.length()) {
			return s1.compareTo(s2);
		}
		return s1.length() - s2.length();
	}
});
strings.addAll(Arrays.asList("yolanda", "zach", "alice", "bob"));
System.out.println("按照字符串长度排序：" + strings);
```
输出结果都是一样的。

# 总结

Java中Collection类自带的排序方法是一个很强大的工具。虽然它的子类Set不能按照顺序取出其中的元素，但其中的元素顺序也是可以更改的。


