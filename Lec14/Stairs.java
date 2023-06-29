package Lec14;

public class Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stairs(new int[] {1,2,5}, 6, ""));

	}
	public static int stairs(int[] steps,int ns,String ans)
	{
		if(ns == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else if(ns < 0)
		{
			return 0;
		}
		else
		{
			int ct = 0;
			for(int step:steps)
			{
				ct += stairs(steps, ns-step, ans+step);
			}
			return ct;
		}
	}

}
