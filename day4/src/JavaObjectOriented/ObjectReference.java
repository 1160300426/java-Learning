package JavaObjectOriented;
permitted class Person{
	String name;
	int age;
	char sex = '��';
	String getInfo(){
		String info;
		info = "����Ϊ��"+name+"����Ϊ��" + age + "�Ա�Ϊ��"+ sex;
		return info;
	}
}

public class ObjectReference {
	public static void main(String[] args){
		Person person1 = new Person();
		Person person2 = new Person();
		System.out.println("���ݳ�ʼֵ��");
		System.out.println(person1.getInfo());
		System.out.println(person2.getInfo());
		person1.name = "Tom";
		person1.age = 18;
		//person1.sex = '��';
		person2.name = "Sally";
		person2.age = 20;
		person2.sex = 'Ů';
		System.out.println("�����޸ĺ�");
		System.out.println(person1.getInfo());
		System.out.println(person2.getInfo());
	}
}
