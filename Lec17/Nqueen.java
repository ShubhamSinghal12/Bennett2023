package Lec17;

public class Nqueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] board = new boolean[n][n];
		nQueens(board, 0, n, "");

	}
	
	public static boolean isItPossible(boolean[][] board,int cr,int cc)
	{
		int i = cr;
		while(i >= 0)
		{
			if(board[i][cc])
			{
				return false;
			}
			i--;
		}
		
		int j = cc;
		while(j >= 0)
		{
			if(board[cr][j])
			{
				return false;
			}
			j--;
		}
		
		i = cr;
		j = cc;
		while(i >= 0 && j >= 0)
		{
			if(board[i][j])
			{
				return false;
			}
			i--;
			j--;
		}
		
		i = cr;
		j = cc;
		while(i >= 0 && j < board[0].length)
		{
			if(board[i][j])
			{
				return false;
			}
			i--;
			j++;
		}
		return true;
	}
	
	public static void nQueens(boolean[][] board,int qpsf,int tq,String ans)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int j = 0; j < board[0].length; j++)
			{
				if(isItPossible(board,qpsf, j))
				{
					board[qpsf][j] = true;
					nQueens(board, qpsf+1, tq, ans+"qb"+qpsf+j+" ");
					board[qpsf][j] = false;
				}
			}
		}
	}

}
