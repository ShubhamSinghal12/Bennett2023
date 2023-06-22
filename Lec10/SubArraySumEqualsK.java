package Lec10;

public class SubArraySumEqualsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int subarraySum(int[] nums, int k) {
		
		int[] prefixA = new int[nums.length+1];
		for(int i = 0; i < nums.length; i++)
		{
			prefixA[i+1] = prefixA[i]+nums[i]; 
		}
		
		int count = 0;
		for(int i = 1; i < prefixA.length; i++)
		{
			for(int j = 0; j < i; j++)
			{
				if(prefixA[i]-prefixA[j] == k)
				{
					count++;
				}
			}
		}
		return count;
		
		
	}

}
