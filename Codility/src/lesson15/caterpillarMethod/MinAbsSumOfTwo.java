package lesson15.caterpillarMethod;

import java.util.*;
public class MinAbsSumOfTwo {

	public static void main(String[] args) {
		int arr[]= {-8,4,5,-10,3};
		System.out.println(solution(arr));
	}
	public static int solution(int[] a) {
        int len=a.length;
        if(len==1)
            return Math.abs(a[0]+a[0]);
        Arrays.sort(a);
        
        int top=0;
        int low=len-1;
        int min=Math.min(Math.abs(a[top]+a[top]),Math.abs(a[low]+a[low]));
        min=Math.min(min,Math.abs(a[top]+a[low]));
        
        int cmp1=0,cmp2=0;
        while(top<low)
        {
            min=Math.min(min,Math.abs(a[top+1]+a[top+1]));
            min=Math.min(min,Math.abs(a[low-1]+a[low-1]));
            cmp1=a[top+1];
            cmp2=a[low-1];
            if(Math.abs(a[top]+cmp2)<Math.abs(cmp1+a[low]))
            {
                min=Math.min(min,Math.abs(a[top]+cmp2));
                low--;
            }
            else{
                 min=Math.min(min,Math.abs(cmp1+a[low]));
                 top++;
            }
        }
        return min;
    }
}
