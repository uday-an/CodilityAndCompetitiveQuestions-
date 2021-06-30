package lesson09.MaximumSliceProblem;


//This is Kadane's algo for Max Slice sum problems
public class MaxSliceSum {

	public static void main(String[] args) {
		int arr[]= {-1,-2,-3,-4};
		System.out.println(solution(arr));

	}
	public static int solution(int[] a) {
		int maxending=0;
		int maxslice=Integer.MIN_VALUE;
		for(int x:a)
		{
			maxending=x+maxending;
			maxslice=Math.max(maxslice, maxending);
			if(maxending<0)
				maxending=0;
		}
		
		return maxslice;
	}
}
