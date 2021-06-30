package lesson14.binarySearchAlgorithm;

public class MinMaxDivision {

	public static void main(String[] args) {
		int arr[]= {2,1,5,1,2,2,2};
		System.out.println(solution(3,5,arr));

	}
	public static int solution(int k, int m, int[] a) {
        if(a.length==0)
            return 0;
        if(a.length==1)
            return a[0];
        
        int len=a.length;
        int min=0,summax=0;
        for(int i=0;i<len;i++)
        {
            summax+=a[i];
            min=Math.max(min,a[i]);
        }
        int dupsum=summax;
        while(min<=summax)
        {
            int mid=(min+summax)/2;
            int dupk=k;
            int latersum=0;
            for(int i=0;i<len;i++)
            {
                latersum+=a[i];
                if(latersum>mid)
                {
                    latersum=a[i];
                    dupk--;
                }
                if(dupk==0)
                {
                    break;
                }
            }
            if(dupk==0)
            {
                min=mid+1;
            }
            else
            {
                summax=mid-1;
                dupsum=mid;//mid is the max sum till now
            }
        }
        return dupsum;
    }
}

