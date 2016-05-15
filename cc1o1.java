package cc;

public class cc1o1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String k = "pjvk hcvkhhv";
		
		//O(n) check in the 256 char range
		//assuming ascii
		boolean[] v = new boolean[256];
		for(int i=0; i<k.length(); i++){
			int m = (int)k.charAt(i);
			if(!v[m]){
				v[m] = true;
			}
			else{
				System.out.println("found: " + k.substring(i) + " " + m);
				break;
			}
		}
		
		/* O(n2) compare every char to every subsequent char
		int m = 0;
		for(int i=0; i<k.length()-1; i++){
			for(int j=i+1; j<k.length(); j++){
				if(k.charAt(i) == k.charAt(j)){
					m = 1;
					break;
				}
			}
			if(m == 1){
				System.out.println("found: " + k.substring(i));
				break;
			}
		}
		*/
	}

}
