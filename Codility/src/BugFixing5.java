
public class BugFixing5 {
	//return the element which occurs the maximum no of times in the given array A
		//M indicates the max value of any element in the array

	public static void main(String[] args) {
		System.out.println(new BugFixing5().solution(5, new int[] { 1, 2, 3, 3, 3, 4, 4,4,4, 3, 2}));

	}
	int solution(int M, int[] A) {
		int N = A.length;
		int[] count = new int[M + 1];
		for (int i = 0; i <= M; i++)
			count[i] = 0;
		int maxOccurence = 1;
		int index = 0;
		for (int i = 0; i < N; i++) {
			if (count[A[i]] > 0) {
				int tmp = count[A[i]];
				if (tmp > maxOccurence) {
					maxOccurence = tmp;
					index = i;
				}
				count[A[i]] = tmp + 1;
			} else {
				count[A[i]] = 1;
			}
		}
		return A[index];
	}
}
