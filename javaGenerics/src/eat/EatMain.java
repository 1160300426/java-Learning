package eat;

import extendClass.Apple;
import extendClass.Banana;

public class EatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EatFruit<Apple> eatFruit = new EatFruit<>();
		//�ᱨ��.
//		Banana banana = new Banana("ba", 10);
//		System.out.println(eatFruit.isApple(banana));
		Apple apple = new Apple("Apple_1", 10);
		System.out.println(eatFruit.isApple(apple));
	}
}
