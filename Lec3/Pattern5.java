package Lec3;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		int row = 1;
		int nsp = 0;
		int nst = n;
		while(row <= n)
		{
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print("  ");
				csp++;
			}
			
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print("* ");
				cst++;
			}
			
			nsp += 2;
			nst--;
			row++;
			System.out.println();
		}

	}

}
