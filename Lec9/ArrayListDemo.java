package Lec9;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		al.add(2,1000);
		System.out.println(al);
		System.out.println(al.get(3));
		al.set(2, 130);
		System.out.println(al);
		
		al.remove(0);
		System.out.println(al);
		
		System.out.println(al.size());
		
		System.out.println(al.contains(1300));
		
		int[] arr = {1,2,3,4};
		ArrayList<Integer> asl = new ArrayList<>();
		System.out.println(asl);
		asl.size();
		
		for(int i: arr)
		{
			asl.add(i);
		}
		
		

	}

}
