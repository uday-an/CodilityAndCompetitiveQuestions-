package lesson05.prefixSum;

/*
 
Logic to this-- 0-east traveling 1-west traveling
so all the 1's after 0's will pass each other (0's after 1's have already passed each other, so no need to count)
Hence need to count all the 1's after each 0's and add it to the sum. If sum exceeds 1000000000, return -1

*/
public class PassingCar {
	public static void main(String[] args) {
		int arr[]= {0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,11,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,11,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,11,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,11,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,11,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,11,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		System.out.println(solution(arr));
	}
	public static int solution(int[] a) {
		int sufix[]=new int[a.length+1];
		sufix[sufix.length-1]=0;
		int sum=0;
		for(int i=sufix.length-2;i>=0;i--)
		{
			sufix[i]=a[i]+sufix[i+1];
			//System.out.println(sufix[i]);
			if(a[i]==0)
			{
				if((sum+sufix[i])>1000000000)
				{
					return -1;
				}
				sum=sum+sufix[i];
			}	
		}
		
		return sum;
	}
}
