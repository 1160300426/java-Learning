package eat;


import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import extendClass.Apple;
import extendClass.Fruit;

public class EatFruit<L extends Fruit> {
//	public boolean eatFruit(L fruit) {
//		
//	}
	public boolean isApple(L fruit) {
		List<L> list = new ArrayList<>();
		list.add(fruit);
		//��ȡ���ͣ�ʧ�ܡ�
//		ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
//		parameterizedType.getActualTypeArguments();
//		System.out.println(parameterizedType.getActualTypeArguments());
		//�ɹ�
		System.out.println(fruit.getClass().getName());
		System.out.println(list.get(0).getClass().getName().toString());
		return true;
		
	}
	
}
