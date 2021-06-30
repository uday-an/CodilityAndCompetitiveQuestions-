import java.util.*;
public class BugFixing2 {

	public static void main(String[] args) {
		int[] A = {1};
		int[] B = {0};
		System.out.println(new BugFixing2().solution(A, B));

	}
	int solution(int[] A, int[] B) {
		int n = A.length;
        int m = B.length;
        Arrays.sort(A);//2,4,6,7
        Arrays.sort(B);//1,1,2,8
        int i = 0;
        for (int k = 0; k < n && i<m; ) {
        	if (A[k] == B[i])
                return A[k];
            if (i < m-1  && B[i] < A[k])
                i += 1;
        else
        k+=1;
        }
        return -1;
    }
}
