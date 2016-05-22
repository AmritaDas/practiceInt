package cc;

class Node{
	Node next = null;
	int data;
	
	public Node(int d){
		data = d;
	}
	
	void addNode(int d){
		Node end = new Node(d);
		Node n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}
	
	Node deleteNode(Node head, int d){	//returns head
		
		Node n = head;
		
		if(head.data == d){
			return head.next;
		}
		else{
			while(n.next != null){
				if(n.next.data == d){
					n.next = n.next.next;
					return head;
				}
				n = n.next;
			}
		}
			
		return head;
	}
	
	void print(){
		Node n = this;
		System.out.print(n.data + "\t");
		while(n.next!=null){
			System.out.print(n.next.data + "\t");
			n = n.next;
		}
		System.out.println();
	}
}

public class cc2o0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//runner technique on -> a1-a2-a3-b1-b2-b3 becomes a1-b1-a2-b2-a3-b3
		Node l = new Node(11);
		l.addNode(12);
		l.addNode(13);
		l.addNode(14);
		l.addNode(21);
		l.addNode(22);
		l.addNode(23);
		l.addNode(24);
		
		l.print();
		
		Node p1 = l, p2 = l;
		int ct = 0;
		
		while((p1=p1.next).next != null){
			p1 = p1.next;
			p2 = p2.next;
			ct++;
		}
		
		p1 = l;
		
		//p1 11, p2 14
		//t 12, r 21, 14->22, 11->21, 21->12, p1 12, p2 22
		//11 21 12 13 14 22 23 24
		//p1 12 p2 22
		//t 13, r 23, p2 
		
		for(int i=0; i<ct; i++){
			System.out.println("ct " + (i+1));
			Node t = p1.next;
			System.out.println("t " + t.data);
			Node r = p2.next;
			System.out.println("r " + r.data);
			p2.next = p2.next.next;
			System.out.println("p2.next " + p2.next.data);
			p1.next = r;
			System.out.println("p1.next " + p1.next.data);
			r.next = t;
			System.out.println("r.next " + r.next.data);
			p1 = t;
			System.out.println("p1 " + p1.data);
			//p2 = p2.next;
			System.out.println("p2 " + p2.data + "\n");
		}
		
		l.print();
		
	}

}






