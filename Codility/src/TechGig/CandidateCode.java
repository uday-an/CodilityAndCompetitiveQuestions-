package TechGig;


import java.io.*;
import java.util.*;
public class CandidateCode {

	public static void checkComposition(String v, String b)
	{
		int vSize=v.length();
		int bSize=b.length();
		if(bSize>vSize)
		{
			System.out.println("NEGATIVE");
			return;
		}
		int n=0;
		for(int m=0;m<vSize && n<bSize;m++)
		{
			if(v.charAt(m)==b.charAt(n))
				n++;
		}
		if(n==bSize)
			System.out.println("POSITIVE");
		else
			System.out.println("NEGATIVE");
	}
	
	public static void main(String[] args) throws Exception{
		Scanner obj=new Scanner(System.in);
		String v=obj.next();
		int noOfCases=obj.nextInt();
		for(int i=0;i<noOfCases;i++)
		{
			String b=obj.next();
			checkComposition(v, b);
		}

	}

}
