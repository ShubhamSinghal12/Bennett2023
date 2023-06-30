package Lec15;

public class GenerateParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		gp(n, n, "");
	}
	
	public static void gp(int op,int clo,String ans)
	{
		if(op == 0 && clo == 0)
		{
			System.out.println(ans);
		}
		else if(op < 0 || clo < op)
		{
			return;
		}
		else
		{
			gp(op-1, clo, ans+"(");
			gp(op, clo-1, ans+")");
		}
	}

}
