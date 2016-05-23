package cc;

import java.util.ArrayList;
import java.util.Hashtable;

class Node1 {
	Node1 next;
	int data;
	
	Node1(int d){
		data = d;
	}
	
	void addNode(int d){
		Node1 end = new Node1(d);
		Node1 n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}
	
	void print(){
		Node1 n = this;
		System.out.print(n.data + "\t");
		while(n.next != null){
			System.out.print(n.next.data + "\t");
			n = n.next;
		}
		System.out.println();
	}
}

public class cc2o1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//remove duplicates
		
		Node1 l = new Node1(11);
		l.addNode(11);
		l.addNode(12);
		l.addNode(13);
		l.addNode(11);
		l.addNode(12);
		l.addNode(14);
		l.addNode(15);
		l.addNode(12);
		
		l.print();
		
		//ArrayList<Integer> a = new ArrayList<Integer>();
		//using hashtable instead because containskey is less expensive than arraylist contains
		Hashtable<Integer, Boolean> h = new Hashtable<Integer, Boolean>();
		
		Node1 prev = null;
		Node1 oth = l, head = l;

		//with buffer
		/*while(head != null){
			if(!h.containsKey(head.data)){
				h.put(head.data, true);
				prev = head;
			}
			else{
				prev.next = head.next;
			}
			head = head.next;
		}*/

		//no buffer
		int ct = 0, ct2 = 0, m = 0;
		if(l.next != null){
			prev = head;
			head = l.next;
			
			while(head != null){
				ct++;
				while(oth != null && ct2 < ct){
					ct2++;
					if(oth.data == head.data){
						m = 1;
						break;
					}
					oth = oth.next;
				}
				
				if(m == 1){
					prev.next = head.next; 
					ct--;
				}
				else{
					prev = head;
				}
				
				oth = l;
				ct2 = 0;
				m = 0;
				head = head.next;
			}
		}		
		
		l.print();
		
	}

}
