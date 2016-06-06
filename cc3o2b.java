package cc;

import java.util.Iterator;
import java.util.Stack;

class Stack1 extends Stack<Integer>{
	Stack<Integer> ss;
	
	Stack1(){
		ss = new Stack<Integer>();
	}
	
	void push(int i){
		if(i <= min()){
			ss.push(i);
		}
		super.push(i);
		
		//print();
	}
	
	public Integer pop(){	//overriding
		int i = super.pop();
		if(i == min()){
			ss.pop();
		}
		return i;
	}
	
	Integer min(){
		if(ss.isEmpty()){
			return Integer.MAX_VALUE;
		}
		else{
			return ss.peek();
		}
	}
	
	void print(){
		
		System.out.println("\nss");
		for(Integer i : ss){
			System.out.print(i + "\t");
		}
		
		System.out.println("\nsuper");
		Iterator<Integer> it = super.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + "\t");
		}
	}
	
}

public class cc3o2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack1 s = new Stack1();
		s.push(5);
		s.push(7);
		s.push(2);
		s.push(3);
		s.push(1);
		
		s.print();
		
		System.out.println("\n" + s.min());
		
		s.pop();
		
		s.print();
		
		System.out.println("\n" + s.min());
		
	}

}
