
public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1,-2,-3,-4,-5};
//		sumOfAllSubArrays(arr);
//		maxsumOfAllSubArrays(arr);
		kadanes(arr);

	}
	
	public static void printAllSubArrays(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
				for(int k = i; k <= j; k++)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}
	public static void sumOfAllSubArrays(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
				int sum = 0;
				for(int k = i; k <= j; k++)
				{
					sum += arr[k];
//					System.out.print(arr[k]+" ");
				}
				System.out.println(sum);
			}
		}
	}
	
	public static void sumOfAllSubArrays2(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			int sum = 0;
			for(int j = i; j < arr.length; j++)
			{
				sum += arr[j];
				System.out.println(sum);
			}
		}
	}
	
	public static void maxsumOfAllSubArrays(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			int sum = 0;
			for(int j = i; j < arr.length; j++)
			{
				sum += arr[j];
				if(sum > max)
					max = sum;
//				System.out.println(sum);
			}
		}
		System.out.println("Max: "+ max);
	}
	
	public static void kadanes(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
//			if(sum > max)
//			{
//				max = sum;
//			}
			max = Math.max(sum, max);
			if(sum < 0)
			{
				sum = 0;
			}
		}
		System.out.println("Max: "+max);
	}
	

}
