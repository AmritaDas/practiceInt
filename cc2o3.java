package cc;

class Node3{
	Node3 next;
	int data;
	
	Node3(int d){
		data = d;
	}
	
	void addNode(int d){
		Node3 end = new Node3(d);
		Node3 n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}
	
	int count(){
		Node3 n = this;
		int ct = 1;
		while(n.next != null){
			n = n.next;
			ct++;
		}
		return ct;
	}
	
	Node3 deleteNode(int p){ //return head
		Node3 n = this;
		if(p == 1)
			return n.next;
		else if(p<=count() && p>1){
			int ct = 1;
			while(n.next != null){
				if(p == ct+1){
					n.next = n.next.next;
					break;
				}
				n = n.next;
				ct++;
			}
		}
		return this;
	}
	
	void print(){
		Node3 n = this;
		System.out.print(n.data + "\t");
		while(n.next != null){
			System.out.print(n.next.data + "\t");
			n = n.next;
		}
		System.out.println();
	}
	
	Node3 access(int p){
		Node3 n = this;
		if(p == 1)
			return this;
		else{
			int ct = 1;
			while(n.next != null && ct<p){
				n = n.next;
				ct++;
			}
		}
		return n;
	}
}

public class cc2o3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//delete node from middle of list, no access to head
		//need to copy data from next node and delete from next node instead
		//cannot be done if last element
		
		Node3 l = new Node3(11);
		l.addNode(12);
		l.addNode(13);
		l.addNode(14);
		l.addNode(15);
		
		l.print();
		
		l = l.deleteNode(3);
		
		l.print();
		
		Node3 m = l.access(2);
	
		System.out.println(m.data);
		
		m.data = m.next.data;
		m.next = m.next.next;
		
		l.print();
	}
}
