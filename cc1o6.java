package cc;

public class cc1o6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mg = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30},{31,32,33,34,35,36}};
		
		//int[][] mg = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		
		//rotate right by 90 deg, in place, O(n2)(?)
		
		//first turn should move all edge elements - 1 to 6, 7, 12, 13, 18, 19, 24, 25, 30, 31 to 36
		//second turn should move all 2nd to edge elements - 8 to 11, 14, 17, 20, 23, 26 to 29
		//third turn should move all 3rd to edge elements - 15, 16, 21, 22
		
		//first turn
		//00, 01, 02, 03, 04 become 05, 15, 25, 35, 45
		//05, 15, 25, 35, 45 become 55, 54, 53, 52, 51
		//55, 54, 53, 52, 51 become 50, 40, 30, 20, 10
		//50, 40, 30, 20, 10 become 00, 01, 02, 03, 04
		//second turn
		//11, 12, 13 become 14, 24, 34
		//14, 24, 34 become 44, 43, 42
		//44, 43, 42 become 41, 31, 21
		//41, 31, 21 become 11, 12, 13
		//third turn
		//22 becomes 23
		//23 becomes 33
		//33 becomes 32
		//32 becomes 22
		
		//if 5x5, 1 to 5, 6 to 10, 11 to 15, 16 too 20, 21 to 25
		//first turn should move all edge elements - 1 to 5, 6, 10, 11, 15, 16, 20, 21 to 25
		//second turn should move all 2nd to edge elements - 7, 8, 9, 12, 14, 17, 18, 19
		//no third turn reqd for 13
		
		int nt = (int) Math.floor(mg[0].length/2); //no of turns
		int mk = mg[0].length-1; //nos to turn
		int col = mg[0].length-1; //col len
		
		//r gets c, c gets 5-r
		
		//to rotate left
		//int temp = mg[r][c];
		//mg[r][c] = mg[c][col-r];
		//mg[c][col-r] = mg[col-r][col-c];
		//mg[col-r][col-c] = mg[col-c][r];
		//mg[col-c][r] = temp;
		
		for(int i=0; i<nt; i++){
			int r = i, c = i;
			for(int j=0; j<mk; j++, c++){  
				//rotate right
				int temp = mg[r][c];
				mg[r][c] = mg[col-c][r];
				mg[col-c][r] = mg[col-r][col-c];
				mg[col-r][col-c] = mg[c][col-r];
				mg[c][col-r] = temp;
			}
			mk -= 2;
		}
		
		for(int k = 0; k<mg[0].length; k++){
			for(int l = 0; l<mg[0].length; l++){
				System.out.print(mg[k][l] + "\t");
			}
			System.out.println("\n");
		}
	}

}
