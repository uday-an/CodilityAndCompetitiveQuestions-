package lesson16.greedyAlgorithms;

public class TieRopes {

	public static void main(String[] args) {
		int arr[]= {1,2};
		System.out.println(solution(2,arr));

	}
	public static int solution(int k, int[] a) {
		int count=0;
        int sum=0;
        int len=a.length;
        for(int i=0;i<len;i++)
        {
            sum+=a[i];
            if(sum>=k)
            {
                count++;
                sum=0;
            }
        }
        return count;
    }
}
