package Lec2;

public class GetAllPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 100;
		int n = 2;
		
		while(n <= N)
		{
			int i = 2;
			boolean flag = true;
			
			while(i*i <= n)
			{
				if(n%i == 0)
				{
					flag = false;
				}
				
				i++;
			}
			
			if(flag)
			{
				System.out.println(n);
			}
			n++;
		}
	}

}
