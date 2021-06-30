package lesson07.stacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
        int q=obj.nextInt();
        Stack<String> st=new Stack<String>();
        String str="";
        st.add(str);
        for(int i=0;i<q;i++)
        {
            int commandNumber=obj.nextInt();
            if(commandNumber==1)
            {
            	String ap=obj.next();
            	str=st.peek().concat(ap);
            	st.add(str);
            }
            else if(commandNumber!=4)
            {
            	int dORp=obj.nextInt();
            	if(commandNumber==2)
            	{
            		str=st.peek();
            		str=str.substring(0,str.length()-dORp);
            		st.add(str);
            	}
            	if(commandNumber==3)
            	{
            		System.out.println(st.peek().charAt(dORp-1));
            	}
            }
            else
            {
            	st.pop();
            }
        }
        

	}

}
