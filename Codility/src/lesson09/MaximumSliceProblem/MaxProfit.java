package lesson09.MaximumSliceProblem;

public class MaxProfit {

	public static void main(String[] args) {
		int arr[]= {345,346};
		//int arr[]= {23171,21011,21123,21366,21013,21367};
		System.out.println(solution(arr));
	}
	public static int solution(int[] a) {
		if(a.length==0)
			return 0;
		int diff=0;
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>min)
				diff=Math.max(diff, a[i]-min);//Finding Max difference greater than 0
			else
				min=a[i];//finding minimum element in the whole array
		}
		
		
		return diff;
	}

}
