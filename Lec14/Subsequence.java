package Lec14;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList<String> ans = subS("abc");
//		System.out.println(ans);
//		subS("abc","");
		AsciisubS("ab", "");

	}
	
	public static ArrayList<String> subS(String ques)
	{
		if(ques.length() == 0)
		{
			return new ArrayList<String>(Arrays.asList(""));
		}
		else
		{
			ArrayList<String> rr = subS(ques.substring(1));
			ArrayList<String> ans = new ArrayList<>();
			for(String val : rr)
			{
				ans.add(val);
				ans.add(ques.charAt(0)+val);
			}
			return ans;
		}
	}
	
	public static void subS(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			subS(ques.substring(1), ans);
			subS(ques.substring(1), ans+ques.charAt(0));
		}
	}
	
	public static void AsciisubS(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			AsciisubS(ques.substring(1), ans);
			AsciisubS(ques.substring(1), ans+ques.charAt(0));
			AsciisubS(ques.substring(1), ans+(int)ques.charAt(0));
		}
	}
	
	

}
