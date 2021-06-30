package lesson04.counting;

import java.util.HashSet;
//import java.util.Set;

public class MissingInteger {

	public static void main(String[] args) {
		int arr[]= {1, 3, 6, 4, 1, 2};
		System.out.println(solution(arr));

	}
	public static int solution(int[] a)
	{
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);//putting all elements in a hashset
		}
		int smallestElement=1;
		while(true)
		{
			if(set.contains(smallestElement)==false)
				break;
			smallestElement++;
		}
		return smallestElement;
	}

}
