package cn.sherman.collection;

public class Student {
	String name;
    int age;
    String id;
    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
        System.out.println("������3�ѵ���"+"-"+name+"-"+age+"-"+id);
    }
    public Student(String name, int age) {
        this(name,0,null);
        System.out.println("������2�ѵ���"+"-"+name+"-"+age+"-"+id);
    }

    public Student(String name) {
        this(name,9);//��������,��ʹ�ò���Ĭ��ֵ��ȫ
        System.out.println("������1�ѵ���"+"-"+name+"-"+age+"-"+id);
    }
    //public Student
   // @Override
    public String toString() {
        return "Student [ id=" + id + ", name=" + name + ", age=" + age +"]";
    }
}