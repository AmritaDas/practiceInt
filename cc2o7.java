package cc;

class Node7 {
	Node7 next;
	int data;
	
	Node7(int d){
		data = d;
	}
	
	void addNode(int d){
		Node7 end = new Node7(d);
		Node7 n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}
	
	void print(){
		Node7 n = this;
		System.out.print(n.data + "\t");
		while(n.next != null){
			System.out.print(n.next.data + "\t");
			n = n.next;
		}
		System.out.println();
	}
	
	int count(){
		Node7 n = this;
		int ct = 0;
		while(n != null){
			ct++;
			n = n.next;
		}
		return ct;
	}
	
	int pop(){
		Node7 n = this, prev = null;
		while(n.next != null){
			prev = n;
			n = n.next;
		}
		int p = n.data;
		prev.next = null;
		return p;
	}
	
	Node7 deleteNodeData(int d){
		Node7 head = this;
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
	
	Node7 deleteNodePos(int p){
		Node7 head = this;
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
public class cc2o7 {

	void isPalindrome(Node7 l){
		Node7 head = l, oth = l;
		
		int len = (int)Math.floor(l.count()/2);
		int m = 0;
		
		for(int i=0; i<len; i++){
			int j = oth.pop();
			if(!(head.data == j)){
				m = 1;
				break;
			}
			head = head.next;
		}
		
		if(m == 1){
			System.out.println("not a palindrome");
		}
		else{
			System.out.println("palindrome");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//palindrome check, O(n)
		
		Node7 l = new Node7(1);
		l.addNode(3);
		l.addNode(5);
		l.addNode(2);
		//l.addNode(4);
		l.addNode(4);
		l.addNode(2);
		l.addNode(5);
		l.addNode(3);
		l.addNode(1);
		
		new cc2o7().isPalindrome(l);

		l.print();
	}

}
