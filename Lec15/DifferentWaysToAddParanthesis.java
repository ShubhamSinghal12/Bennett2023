package Lec15;

import java.util.ArrayList;
import java.util.Arrays;

public class DifferentWaysToAddParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(diff("2*3-4*5"));

	}
	
	public static boolean checkOperator(String exp)
	{
		return exp.indexOf('+') != -1 || exp.indexOf('-') != -1 || exp.indexOf('*')!= -1;
	}
	
	public static boolean isOperator(char ch)
	{
		return ch == '+' || ch == '-' || ch == '*';
	}
	
	public static int cal(int a,int b,char ch)
	{
		if(ch == '+')
		{
			return a+b;
		}
		else if(ch == '-')
		{
			return a-b;
		}
		else
		{
			return a*b;
		}
	}
	public static ArrayList<Integer> diff(String exp)
	{
		if(!checkOperator(exp))
		{
			return new ArrayList<>(Arrays.asList(Integer.parseInt(exp)));
		}
		else
		{
			ArrayList<Integer> ans = new ArrayList<>();
			for(int i = 0; i < exp.length(); i++)
			{
				if(isOperator(exp.charAt(i)))
				{
					ArrayList<Integer> left = diff(exp.substring(0,i));
					ArrayList<Integer> right = diff(exp.substring(i+1));
					
					for(int v1:left)
					{
						for(int v2:right)
						{
							ans.add(cal(v1, v2, exp.charAt(i)));
						}
					}
				}
			}
			return ans;
		}
	}

}
