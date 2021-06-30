package lesson14.binarySearchAlgorithm;

import java.util.Arrays;

public class NailingPlanks {

	public static void main(String[] args) {
		int a[]= {1,4,5,8};
		int b[]= {4,5,9,10};
		int c[]= {4,6,7,10,2};
		System.out.println(solution(a,b,c));

	}
	public static int solution(int[] a, int[] b, int[] c) {
        int n=a.length;
        int cl=c.length;
        boolean check[]=new boolean[n];
        int dupa=n;
        for(int i=0;i<cl;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(check[j]==false)
                {
                    if(c[i]>=a[j] && c[i]<=b[j])
                    {
                        check[j]=true;
                        dupa--;
                        if(dupa==0)
                        return i+1;
                    }
                }
            }
        }
        return -1;
    }
	public static int solution1(int[] A, int[] B, int[] C) {
        // the main algorithm is that getting the minimal index of nails which
        // is needed to nail every plank by using the binary search
        int N = A.length;
        int M = C.length;
        // two dimension array to save the original index of array C
        int[][] sortedNail = new int[M][2];
        for (int i = 0; i < M; i++) {
            sortedNail[i][0] = C[i];
            sortedNail[i][1] = i;
        }
        // use the lambda expression to sort two dimension array
        Arrays.sort(sortedNail, (int x[], int y[]) -> x[0] - y[0]);
        
        for(int i=0;i<sortedNail.length;i++)
        	System.out.println(sortedNail[i][0]+" "+sortedNail[i][1]);
        
        int result = 0;
        for (int i = 0; i < N; i++) {//find the earlist position that can nail each plank, and the max value for all planks is the result
            result = getMinIndex(A[i], B[i], sortedNail, result);
            if (result == -1)
                return -1;
        }
        return result + 1;
    }
    // for each plank , we can use binary search to get the minimal index of the
    // sorted array of nails, and we should check the candidate nails to get the
    // minimal index of the original array of nails.
    public static int getMinIndex(int startPlank, int endPlank, int[][] nail, int preIndex) {
        int min = 0;
        int max = nail.length - 1;
        int minIndex = -1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (nail[mid][0] < startPlank)
                min = mid + 1;
            else if (nail[mid][0] > endPlank)
                max = mid - 1;
            else {
                max = mid - 1;
                minIndex = mid;
            }
        }
        if (minIndex == -1)
            return -1;
        int minIndexOrigin = nail[minIndex][1];
        //find the smallest original position of nail that can nail the plank
        for (int i = minIndex; i < nail.length; i++) {
            if (nail[i][0] > endPlank)
                break;
            minIndexOrigin = Math.min(minIndexOrigin, nail[i][1]);
            // we need the maximal index of nails to nail every plank, so the
            // smaller index can be omitted
            if (minIndexOrigin <= preIndex)
                return preIndex;
        }
        return minIndexOrigin;
    }
}
