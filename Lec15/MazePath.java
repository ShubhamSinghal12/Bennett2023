package Lec15;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 4;
		int n = 3;
		mazePath2(0, 0, m-1, n-1, "");

	}
	
	public static void mazePath(int cr,int cc,int row,int col,String ans)
	{
		if(row == cr && cc == col)
		{
			System.out.println(ans);
		}
		else if(cr > row || cc > col)
		{
			return;
		}
		else
		{
			mazePath(cr+1, cc, row, col, ans+"V");
			mazePath(cr, cc+1, row, col, ans+"H");
		}
	}
	
	public static void mazePath2(int cr,int cc,int row,int col,String ans)
	{
		if(row == cr && cc == col)
		{
			System.out.println(ans);
		}
		else if(cr > row || cc > col)
		{
			return;
		}
		else
		{
			mazePath2(cr+1, cc, row, col, ans+"V");
			mazePath2(cr, cc+1, row, col, ans+"H");
			mazePath2(cr+1, cc+1, row, col, ans+"D");
		}
	}

}
