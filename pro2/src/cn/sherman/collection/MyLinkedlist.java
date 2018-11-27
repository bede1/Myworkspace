package cn.sherman.collection;



/**手写linkedlist类
 * 
 * @author Auser
 *
 */
public class MyLinkedlist  {
	Object element ;
	Node first;
	Node last;
	int size;
	
	public MyLinkedlist() {
		
	}
	private void indexCheck(int index)  {
		if(index<0||index>size-1) {
			try {
				throw new Exception("输入的索引值不合规");
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
	public int getsize() {
		return size;
	}
	public void add(Object obj) {
		Node n = new Node();
		//先判断是否有首个节点
		if (first==null) {
			n.setPrev(null);
			n.setnext(null);
			n.setItem(obj);
			first = n;
			last = n;
		}
		else {
			n.setPrev(last);
			n.setItem(obj);
			n.setnext(null);
			last.setnext(n);
			last = n;
		}
		size++;
	}
	//根据指导索引取值
	public Object getvalue(int index) {
		indexCheck(index);
		Node temp = node(index);
		return temp.item;
	}
	public Node node(int index) {
		indexCheck(index);
		Node temp =null;
		//为提高遍历效率，对size进行对半判断，这样可减少一半的运算量
		if (index <=(size>>1)) {
			temp = first;
			for(int i = 0;i<index;i++) {
				temp = temp.next;
			}
		}
		else {
			temp = last;
			for(int i =size-1;i>index;i--) {
				temp = temp.prev;
			}
		}
		return temp;
	}
	public void remove(int index) {
		Node temp =node(index);
		if(temp!=null) {
			
		}
	}
	
}

 
