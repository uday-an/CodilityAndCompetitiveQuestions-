package lesson04.counting;

public class FrogRiverOne {

	public static void main(String[] args) {
		int ar[]= new int[90999];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=i+1;
		}
		System.out.println(solution(90999,ar));
		int ar1[]= {1,1,2,3,4,2,5,3,6,5,4};
		System.out.println(solution(5,ar1));
	}
	public static int solution(int x, int[] a)
	{
		//long sum=(x*(x+1))/2;
		//System.out.println(sum);
		int dup=x;
		boolean PositionCovered[]=new boolean[x+1];
		//long arraySum=0;
		int endPosition=-1;
		for(int i=0;i<a.length;i++)
		{
			if(PositionCovered[a[i]]==false)
			{
				PositionCovered[a[i]]=true;
				x--;
			}
			if(x==0)
			{
				endPosition=i;
				break;
			}
		}
		//System.out.println(arraySum);
		
		return endPosition;
	}
}
