package cc;

public class cc1o8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "waterbottle", b = "bottlewater"; //watwat atwatw
		
		//check for rotation, O(n)
		
		if(a.length() != b.length()){
			System.out.println("no");
		}
		else{
			int m = 1;
			for(int k=0; k<b.length(); k++){
				if(a.charAt(0) == b.charAt(k)){
					String c = b.substring(k);
					String d = c + b.substring(0, k);
					if(d.equals(a)){
						System.out.println("yes");
						m = 0;
						break;
					}
				}
			}
			if(m == 1){
				System.out.println("no");
			}
		}
		
		/*//double and check for substring
		String c = b+b;
		if(isSubstring(c, a)){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}*/
	}

}
