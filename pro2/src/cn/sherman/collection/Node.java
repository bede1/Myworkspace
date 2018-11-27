package cn.sherman.collection;
/**
 * ≤‚ ‘Node
 * @author Auser
 *
 */
public class Node {
	Object item;
	Node prev;
	Node next;
	public Node() {
	
	}
	public Node(Object item, Node prev, Node next) {
		super();
		this.item = item;
		this.prev = prev;
		this.next = next;
	}
	public Object getItem() {
		return item;
	}
	public void setItem(Object item) {
		this.item = item;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public Node getnext() {
		return next;
	}
	public void setnext(Node next) {
		this.next = next;
	}
}

