package eat;

import java.util.ArrayList;
import java.util.List;

import extendClass.Apple;
import extendClass.Banana;
import extendClass.Fruit;

public class EatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EatFruit<Apple> eatFruit = new EatFruit<>();
		//»á±¨´í.
//		Banana banana = new Banana("ba", 10);
//		System.out.println(eatFruit.isApple(banana));
		Apple apple = new Apple("Apple_1", 10);
		System.out.println(eatFruit.isApple(apple));
		
		
		Apple fruitAple = new Apple("alp", 15);
		Fruit fruit = (Fruit)fruitAple;
		System.out.println(fruit.getClass().getName());
		
		List<Fruit> list = new ArrayList<>();
		list.add(fruitAple);
		list.add(apple);
		for (Fruit fruit2 : list) {
			System.out.println(fruit2.getClass().getName());
		}
	}
}
