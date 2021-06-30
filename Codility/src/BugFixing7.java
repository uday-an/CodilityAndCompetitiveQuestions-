
public class BugFixing7 {

	public static void main(String[] args) {
		int X = 8;
		int Y = 12;
		int[] A = {1,2,3,8,4};
		System.out.println(new BugFixing7().solution(X, Y, A));

	}
	//return the longest fragment of array A in which both the numbers X and Y are 
		//present equal number of times
	
	int solution(int X, int Y, int[] A) {
		int N = A.length;
		int result = -1;
		int nX = 0;
		int nY = 0;
		for (int i = 0; i < N; i++) {
			if (A[i] == X)
				nX += 1;
			else if (A[i] == Y)
				nY += 1;
			if (nX == nY && nX!=0)
				result = i+1;
		}
		return result;
	}
}
