package lesson03.timeComplexity;

public class TapeEquilibrium {

	public static void main(String[] args) {
		int a[]= {3,1,2,4,3};
		System.out.println(solution(a));

	}
	public static int solution(int[] A)
	{
		int min = Integer.MAX_VALUE;
        int tsum=0, sum=0;
        for(int i=1;i<A.length;i++)
        {
        	tsum+=A[i];
        }
        System.out.println(tsum);
        for(int i=0;i<A.length-1;i++){
            sum+=A[i];
            min = Math.min(min, Math.abs((tsum-sum)));
            tsum=tsum-A[i+1];
        }
        return min;
	}
}
