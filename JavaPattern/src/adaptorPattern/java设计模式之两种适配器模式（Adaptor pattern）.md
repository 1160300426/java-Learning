目录

[TOC]

# 前言
之前介绍的委托与继承是代码复用的两种方式，然而，它们的复用过于“基础”和“细小”，除了类本身，设计模式更强调多个类/对象之间的关系和交互过程---比接口/类复用的力度更大。
# 类别
设计模式分为三大类：

* Creational patterns 创建型模式：

	主要考虑对象的创建过程。
	
* Structural patterns 结构型模式：

	处理类和对象之间的组合。 
	
* Behavioral patterns 行为型模式：

	描述类或对象交互和分配责任的方式。 
	

# Adapter（适配器模式）

适配器模式属于结构型设计模式，它是用来将某个类/接口转换为客户端程序员期望的其他形式。如果有一个类与需要使用的接口不匹配时，可以使用适配器将这个类封装一层，使其可以使用接口中的方法。

适配器模式有两种方式，一种是使用继承（Inheritance），称为类适配器；另一种是使用委派（Delegation），称为对象适配器。有关继承和委派的概念，可以点击[这里](https://blog.csdn.net/Seriousplus/article/details/80462722)

下面通过具体的例子分别来看一下这两种适配器模式。

# 类适配器

类适配器是利用继承来实现适配的，看下面的一段代码：
<br>

现在有一个漂亮女孩的类，其中有一个方法是用来得到这个女孩的电话号码的，方法名为getMyPhonenumber：

```
public class BeautifulGirl {
	public String getMyPhonenumber() {
		return "1**********";
	}
}
```
然后又有一个单身狗的接口，其中有一个方法是用来得到漂亮女孩的电话号码，方法名为getBeautifulGirlsPhonenumber：

```
public interface SingleDog {
	public String getBeautifulGirlsPhonenumber();
}
```
如果现在需要利用该接口的API，但是需要调用BeautifulGirl类的方法，两种方法的功能相同，因此需要结合起来，此时就需要一个适配器，将二者结合起来。

适配器代码如下：

```
public class Adaptor extends BeautifulGirl implements SingleDog {
	@Override
	public String getBeautifulGirlsPhonenumber() {
		return getMyPhonenumber();
	}
}
```
这样，在该适配器这个类中，可以使用这个接口中的方法，将这个不兼容类的方法名与接口中的方法名统一起来了，这就完成了适配功能。

在Adaptor类中调用的接口中的方法名，就是间接地调用BeautifulGirl类中的不同名方法。只是由于二者API不统一，因此，在外面封装了一层，将它们的API统一了起来。

此外，利用继承实现的适配器模式还能够在这个适配器中保留有这个不兼容类中的方法。也就是说，在Adaptor类中，要得到漂亮女孩的电话号码，既可以调用getBeautifulGirlsPhonenumber方法，也可以调用getMyPhonenumber方法。

# 对象适配器

对象适配器的功能也是将与接口不兼容的类进行封装，使它们的API一致。只不过，对象适配器是基于委派机制，而不是继承机制。简单地说，就是对象适配器是类之间的一种组合方式，详细介绍请看下面代码：

这里还是一个SingleDog接口和BeautifulGirl类：

```
public interface SingleDog {
	public String getBeautifulGirlsPhonenumber();
}
```

```
public class BeautifulGirl {
	public String getMyPhonenumber() {
		return "1**********";
	}
}
```

现在他们的方法功能相同，但名称不同，我们需要统一他们的名称，只是利用接口中的方法名。
这里我们为了统一，创建一个适配器类，用于封装该类：

```
public class DelegationAdaptor implements SingleDog {
	BeautifulGirl beautifulGirl = new BeautifulGirl();
	@Override
	public String getBeautifulGirlsPhonenumber() {
		return beautifulGirl.getMyPhonenumber();
	}
}
```

可以看到，这个适配器类也将二者的API统一起来了，但是这里并没有利用继承机制，而是使用了委派中组合的方式，将不兼容的类进行包装，实现了适配功能。

# 总结

两种适配器模式都是将不能使用的类包装一层，从而实现API的统一。单独来看，二者并没有什么本质区别，如果没有其他特别要求，二者可以互换。但是具体使用哪一个，还要根据具体项目来看。