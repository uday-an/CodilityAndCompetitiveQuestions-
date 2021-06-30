package lesson06.sorting;

import java.util.*;
public class Triangle {
	public static void main(String[] args) {
		int arr[]= {2147483647,2147483647,45};
		System.out.println(solution(arr));
	}
	public static int solution(int[] A) {
		Arrays.sort(A);
		//why to sort
		//because after sorting, say 3,5,6. If 3+5>6, then 6+5 or 6+3 will automatically be greater than 3 or 5
		//no need to check other two. Another e.g. 3,5,10; now if 3+5<10, it also won't be greater than any
		//any no. ahead of 10, so no need to check
		for(int i=2;i<A.length;i++)
		{
			// 1 2 5 8 13 21
			long first=A[i-2];
			long second=A[i-1];
			long third=A[i];
			if(first+second>third)
				return 1;
		}
		
		
		return 0;
	}
}
