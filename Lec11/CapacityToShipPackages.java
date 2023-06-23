package Lec11;

public class CapacityToShipPackages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
  public int shipWithinDays(int[] weights, int days) {
        
        int si = 1;
        int ei = 0;
        for(int w:weights)
            ei += w;
        int ans=  -1;
        while(si <= ei)
        {
            int mid = (si+ei)/2;
            if(isItPossible(weights,days,mid))
            {
                ans = mid;
                ei = mid-1;
            }
            else
            {
                si = mid+1;
            }
        }
        return ans;
        
    }
    
    public boolean isItPossible(int[] weights,int days,int max)
    {
        int load = 0;
        int i = 0;
        int td = 1;
        while(i < weights.length)
        {
            if(load + weights[i] <= max)
            {
                load += weights[i];
                i++;
            }
            else
            {
                td++;
                load = 0;
            }
            
            if(td > days)
            {
                return false;
            }
        }
        
        return true;
        
    }

}
