package lesson90;

public class FloodDepth {

	public static void main(String[] args) {
		int arr[]= {1,3,2,1,2,1,5,3,3,4,2};
		int brr[]= {5,8};
		System.out.println(solution(arr));
		System.out.println(solution(brr));

	}
	 public static int solution(int[] A) {
		    int highestIdx = 0;
		    int lowestIdx = 0;
		    int max = 0;

		    for (int i = 1; i < A.length; i++) {
		      int current = A[i];
		      int highest = A[highestIdx];
		      int lowest = A[lowestIdx];
		      if (current > highest) {
		        max = Math.max(highest - lowest, max);
		        highestIdx = i;
		        lowestIdx = highestIdx;
		      } else if (current > lowest) {
		        max = Math.max(current - lowest, max);
		      } else if (current < lowest) {
		        lowestIdx = i;
		      }
		    }
		    return max;

		  }
}
