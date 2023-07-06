package Lec17;

public class QueensKill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] board = new boolean[n][n];
		qc2(board, 0, n, "",0,0);

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
	
	public static void qc(boolean[][] board,int qpsf,int tq,String ans,int lr,int lc)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = lr; i < board.length;i++)
			{
				int j = 0;
				if(i == lr)
					j = lc;
				for(;j<board[0].length;j++)
				{
					if(board[i][j] != true && isItPossible(board, i, j))
					{
						board[i][j] = true;
						qc(board, qpsf+1, tq, ans+"qb"+i+j+" ",i,j);
						board[i][j] = false; //Backtracking
					}
				}
			}
		}
	}
	
	
	public static void qc2(boolean[][] board,int qpsf,int tq,String ans,int cr,int cc)
	{
		if(tq == qpsf)
		{
			System.out.println(ans);
		}
		else if(cr == board.length)
		{
			return;
		}
		else if(cc == board[0].length)
		{
			qc2(board, qpsf, tq, ans, cr+1, 0);
		}
		else
		{
			if(isItPossible(board, cr, cc))
			{
				board[cr][cc] = true;
				qc2(board, qpsf+1, tq, ans+"qb"+cr+cc+" ", cr,cc+1);
				board[cr][cc] = false;
			}
			
			qc2(board, qpsf, tq, ans, cr,cc+1);		
		}
	}

}
