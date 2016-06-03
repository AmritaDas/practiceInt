package cc;

class Node30 {
	Node30 next;
	int data;
	
	Node30(int d){
		data = d;
	}
}

class Stack0{
	//lifo
	Node30 top;
	
	void push(int i){
		Node30 t = new Node30(i);
		t.next = top;
		top = t;
	}
	
	Object pop(){
		if(top != null){
			int i = top.data;
			top = top.next;
			return i;
		}
		return null;
	}
	
	Object peek(){
		if(top != null){
			return top.data;
		}
		return null;
	}
	
	void print(){
		Node30 h = top;
		if(h != null){
			System.out.print(h.data + "\t");
			while(h.next != null){
				System.out.print(h.next.data + "\t");
				h = h.next;
			}
			System.out.println();
		}
	}
}

class Queue{
	//fifo
	Node30 first, last;
	
	void push(int i){
		if(first == null){
			first = new Node30(i);
			last = first;
		}
		else{
			last.next = new Node30(i);
			last = last.next;
		}
	}
	
	Object pop(){
		if(first != null){
			int i = first.data;
			first = first.next;
			return i;
		}
		return null;
	}
	
	void print(){
		Node30 h = first;
		if(h != null){
			System.out.print(h.data + "\t");
			while(h.next != null){
				System.out.print(h.next.data + "\t");
				h = h.next;
			}
			System.out.println();
		}
	}
}

public class cc3o0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack0 s = new Stack0();
		s.push(3);
		s.push(7);
		s.push(5);
		s.push(9);
		s.push(1);
		
		s.print();
		
		System.out.println(s.peek());
		
		s.pop();
		s.pop();
		
		s.print();
		
		Queue q = new Queue();
		q.push(4);
		q.push(8);
		q.push(6);
		q.push(0);
		q.push(2);
		
		q.print();
		
		q.pop();
		q.pop();
		
		q.print();
	}

}
