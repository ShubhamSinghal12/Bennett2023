package Lec14;

public class LexographicalCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 9; i++)
			lexo(100, i);

	}
	
	public static void lexo(int n,int ans)
	{
		if(ans > n)
		{
			return;
		}
		else
		{
			System.out.println(ans);
			for(int i = 0; i <= 9; i++)
			{
				lexo(n,ans*10+i);
			}
		}
	}
	

}
