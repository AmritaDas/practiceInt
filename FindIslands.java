
public class FindIslands {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindIslands f = new FindIslands();
		
		char mn[][] = {{'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
				{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', ' '},
				{' ', ' ', ' ', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' '},
				{' ', ' ', ' ', 'X', ' ', ' ', ' ', 'X', 'X', ' ', ' ', ' ', ' ', 'X', ' '},
				{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'}	};
		
		System.out.println("No. of islands: " + f.findIslands(mn));

	}

	int findIslands(char mn[][]){
		int r = mn.length, c = mn[0].length;
		int[][] visited = new int[r][c]; 
		int isle = 0;
		
		for(int i = 0; i<r; i++){
			for(int j = 0; j<c; j++){
				if(visited[i][j] != 1 && mn[i][j] == 'X'){
					visited[i][j] = 1;
					visited = dfs(mn, visited, i, j);
					isle++;
				}
			}
		}
		
		return isle;
	}

	int[][] dfs(char[][] mn, int[][] visited, int i, int j){
		
		int r = mn.length, c = mn[0].length;
		
		int k1 = 0, k2 = 0, k3 = 0, k4 = 0;
		
		if(i-1 >= 0){
			k1 = 1;
			if(visited[i-1][j] != 1 && mn[i-1][j]=='X'){
				visited[i-1][j] = 1;
				visited = dfs(mn, visited, i-1, j);
			}
		}
		
		if(j-1 >= 0){
			k2 = 1;
			if(visited[i][j-1] != 1 && mn[i][j-1]=='X'){
				visited[i][j-1] = 1;
				visited = dfs(mn, visited, i, j-1);
			}
		}
		
		if(k1==1 && k2==1){
			if(visited[i-1][j-1] != 1 && mn[i-1][j-1]=='X'){
				visited[i-1][j-1] = 1;
				visited = dfs(mn, visited, i-1, j-1);
			}
		}
		
		if(i+1 < r ){
			k3 = 1;
			if(visited[i+1][j] != 1 && mn[i+1][j]=='X'){
				visited[i+1][j] = 1;
				visited = dfs(mn, visited, i+1, j);
			}
		}
		
		if(j+1 < c){
			k4 = 1;
			if(visited[i][j+1] != 1 && mn[i][j+1]=='X'){
				visited[i][j+1] = 1;
				visited = dfs(mn, visited, i, j+1);
			}
		}
		
		if(k3==1 && k4==1){
			if(visited[i+1][j+1] != 1 && mn[i+1][j+1]=='X'){
				visited[i+1][j+1] = 1;
				visited = dfs(mn, visited, i+1, j+1);
			}
		}
		
		if(k2==1 && k3==1){
			if(visited[i+1][j-1] != 1 && mn[i+1][j-1]=='X'){
				visited[i+1][j-1] = 1;
				visited = dfs(mn, visited, i+1, j-1);
			}
		}
		
		if(k1==1 && k4==1){
			if(visited[i-1][j+1] != 1 && mn[i-1][j+1]=='X'){
				visited[i-1][j+1] = 1;
				visited = dfs(mn, visited, i-1, j+1);
			}
		}
		
		return visited;
	}

}
