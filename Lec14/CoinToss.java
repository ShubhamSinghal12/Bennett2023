package Lec14;

public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(coinToss(3, ""));

	}
	
	public static int coinToss(int coins,String ans)
	{
		if(coins == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			int cnt = 0;
			cnt += coinToss(coins-1, ans+"H");
			cnt += coinToss(coins-1, ans+"T");
			return cnt;
		}
	}

}
