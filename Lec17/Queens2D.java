package Lec17;

public class Queens2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[2][4];
		qc(board, 0, 2, "",0,0);
		

	}
	
	public static void qp(boolean[][] board,int qpsf,int tq,String ans)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < board.length;i++)
			{
				for(int j = 0; j < board[0].length; j++)
				{
					if(board[i][j] != true)
					{
						board[i][j] = true;
						qp(board, qpsf+1, tq, ans+"q"+qpsf+"b"+i+j+" ");
						board[i][j] = false; //Backtracking
					}
				}
			}
		}
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
					if(board[i][j] != true)
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
			board[cr][cc] = true;
			qc2(board, qpsf+1, tq, ans+"qb"+cr+cc+" ", cr,cc+1);
			board[cr][cc] = false;
			
			qc2(board, qpsf, tq, ans, cr,cc+1);		
		}
	}
}
