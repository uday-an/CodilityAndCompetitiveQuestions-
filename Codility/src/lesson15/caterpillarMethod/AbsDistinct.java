package lesson15.caterpillarMethod;

import java.util.*;
public class AbsDistinct {

	public static void main(String[] args) {
		int a[]= {-5,-3,-1,0,3,6};
		System.out.println(solution(a));

	}
	public static int solution(int[] a)
	{
		HashSet<Integer> unique=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			unique.add(Math.abs(a[i]));
		}
		
		
		return unique.size();
	}
}
