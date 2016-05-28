package cc;

class Node4 {
	Node4 next;
	int data;
	
	Node4(int d){
		data = d;
	}
	
	void addNode(int d){
		Node4 end = new Node4(d);
		Node4 n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}
	
	void print(){
		Node4 n = this;
		System.out.print(n.data + "\t");
		while(n.next != null){
			System.out.print(n.next.data + "\t");
			n = n.next;
		}
		System.out.println();
	}
	
	int count(){
		Node4 n = this;
		int ct = 0;
		while(n != null){
			ct++;
			n = n.next;
		}
		return ct;
	}
	
	Node4 deleteNodeData(int d){
		Node4 head = this;
		if(head.data == d){
			return head.next;
		}
		else{
			while(head.next != null){
				if(head.next.data == d){
					head.next = head.next.next;
				}
				if(head.next != null)
					head = head.next;
			}
			return this;
		}
	}
	
	Node4 deleteNodePos(int p){
		Node4 head = this;
		if(p == 1){
			return head.next;
		}
		else if(p>1 && p <= count()){
			int ct = 1;
			while(head.next != null){
				if(p == ct+1){
					head.next = head.next.next;
					break;
				}
				head = head.next;
				ct++;
			}
		}
		return this;
	}
}

public class cc2o4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//partition around x, O(n)
		
		Node4 l = new Node4(11);
		l.addNode(12);
		l.addNode(14);
		l.addNode(15);
		l.addNode(8);
		l.addNode(9);
		l.addNode(11);
		l.addNode(12);
		l.addNode(7);
		
		l.print();
		
		int x = 11;	//10, 18, 6

		Node4 l1 = null, l2 = null, head = l;
		
		while(head != null){
			if(head.data < x){
				if(l1 == null){
					l1 = new Node4(head.data);
				}
				else{
					l1.addNode(head.data);
				}
			}
			else{
				if(l2 == null){
					l2 = new Node4(head.data);
				}
				else{
					l2.addNode(head.data);
				}
			}
			head = head.next;
		}
		
		head = l1;
		if(head == null)
			l1 = l2;
		else{
			while(head.next != null){
				head = head.next;
			}
			head.next = l2;
		}

		l1.print();
	}

}
