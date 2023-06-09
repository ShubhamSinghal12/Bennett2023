package Lec3;

public class Pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		int row = 1;
		int nsp = n-1;
		int nst = 1;
		int nval = 1;
		while(row <= n)
		{
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print("  ");
				csp++;
			}
			
			int cst = 1;
			int cval = nval;
			while(cst <= nst)
			{
				System.out.print(cval+" ");
				cst++;
				cval++;
			}
			
			nsp -= 1;
			nst += 2;
			nval = cval;
			row++;
			System.out.println();
		}

	}

}
