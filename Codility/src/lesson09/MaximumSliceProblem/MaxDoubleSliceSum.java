package lesson09.MaximumSliceProblem;

/*
 * Remember if all values are negative, max sum will be zero.
 * Concept of Kadane algo only from left to right and right to left, just that maxsum is initialized to zero 
 * beforehand only if it's less than 0 and in prefix and postfix order.
 */

public class MaxDoubleSliceSum {

	public static void main(String[] args) {
		int arr[]= {3,2,6,-1,4,5,-1,2};
		System.out.println(solution(arr));

	}
	public static int solution(int[] A) {        
        int[] maxfromStart = new int[A.length];
        int[] maxfromEnd = new int[A.length];
        int maxSum = 0;
        int l=A.length;

        for(int i = l-2; i > 0; --i ) {            
            maxSum = Math.max(0, A[i] + maxSum);
            maxfromEnd[i] = maxSum;
            System.out.println(maxSum);
        }
        System.out.println("-----------------");
        maxSum = 0;
        for(int i = 1; i < l-1; ++i ) {            
            maxSum = Math.max(0, A[i] + maxSum);
            maxfromStart[i] = maxSum;
            System.out.println(maxSum);
        }
        int maxDoubleSlice = 0;
        System.out.println("------------------");

        for(int i = 1; i < l-1; ++i) {
            maxDoubleSlice = Math.max(maxDoubleSlice, maxfromEnd[i+1] + maxfromStart[i-1]);
            System.out.println(maxDoubleSlice);
        }

        return maxDoubleSlice;
        


    }
}
