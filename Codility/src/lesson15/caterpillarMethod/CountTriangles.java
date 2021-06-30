package lesson15.caterpillarMethod;

import java.util.*;
public class CountTriangles {

	public static void main(String[] args) {
		int a[]= {8,5,10,2,12,1};
		System.out.println(solution(a));

	}
	public static int solution(int[] a) {
        int len=a.length;
        int start=0, middle=0;
        Arrays.sort(a);// 1 2 5 8 10 12
        /*
         * start is the 0 index
         * middle is the end-1 index
         * end is the last index
         * 
         * LOGIC-- Fix the last index i.e. end and try all combinations of start and middle
         * Remember array is sorted, hence if start and middle and end is forming a triangular,
         * then start+1, ....middle-1 all will also satisfy e.g. 5,8,10,12--> if 5  10  12 forms a triangle
         * then automatically 8 which is greater than 5 will form a triangle with 10 and 12.
         * 
         * to find triangular efficiently, same logic as lesson 06 triangle question
         */
        
        int count=0;
        for(int end=len-1;end>=1;end--)//fix the end
        {
            start=0;
            middle=end-1;
            while(start<middle)
            {
                if(a[start]+a[middle]>a[end])
                {
                    count+=middle-start;
                    middle--;
                }
                else
                {
                    start++;
                }
            }
        }
        return count;
    }
}
