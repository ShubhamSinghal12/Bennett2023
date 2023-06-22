package Lec10;

public class PalindromicSubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(isPalindrome("abbaa"));
		printAllPalindromcSubString("nitinn");
		String st = "abc";

	}
	
	public static void printAllPalindromcSubString(String st)
	{
		int count = 0;
        for(int i = 0; i < st.length(); i++)
        {
        	for(int j = i; j < st.length(); j++)
        	{
        		if(isPalindrome(st.substring(i, j+1)))
        		{
//        			System.out.println(st.substring(i,j+1));
        			count++;
        		}
        	}
        }
        System.out.println(count);
	}
	
	public static boolean isPalindrome(String st)
	{
		int si = 0;
		int ei = st.length()-1;
		while(si < ei)
		{
			if(st.charAt(ei) != st.charAt(si))
			{
				return false;
			}
			else
			{
				si++;
				ei--;
			}
		}
		return true;
	}

}
