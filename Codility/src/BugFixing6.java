
public class BugFixing6 {

	// S - array of numbers between range -1000 an 1000
		// need to return the slice with maximum non-negative sum of it's elements
	public static void main(String[] args) {
		//slices - {1}, {2}, {1,2}, {-3}, {1, 2, -3}, {4}, {5}, {4,5}, .......
        System.out.println(new BugFixing6().solution(new int[] {1, 2, -3, 4, 5, 2, 3, 4,-6, -6}));
        System.out.println(new BugFixing6().solution(new int[] {-1,-8,-2,-9,0}));
        System.out.println(new BugFixing6().solution(new int[] {1,2,3,4,6,-5,-6,5,7,-3,-2,1,2,3,4}));
        System.out.println(new BugFixing6().solution(new int[] {-10,1,2,3,3,4,-10,6}));

	}
	public int solution(int[] S) {
		int max_sum = 0;
		int current_sum = 0;
		boolean positive = false;
		int n = S.length;
		for (int i = 0; i < n; ++i) {
			int item = S[i];
			if (item < 0) {
				if (max_sum < current_sum) {
					max_sum = current_sum;
					
				}
				current_sum = 0;
				
			} else {
				positive = true;
				current_sum += item;
			}
		}
		if (current_sum > max_sum) {
			max_sum = current_sum;
		}
		if (positive) {
			return max_sum;
		}
		return -1;
	}
}
