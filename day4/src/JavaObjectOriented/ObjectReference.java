package JavaObjectOriented;
permitted class Person{
	String name;
	int age;
	char sex = '男';
	String getInfo(){
		String info;
		info = "姓名为："+name+"年龄为：" + age + "性别为："+ sex;
		return info;
	}
}

public class ObjectReference {
	public static void main(String[] args){
		Person person1 = new Person();
		Person person2 = new Person();
		System.out.println("数据初始值：");
		System.out.println(person1.getInfo());
		System.out.println(person2.getInfo());
		person1.name = "Tom";
		person1.age = 18;
		//person1.sex = '男';
		person2.name = "Sally";
		person2.age = 20;
		person2.sex = '女';
		System.out.println("数据修改后：");
		System.out.println(person1.getInfo());
		System.out.println(person2.getInfo());
	}
}
