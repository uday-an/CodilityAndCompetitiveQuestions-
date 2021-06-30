package lesson07.stacksAndQueues;

import java.util.*;
public class StoneWall {

	public static void main(String[] args) {
		int arr[]= {8,8,5,7,9,8,7,4,8};
		System.out.println(solution(arr));
//1 3 2 1 2 1 5 3 3 4 2
	}
	public static int solution(int[] h) {
		int count=1;
		Stack<Integer> st=new Stack<Integer>();
		st.push(h[0]);
		
		for(int i=1;i<h.length;i++)
		{
			if(h[i]!=st.peek())
			{
				if(h[i]>st.peek())
				{
					st.push(h[i]);
					count++;
				}
				else
				{
					while(st.size()>0 && h[i]<st.peek())
						st.pop();
					
					if(st.size()==0 || h[i]>st.peek())
					{
						st.push(h[i]);
						count++;
					}
				}
			}
		}
		
		
		return count;
	}

}
