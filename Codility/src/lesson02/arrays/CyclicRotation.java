package lesson02.arrays;

public class CyclicRotation {

	public static void main(String[] args) {
		int arr[]= {4,5,3,2,4,5,6};
		int k=4;
		arr=solution(arr,k);
		for(int x : arr)
		{
			System.out.println(x);
		}
		System.out.println("------------");
		int arr1[]= {1,2,3,4,5,6,7,8,9,10};
		arr1=solution(arr1,5);
		for(int x : arr1)
		{
			System.out.println(x);
		}
	}
	
	//do this using GCD, O(n)
	public static int[] solution(int[] a, int k)
	{
		if(a.length==0)
			return a;
		int lastval=0;
		for(int i=0;i<k;i++)
		{
			lastval=a[a.length-1];
			for(int j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=lastval;
		}
		return a;
	}
	public static int[] solution1(int[] A, int K)
    {
        //first decide the end result storage
        int rotatedArray[] = new int [A.length];
        
        for(int i=0;i<A.length;i++) {
            int rotatedIndex = ( i + K ) % A.length;
            rotatedArray[rotatedIndex] = A[i];
        }
        return rotatedArray;
    }
}
