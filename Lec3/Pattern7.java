package Lec3;

public class Pattern7 {

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
				if(cst == 1 || cst == n || row == 1 || row == n)
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
