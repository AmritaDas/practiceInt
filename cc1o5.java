package cc;

public class cc1o5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ab = "aabcccccaaad";//"abcde";
		StringBuffer fn = new StringBuffer("");
		
		int ct = 1, j;
		
		//check upwards till len-2, O(n)
		
		for(j=0; j<ab.length()-1; j++){
			if(ab.charAt(j+1) == ab.charAt(j)){
				ct++;
			}
			else{
				fn.append(ab.charAt(j) + "" + ct);
				ct = 1;
			}
		}
		fn.append(ab.charAt(j) + "" + ct);
		
		System.out.println(ab.length() < fn.length() ? ab : fn);
	}

}
