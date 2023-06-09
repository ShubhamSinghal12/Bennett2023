package Lec3;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		int row = 1;
		int nst = n;
		while(row <= n)
		{
			int cst = 1;
			while(cst <= nst)
			{
				if(cst == row || cst+row == n+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				cst++;
			}
			
			row++;
			System.out.println();
		}

	}

}
