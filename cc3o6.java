package cc;

import java.util.Stack;

public class cc3o6 {

	Stack<Integer> sort(Stack<Integer> s){
		Stack<Integer> r = new Stack<Integer>();
		
		while(!s.isEmpty()){
			int i = s.pop();
			while(!r.isEmpty() && r.peek() > i){
				s.push(r.pop());
			}
			r.push(i);
		}
		
		return r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s = new Stack<Integer>();
		s.push(3);
		s.push(1);
		s.push(7);
		s.push(12);
		s.push(8);
		s.push(10);
		s.push(5);
		
		for(Integer i : s){
			System.out.print(i + "\t");
		}
		System.out.println("\n");
		
		Stack<Integer> r = new cc3o6().sort(s);
		//r.pop();
		
		for(Integer i : r){
			System.out.print(i + "\t");
		}
		System.out.println("\n");

	}

}
