package lesson07.stacksAndQueues;

import java.util.Stack;

public class Nesting {

	public static void main(String[] args) {
		String s="(()(())())";
		System.out.println(solution(s));

	}
	public static int solution(String s) {
		if(s.length()==0)
			return 1;
		if(s.length()%2==1 || s.charAt(0)==')')
			return 0;
		
		Stack<Character> st=new Stack<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
				st.push(s.charAt(i));
			else
				if(st.size()>0 && ((s.charAt(i)==')' && st.peek()=='(')))
					st.pop();
				else
					return 0;
		}
		
		if(st.size()>0)
			return 0;
		
		return 1;

}
}
