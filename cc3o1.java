package cc;

public class cc3o1 {

	int stsz = 10;
	int[] stnumpos = {-1,-1,-1}; //st nums 1,2,3
	int[] star = new int[3*stsz];

	void push(int s, int i){
		star[(s-1)*stsz + ++stnumpos[s-1]] = i;
	}
	
	Object pop(int s){
		if(stnumpos[s-1] == -1)
			return null;
		else{
			int i = star[(s-1)*stsz + stnumpos[s-1]];
			star[(s-1)*stsz + stnumpos[s-1]] = 0;
			stnumpos[s-1]--;
			return i;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3 stacks in one array, O(1)
		
		cc3o1 c = new cc3o1();
		c.push(1, 10);
		c.push(1, 11);
		c.push(1, 12);
		c.push(2, 20);
		c.push(2, 21);
		c.push(2, 22);
		c.push(3, 30);
		c.push(3, 31);
		c.push(3, 32);
		
		System.out.println(c.pop(2) + " " + c.pop(2));
		
		c.push(2, 24);
		c.push(2, 25);
		
		for(int i=0; i<30; i++){
			System.out.println(c.star[i]);
		}
	}

}
