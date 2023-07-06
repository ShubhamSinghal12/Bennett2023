package Lec17;

public class Queens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean board[] = new boolean[4];
//		qc(board, 0, 2, "",-1);
		qc2(board, 0, 2, "", 0);

	}
	
	public static void qp(boolean[] board,int qpsf,int tq,String ans)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < board.length;i++)
			{
				if(board[i] != true)
				{
					board[i] = true;
					qp(board, qpsf+1, tq, ans+"q"+qpsf+"b"+i+" ");
					board[i] = false; //Backtracking
				}
			}
		}
	}
	
	
	public static void qc(boolean[] board,int qpsf,int tq,String ans,int lp)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = lp+1; i < board.length;i++)
			{
				if(board[i] != true)
				{
					board[i] = true;
					qc(board, qpsf+1, tq, ans+"qb"+i+" ",i);
					board[i] = false; //Backtracking
				}
			}
		}
	}
	
	public static void qc2(boolean[] board,int qpsf,int tq,String ans,int i)
	{
		if(tq == qpsf)
		{
			System.out.println(ans);
		}
		else if(i == board.length)
		{
			return;
		}
		else
		{
			board[i] = true;
			qc2(board, qpsf+1, tq, ans+"qb"+i+" ", i+1);
			board[i] = false;
			
			qc2(board, qpsf, tq, ans, i+1);
			
		}
	}

}
