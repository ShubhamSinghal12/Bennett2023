package Lec2;

import java.util.Scanner;

public class MaxofNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = sc.nextInt();
		int i = 2;
		while(i <= n)
		{
			int m = sc.nextInt();
			if(m > max)
			{
				max = m;
			}
			
			i++;
		}
		System.out.println("Max: "+max);
	}

}
