package lesson01.iterations;

import java.util.Scanner;

public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long s=Long.valueOf(Integer.toBinaryString(1041));
		//System.out.println(s);
		BinaryGap bg=new BinaryGap();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=sc.nextInt();
		System.out.println(bg.solution(x));
	}
	public static int solution(int n)
	{
		String s=Integer.toBinaryString(n);
		System.out.println(s);
		int largest=0,curr=0;
		
		for(int i=0;i<Integer.toBinaryString(n).length();i++)
		{
			if(s.charAt(i)=='0')
			{
				curr++;
			}
			if((i!=s.length()-1) && s.charAt(i+1)=='1') 
			{
			largest=Math.max(largest,curr);
			curr=0;
			}
		}
		return largest;
	}

}
