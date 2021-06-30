package lesson08.leader;

/*
 * Study Moore's Algo of voting, a different solution to this problem
 * Loop through each element and maintains a count of majority element, and a majority index, maj_index
*If the next element is same then increment the count if the next element is not same then decrement the count.
*If the count reaches 0 then changes the maj_index to the current element and set the count again to 1.
*Now again traverse through the array and find the count of majority element found.
*If the count is greater than half the size of the array, print the element
*Else print that there is no majority element
*
*
*Below solution is different
 */

import java.util.*;
public class Dominator {

	public static void main(String[] args) {

		int arr[]= {2, 1, 1, 3, 4};
		System.out.println(solution(arr));
	}
	public static int solution(int[] a) {
		int loc=-1;
		Stack<Integer> st=new Stack<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(st.isEmpty())
			{
				st.push(a[i]);
				loc=i;
			}
			else if(a[i]!=st.peek())
			{
				st.pop();
			}else
			{
				st.push(a[i]);
			}
		}
		
		if(st.isEmpty())
			return -1;
		else {
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==st.peek())
					count++;
			}
			if(count>(a.length/2))
				return loc;
		}
		
		
		return -1;
	}
}
