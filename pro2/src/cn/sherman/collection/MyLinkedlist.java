package cn.sherman.collection;



/**��дlinkedlist��
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
				throw new Exception("���������ֵ���Ϲ�");
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
	public int getsize() {
		return size;
	}
	public void add(Object obj) {
		Node n = new Node();
		//���ж��Ƿ����׸��ڵ�
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
	//����ָ������ȡֵ
	public Object getvalue(int index) {
		indexCheck(index);
		Node temp = node(index);
		return temp.item;
	}
	public Node node(int index) {
		indexCheck(index);
		Node temp =null;
		//Ϊ��߱���Ч�ʣ���size���ж԰��жϣ������ɼ���һ���������
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

 
