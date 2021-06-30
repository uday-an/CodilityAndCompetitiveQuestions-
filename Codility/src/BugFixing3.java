import java.util.Arrays;

public class BugFixing3 {
	public static void main(String[] args) {
		int[] A = {1,1,2,3};
		int K = 3;
		System.out.println(new BugFixing3().solution(A, K));
	}
	//check if the array contains every number from 1 to K atleast once
		public boolean solution(int[] A, int K) {
			int n = A.length;
			//1
			Arrays.sort(A);
			for (int i = 0; i < n - 1; i++) {
				if (A[i] + 1 < A[i + 1])
					return false;
			}
			//2
			if (A[0] != 1 || A[n - 1] < K)
				return false;
			else
				return true;
		}
}
