package lesson02.arrays;

import java.util.*;

public class ReversingAnArray {

	public static void main(String[] args) {
		int arr[]= {34,5,6,6,8,2,123,4};
		int arr2[]= {1,2,3,4,5,6,7,8,9};
		arr=reverse(arr);
		arr2=reverse(arr2);
		for(int x : arr)
		{
			System.out.println(x);
		}
		System.out.println("-------------");
		for(int x : arr2)
		{
			System.out.println(x);
		}
		System.out.println("--------------");
		
	}
	public static int[] reverse(int list[])
	{
		int n=list.length-1;
		int dup;
		for(int i=0;i<=(list.length-1)/2;i++)
		{
			dup=list[i];
			list[i]=list[n];
			list[n]=dup;
			n--;
		}
		return list;
	}
}
