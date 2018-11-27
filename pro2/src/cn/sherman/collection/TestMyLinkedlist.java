package cn.sherman.collection;
/**
 * ²âÊÔÊÖĞ´µÄmylinkedlist
 * @author Auser
 *
 */
public class TestMyLinkedlist {
	public static void main(String[]args) {
		MyLinkedlist mylink = new MyLinkedlist();
		mylink.add("aa");
		mylink.add("bb");
		mylink.add("cc");
		Object tvalue = (Object)mylink.getvalue(2);
		
		System.out.println(mylink.node(0));

		System.out.println(mylink.node(1));

		System.out.println(mylink.node(2));
		System.out.println(tvalue);
	}
}
