package lesson07.stacksAndQueues;

import java.util.*;
public class Fish {
	public static void main(String[] args) {
		int s[]= {4,2,3,2,1,5};
		int d[]= {0,1,1,0,0,0};
		System.out.println(solution(s,d));
	}
	public static int solution(int[] a, int[] b) {
		if(a.length==1)
			return 1;
		Stack<Integer> st=new Stack<Integer>();
		
		int prev1count=0;
		for(int i=0;i<a.length;i++)
		{
			if(b[i]==1)
			{
				st.push(a[i]);
				prev1count++;
			}
			else if(prev1count==0)
			{
				st.push(a[i]);
			}
			else
			{
				while(prev1count!=0)
				{
					if(st.peek()>a[i])
						break;
					else {
						st.pop();
						prev1count--;
					}
					if(prev1count==0)
						st.push(a[i]);
				}
			}
		}
		
		return st.size();
	}
}
