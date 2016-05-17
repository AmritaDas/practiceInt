package cc;

public class cc1o4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] mv = new char[100];
		mv[0] = 'M';
		mv[1] = 'r';
		mv[2] = ' ';
		mv[3] = 'J';
		mv[4] = 'o';
		mv[5] = 'h';
		mv[6] = 'n';
		mv[7] = ' ';
		mv[8] = 'S';
		mv[9] = 'm';
		mv[10] = 'i';
		mv[11] = 't';
		mv[12] = 'h';
		mv[13] = ' ';
		
		new cc1o4().rpsp(mv, 14);
	}
	
	
	//replace from end of string, O(n)
	
	void rpsp(char[] mv, int len){
		
		int sc = 0;
		
		for(int i=0; i<mv.length; i++){
			if(mv[i] == ' '){
				sc++;
			}
		}

		int fl = len + sc*2;
		
		for(int j = fl-1, k = len-1; k>=0; j--, k--){
			if(mv[k] != ' '){
				mv[j] = mv[k];
			}
			else{
				mv[j] = '0';
				mv[--j] = '2';
				mv[--j] = '%';
			}
		}
		
		for(int l=0; l<fl; l++){
			System.out.print(mv[l]);
		}
	}

}
