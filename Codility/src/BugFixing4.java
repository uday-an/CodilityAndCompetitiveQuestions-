
public class BugFixing4 {

	public static void main(String[] args) {
		int[] A = {1,1,0,1,1,0};
		System.out.println(new BugFixing4().solution(A));

	}
	//A - array of 0s and 1s
			//need to return the starting position of first sequence of the maximal occurrences of 1s
			//return -1 in case if the array does not contains 1s
			int solution(int[] A) {
				int n = A.length;
				int i = n - 1;
				int result = -1;
				int k = 0, maximal = 0;
				while (i > 0) {
					if (A[i] == 1) {
						k = k + 1;
						if (k >= maximal) {
							maximal = k;
							result = i;
						}
					} else
						k = 0;
					i = i - 1;
				}
				if (A[i] == 1 && k + 1 >= maximal) {
					result = 0;
				}
					
				return result;
			}
}
