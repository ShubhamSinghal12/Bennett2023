package Lec3;

public class Pattern27 {

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
				if(cst < nst/2+1)
				{
					cval++;
				}
				else
				{
					cval--;
				}
				cst++;
			}
			
			nsp -= 1;
			nst += 2;
			row++;
			nval += 1;
			System.out.println();
		}

	}

}
