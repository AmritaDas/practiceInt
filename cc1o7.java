package cc;

public class cc1o7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mg = {{1,2,3,4},{5,0,7,8},{9,10,11,12},{13,14,15,0},{17,18,19,20}};
		
		//set row+col to 0 if some elem 0, O(mn)
		
		boolean[] rz = new boolean[5];
		boolean[] cz = new boolean[4];

		for(int k = 0; k<5; k++){
			for(int l = 0; l<4; l++){
				if(mg[k][l] == 0){
					rz[k] = true;
					cz[l] = true;
				}
			}
		}

		for(int k = 0; k<5; k++){
			for(int l = 0; l<4; l++){
				if(rz[k] == true || cz[l] == true){
					mg[k][l] = 0;
				}
			}
		}
		
		for(int k = 0; k<5; k++){
			for(int l = 0; l<4; l++){
				System.out.print(mg[k][l] + "\t");
			}
			System.out.println("\n");
		}

	}

}
