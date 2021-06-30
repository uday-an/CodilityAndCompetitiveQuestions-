package lesson16.greedyAlgorithms;

public class MaxNonOverLappingSegments {

	public static void main(String[] args) {
		int a[]= {1,3,7,9,9};
		int b[]= {5,6,8,9,10};
		
		System.out.println(solution(a,b));

	}
	public static int solution(int[] a, int[] b) {
        int len=a.length;
        if(len<=1)
            return len;
            
        int lnov=b[0];//last non overlapping value
        int count=1;//first segment
        
        for(int i=1;i<len;i++)
        {
            if(a[i]>lnov)
            {
                count++;
                lnov=b[i];
            }
        }
        return count;
    }
}
