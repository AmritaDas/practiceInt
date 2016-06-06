package cc;

import java.util.ArrayList;
import java.util.Stack;

public class cc3o3 {

	int capacity = 3;
	
	ArrayList<Stack<Integer>> sl = new ArrayList<Stack<Integer>>();
	int stnum = -1, stpos = -1;
	
	public void push(int i){
		if(stpos == -1){
			Stack<Integer> s = new Stack<Integer>();
			s.push(i);
			sl.add(s);
			stnum++;
			stpos++;
		}
		else{
			Stack<Integer> s = sl.get(stnum);
			s.push(i);
			stpos++;
			if(stpos == capacity-1)
				stpos = -1;
		}
	}
	
	Integer pop(){
		if(stnum == -1 && stpos == -1){
			return null;
		}
		else{
			Stack<Integer> s = sl.get(sl.size()-1);
			int i = s.pop();
			if(s.isEmpty()){
				stnum--;
				stpos--;
				sl.remove(sl.size()-1);
			}
			else{
				if(stpos == -1){
					stpos = capacity - 2;
				}
				else{
					stpos--;
				}
			}
			return i;
		}
	}
	
	Integer popAt(int sn){
		if(sn-1 > stnum){
			return null;
		}
		else{
			Stack<Integer> s = sl.get(sn-1);
			int i = s.pop();
			int j = sn-1;
			while(j < stnum){
				Stack<Integer> sb = sl.get(j+1);
				int k = sb.remove(0);
				s.push(k);
				j++;
				s = sb;
			}

			if(stpos == -1){
				stpos = capacity - 2;
			}
			else{
				if(stpos == 0){
					stnum--;
					sl.remove(sl.size()-1);
				}
				stpos--;
			}
				
			return i;	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cc3o3 c = new cc3o3();
		c.push(4);
		c.push(2);
		c.push(6);
		c.pop();
		c.push(5);
		c.push(1);
		c.push(3);
		c.push(10);
		c.pop();
		c.push(20);
		c.push(667);
		//c.push(345);
		//c.push(987);
		c.popAt(3);
		c.push(78);
		
		for(int k=0; k<c.sl.size(); k++){
			for(Integer i : c.sl.get(k)){
				System.out.println(k + " " + i);
			}
		}
		
	}

}
