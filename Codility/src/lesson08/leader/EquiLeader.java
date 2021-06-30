package lesson08.leader;

import java.util.Stack;

public class EquiLeader {

	public static void main(String[] args) {
		int arr[]= {4,3,4,4,4,2};
		System.out.println(solution(arr));

	}
	public static int solution(int[] a) {
		Stack<Integer> st=new Stack<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(st.isEmpty())
			{
				st.push(a[i]);
			}
			else if(a[i]!=st.peek())
			{
				st.pop();
			}else
			{
				st.push(a[i]);
			}
		}
		int count=0;
		if(st.isEmpty())
			return 0;
		else {
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==st.peek())
					count++;
			}
		}
		if(count<=(a.length/2))
			return 0;
		
		int equic=0;
		int equicount=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==st.peek())
			{
				equic++;
			}
			if((equic>(i+1)/2) && ((count-equic)>(a.length-(i+1))/2))
			{
				equicount++;
			}
		}
		
		return equicount;
	}
}
