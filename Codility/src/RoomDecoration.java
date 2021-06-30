public class RoomDecoration {

	public static void main(String[] args) {
		int arr[]= {1000000000,1000000000,6,9,3,4,3};
		System.out.println(solution(arr));
//1 3 2 1 2 1 5 3 3 4 2
		
		int min=Integer.MIN_VALUE;
		int x=Math.min(6, 7);

	}
	public static int solution(int[] h) {
		long count=0;
		count=h[0];
		int len=h.length;
		
		for(int i=1;i<len;i++)
		{
			if(h[i]>h[i-1])
				count+=h[i]-h[i-1];
			
			if(count>=1000000000)
				return -1;
		}
		
		
		return (int)count;
	}
}
