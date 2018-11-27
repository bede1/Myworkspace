package cn.sherman.collection;
/**
 * ≤‚ ‘this
 * @author Auser
 *
 */
public class StudentDemo {
	public static void main(String[]args) {
		Student stu1 = new Student("sherman");
		System.out.println(stu1);
		System.out.println("#########");
		Student stu2 = new Student("sher",30);
		System.out.println(stu2);
		System.out.println("!!!!!!!!!");
		Student stu3 = new Student("man",20,"iou");
		System.out.println(stu3);
	}
}
