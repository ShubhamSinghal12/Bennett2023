package Lec16;

public class MazePathCBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean grid[][] = new boolean[3][3];
		mp(grid,0, 0, "");

	}
	
	public static void mp(boolean[][] grid,int cr,int cc,String ans)
	{
		if(cr == grid.length-1 && cc == grid[0].length-1)
		{
			System.out.println(ans);
		}
		else if(cr < 0 || cr >= grid.length || cc >= grid[0].length || cc < 0 || grid[cr][cc])
		{
			return;
		}
		else
		{
			grid[cr][cc] = true;
			
			mp(grid ,cr, cc+1,  ans+"R");
			mp(grid ,cr+1, cc,  ans+"D");
			mp(grid ,cr, cc-1,  ans+"L");
			mp(grid ,cr-1, cc,  ans+"U");
			
			grid[cr][cc] = false; // Backtracking
			
		}
	}

}
