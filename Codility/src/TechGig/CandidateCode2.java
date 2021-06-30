package TechGig;


import java.io.*;
import java.util.*;
public class CandidateCode2 {

	private static boolean isPrime(int x)
	{
		if(x==1)
			return false;
		int sroot=(int)Math.sqrt(x)+1;
		for(int i=2;i<sroot;i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	}
	public static void primeDifference(int l,int r)
	{
		if(l==r)//C 2
		{
			if(l==2 || l==3)
			{
				System.out.println(0);
				return;
			}
			if(isPrime(l))
			{
				System.out.println(0);
				return;
			}
		}
		//c 1 and 3
		int left=0;
		int right=0;
		for(int i=l;i<=r;i++)
		{
			if(i==2 || i==3)
			{
				left=i;
				break;
			}
			if(i%6==1 || i%6==5)
			{
				if(isPrime(i))
				{
					left=i;
					break;
				}
			}
		}
		for(int i=r;i>=l;i--)
		{
			if(i==2 || i==3)
			{
				right=i;
				break;
			}
			if(i%6==1 || i%6==5)
			{
				if(isPrime(i))
				{
					right=i;
					break;
				}
			}
		}
		if(left==0 && right==0)
			System.out.println(-1);
		else if(left!=0 && right!=0)
			System.out.println(right-left);
		else
			System.out.println(0);
	}
	
	public static void main(String[] args) throws Exception {
		Scanner obj=new Scanner(System.in);
		int noOfCases=obj.nextInt();
		for(int i=0;i<noOfCases;i++)
		{
			int l=obj.nextInt();
			int r=obj.nextInt();
			primeDifference(l, r);
		}

	}
	

}
