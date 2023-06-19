package Lec8;

import java.util.Arrays;

public class ArraysProductExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public static int[] pes(int[] nums)
	{
		int[] ans = new int[nums.length];
		for(int i= 0; i< nums.length; i++)
		{
			int prod = 1;
			for(int j = 0;j < nums.length; j++)
			{
				if(i != j)
				{
					prod *= nums[j];
				}
			}
			ans[i] = prod;
		}
		return ans;
	}
	
	public int[] productExceptSelf(int[] nums) {
	       // find lp 
	            int[] lp = new int[nums.length];
	            lp[0] = 1;
	            int prod=1;
	            for ( int j = 1 ; j <= nums.length-1; j++){
	                prod*=nums[j-1];
	                lp[j] = prod;
	            }
	           // find rp
	            prod=1;
	            for ( int j = nums.length-2 ; j >= 0; j--){
	                prod*=nums[j+1];
	                lp[j] *= prod;
	            }
	            
	            return lp;
	    }

}
