package Lec3;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		
		int row = 1;
		int nst = n;
		int nsp = 0;
		while(row <= 2*n-1)
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
			
			if(row < n)
			{
				nst--;
				nsp += 2;
			}
			else
			{
				nst++;
				nsp -= 2;
			}
			
			row++;
			System.out.println();
		}

	}

}
