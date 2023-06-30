package Lec15;

public class MappedStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mps("128","");
	}
	
	public static void mps(String nums,String ans)
	{
		if(nums.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			mps(nums.substring(1),ans+(char)(nums.charAt(0)-'1'+'A'));
			if(nums.length() >= 2)
			{
				int n = Integer.parseInt(nums.substring(0,2));
				if(n <= 26)
				{
					n = n+'A'-1;
					mps(nums.substring(2), ans+(char)n);
				}
			}	
		}		
	}

}
