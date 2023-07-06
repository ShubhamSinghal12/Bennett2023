package Lec16;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {1,2,5,10};
		int target = 10;	
//		ccp(coins, target, "");
//		ccc(coins, target, "", 0);
		ccc2(coins, 0, target, "");
	}
	
	public static int ccp(int[] coins,int target,String ans)
	{
		if(target == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else if(target < 0)
		{
			return 0;
		}
		else
		{
			int ct = 0;
			for(int i = 0; i < coins.length; i++)
			{
				ct += ccp(coins, target-coins[i], ans+coins[i]);
			}
			return ct;
		}
	}
	
	public static int ccc(int[] coins,int target,String ans,int lp)
	{
		if(target == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else if(target < 0)
		{
			return 0;
		}
		else
		{
			int ct = 0;
			for(int i = lp; i < coins.length; i++)
			{
				ct += ccc(coins, target-coins[i], ans+coins[i],i);
			}
			return ct;
		}
	}
	
	public static void ccc2(int[] coins,int i,int target,String ans)
	{
		if(target == 0)
		{
			System.out.println(ans);
			return;
		}
		else if(i >= coins.length || target < 0)
		{
			return;
		}
		else
		{
			target = target-coins[i];
			ccc2(coins, i, target, ans+coins[i]);
			target = target + coins[i];
			
			ccc2(coins, i+1, target, ans);
		}
	}
	
	

}
