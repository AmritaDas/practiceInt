package cc;

class Node2{
	Node2 next;
	int data;
	
	Node2(int d){
		data = d;
	}
	
	void addNode(int d){
		Node2 end = new Node2(d);
		Node2 n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}
	
	void print(){
		Node2 n = this;
		System.out.print(n.data + "\t");
		while(n.next != null){
			System.out.print(n.next.data + "\t");
			n = n.next;
		}
		System.out.println();
	}

}

public class cc2o2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find kth to last element, O(n)

		Node2 l = new Node2(11);
		l.addNode(12);
		l.addNode(13);
		l.addNode(14);
		l.addNode(11);
		l.addNode(15);
		
		l.print();
		
		int k = 3;
		
		Node2 head = l;
		int ct = 0;
		
		if(head != null){
			ct = 1;
		}
		else{
			return;
		}

		while(head.next != null){
			head = head.next;
			ct++;
		}
		
		head = l;
		
		int i=0;
		while(i < ct-k){
			head = head.next;
			i++;
		}
		
		System.out.println(head.data);
	}

}
