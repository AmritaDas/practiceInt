package cc;

import java.util.Arrays;

public class cc1o3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "khkg kg", b = "kgk hgk";
		
		if(a.length() != b.length()){
			System.out.println("no");
		}
		else{
			/*
			//sort both and see if equal O(n log n)
			char[] c = a.toCharArray();
			char[] d = b.toCharArray();
			Arrays.sort(c);
			Arrays.sort(d);
			
			int l = a.length();
			int m=0;
			for(int i=0; i<l; i++){
				if(c[i] != d[i]){
					m = 1;
					break;
				}
			}
				
			if(m == 0){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
			
			for(int i=0; i<l; i++){
				System.out.print(c[i]);
			}
			
			System.out.println();
			
			for(int i=0; i<l; i++){
				System.out.print(d[i]);
			}
			*/

			//check for chars and count of one, compare with other, O(n)
			
			int[] v1 = new int[256];
			int[] v2 = new int[256];
			
			for(int o = 0; o<a.length(); o++){
				int l = (int)a.charAt(o);
				v1[l]++;
				
				int m = (int)b.charAt(o);
				v2[m]++;
			}
			
			int n=0;
			
			
			for(int p = 0; p<256; p++){
				if(v1[p] != v2[p]){
					n = 1;
					break;
				}
			}
			
			if(n == 1){
				System.out.println("no");
			}
			else{
				System.out.println("yes");
			}

		}
		
	}

}
