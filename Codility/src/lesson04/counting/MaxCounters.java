package lesson04.counting;

//import java.util.*;
public class MaxCounters {

	public static void main(String[] args) {
		int arr[]= {3,4,4,6,1,4,4,6};
		int sol[]=solution(5,arr);
		for(int i=0;i<sol.length;i++)
			System.out.println(sol[i]);

	}
	public static int[] solution(int n, int[] a)
	{
		int counters[]=new int[n];
		int max=0;
		int oprn2=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==(n+1))
			{
				oprn2=max;	
				//System.out.println(oprn2);
			}
			else if(counters[a[i]-1]<oprn2)
			{
				counters[a[i]-1]=oprn2+1;
				max=Math.max(max, counters[a[i]-1]);
				//System.out.println(max);
			}
			else
			{
				counters[a[i]-1]++;
				max=Math.max(max, counters[a[i]-1]);
				//System.out.println(max);
			}
				
			/*{
				counters[a[i]-1]++;
				max=Math.max(max, counters[a[i]-1]);
			}*/
			
		}	
		for(int i=0;i<counters.length;i++)
		{
			if(counters[i]<oprn2)
				counters[i]=oprn2;
		}
		
		return counters;
	}

}
