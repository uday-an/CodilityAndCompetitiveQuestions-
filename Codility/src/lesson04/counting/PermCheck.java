package lesson04.counting;

import java.util.HashSet;

public class PermCheck {

	public static void main(String[] args) {
		int arr[]= {1, 3, 10, 4, 2};
		System.out.println(solution(arr));
		
	}
	public static int solution(int[] a)
	{
		int max=0;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);//putting all elements in a hashset
			if(a[i]>max)
				max=a[i];
		}
		if(set.size()==a.length && set.size()==max)
			return 1;
		
		
		return 0;
	}
}
