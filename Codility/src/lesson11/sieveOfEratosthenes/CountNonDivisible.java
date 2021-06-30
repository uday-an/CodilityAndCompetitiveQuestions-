package lesson11.sieveOfEratosthenes;

public class CountNonDivisible {

	public static void main(String[] args) {
		int arr[]= {3,1,2,3,6};
		arr=solution(arr);
		for(int i:arr)
			System.out.println(i);
		
	}
	public static int[] solution(int[] a) {
		int n=a.length;
		int count[]=new int[(n*2)+1];
		int divisor[]=new int[(n*2)+1];
		for(int i=0;i<n;i++)
		{
			count[a[i]]++;
			divisor[a[i]]=1;//a check for whether a[i] is present in the array or not
		}
		
		for(int i:a)
		{
			if(divisor[i]==1)
			{
				divisor[i]=0;
				int sqr=(int)Math.sqrt(i);
				for(int j=1;j<=sqr;j++)//to find all the divisor
				{
					if(i%j==0)
					{
						divisor[i]+=count[j];
						
						if(i/j!=j)
							divisor[i]+=count[i/j];
					}
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			a[i]=n-divisor[a[i]];
		}
		
		return a;
	}
}
