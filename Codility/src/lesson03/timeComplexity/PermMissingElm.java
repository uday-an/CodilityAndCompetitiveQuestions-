package lesson03.timeComplexity;


public class PermMissingElm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {9,8,6,2,3,1,4,5};
		System.out.println(solution1(a));
		System.out.println(solution(a));
	}
	public static int solution1(int[] A)
	{
		 long sum = 0;
	        long n = A.length; n+=1;
	        for(int i : A) sum+=i;
	        return (int) ((n*(n+1)/2) - sum);
	}
	public static int solution(int[] a)
	{
		if(a.length==0)
			return 1;
		int len=a.length;
		int missing=1;
		int check=0;
		for(int i=2;i<=len+1;i++)
		{
			missing=missing+i;
			missing=missing-a[check++];
		}
		return missing;
	}
}
