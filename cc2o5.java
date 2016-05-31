package cc;

class Node5 {
	Node5 next;
	int data;
	
	Node5(int d){
		data = d;
	}
	
	void addNode(int d){
		Node5 end = new Node5(d);
		Node5 n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}
	
	void print(){
		Node5 n = this;
		System.out.print(n.data + "\t");
		while(n.next != null){
			System.out.print(n.next.data + "\t");
			n = n.next;
		}
		System.out.println();
	}
	
	int count(){
		Node5 n = this;
		int ct = 0;
		while(n != null){
			ct++;
			n = n.next;
		}
		return ct;
	}
	
	Node5 deleteNodeData(int d){
		Node5 head = this;
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
	
	Node5 deleteNodePos(int p){
		Node5 head = this;
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

public class cc2o5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//617+295 = 912 repped as 7->1->6 + 5->9->2 = 2->1->9, O(n)
		
		Node5 l1 = new Node5(3);
		l1.addNode(7);
		l1.addNode(1);
		l1.addNode(6);
		
		Node5 l2 = new Node5(5);
		l2.addNode(9);
		l2.addNode(2);
		
		int m1 = 0, m2 = 0; 
		
		Node5 head = l1;
		for(int i=0; i<l1.count(); i++){
			m1 += head.data * Math.pow(10, i);
			head = head.next;
		}
		
		head = l2;
		for(int i=0; i<l2.count(); i++){
			m2 += head.data * Math.pow(10, i);
			head = head.next;
		}
		
		String m = new Integer(m1+m2).toString();
		
		Node5 l = null;
		
		for(int i=0; i<m.length(); i++){
			int c = Character.getNumericValue(m.charAt(m.length()-1-i));
			if(i==0){
				l = new Node5(c);
			}
			else{
				l.addNode(c);
			}
		}
		
		l.print();

	}

}
