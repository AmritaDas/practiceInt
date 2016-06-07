package cc;

import java.util.Stack;

public class cc3o5 {

	//fifo
	Stack<Integer> first, last;
	
	cc3o5(){
		first = new Stack<Integer>();
		last = new Stack<Integer>();
	}
	
	void push(int i){
		last.push(i);
	}
	
	void mover(){
		if(first.isEmpty()){
			while(!last.isEmpty()){
				first.push(last.pop());
			}
		}
	}
	
	void print(){
		mover();
		for(Integer i : first){
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	
	Integer pop(){
		mover();
		if(!first.isEmpty()){
			int i = first.pop();
			return i;
		}
		else
			return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//queue from 2 stacks
		
		cc3o5 c = new cc3o5();
		c.push(5);
		c.push(2);
		c.push(7);
		c.push(1);
		c.push(4);
		
		c.print();
		
		c.pop();
		c.pop();
		
		c.print();
		
	}

}
