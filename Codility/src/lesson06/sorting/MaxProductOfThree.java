package lesson06.sorting;

public class MaxProductOfThree {
	public static void main(String[] args) {
		int arr[]= {-5,-5,-5,-5};
		System.out.println(solution(arr));
	}
	public static int solution(int[] a) {
		
		int high=(a[0]>a[1])?(a[0]>a[2]?a[0]:a[2]):(a[1]>a[2]?a[1]:a[2]);
		int low=(a[0]<a[1])?(a[0]<a[2]?a[0]:a[2]):(a[1]<a[2]?a[1]:a[2]);
		int mid=(a[0]+a[1]+a[2])-(high+low);
		int toplow=low;
		int toplow2=mid;
		for(int i=3;i<a.length;i++)
		{
			if(a[i]<toplow)//-50
			{
				toplow2=toplow;
				toplow=a[i];
			}
			else if(a[i]<toplow2)//-25
			{
				toplow2=a[i];
			}
			
			if(a[i]>high)//15
			{
				low=mid;
				mid=high;
				high=a[i];
			}
			else if(a[i]>mid)//5
			{
				low=mid;
				mid=a[i];
			}
			else if(a[i]>low)//6
			{
				low=a[i];
			}
		}
		
		return Math.max(high*mid*low,high*toplow*toplow2);
		}
}
