package Lec8;

public class RainWaterHarvesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int trap(int[] height) {
	        
	        int[] lmax = new int[height.length];
	        lmax[0] = height[0];
	        for(int i = 1; i < height.length; i++)
	        {
	        	lmax[i] = Math.max(lmax[i-1], height[i]);
	        }
	        
	        int[] rmax = new int[height.length];
	        rmax[height.length-1] = height[height.length-1];
	        for(int i = height.length-2; i >= 0 ; i--)
	        {
	        	rmax[i] = Math.max(rmax[i+1], height[i]);
	        }
	        
	        int sum = 0;
	        for(int i = 0; i < height.length; i++)
	        {
	        	sum += Math.min(lmax[i], rmax[i]) - height[i];
	        }
	        return sum;
	        
	    }

}
