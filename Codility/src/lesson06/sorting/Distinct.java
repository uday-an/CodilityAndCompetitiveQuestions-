package lesson06.sorting;

import java.util.*;
public class Distinct {

	public static void main(String[] args) {
		int arr[]= {2,1,1,2,3,1};
		System.out.println(solution(arr));

	}
	public static int solution(int[] a) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);//putting all elements in a HashSet
		}
		return set.size();
	}

}
