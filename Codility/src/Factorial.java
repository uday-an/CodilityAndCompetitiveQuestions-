import java.util.Scanner;
import java.sql.Date;
import java.util.Calendar;

public class Factorial {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter No.");
		int number=obj.nextInt();
		Findfact o=new Findfact();
		Calendar now = Calendar.getInstance();
		System.out.println("Factorial of input no is "+ o.factorial(number));
		Calendar then = Calendar.getInstance();
		System.out.println("Time : "+(then.getTimeInMillis() - now.getTimeInMillis()) + " ms ");
		
		now = Calendar.getInstance();
		System.out.println("Factorial using loop is "+o.factorialusingloop(number));
		then = Calendar.getInstance();
		System.out.println("Time : "+(then.getTimeInMillis() - now.getTimeInMillis()) + " ms ");
		
		now = Calendar.getInstance();
		System.out.println("Factorial using loop is "+o.factusingdp(number));
		then = Calendar.getInstance();
		System.out.println("Time : "+(then.getTimeInMillis() - now.getTimeInMillis()) + " ms ");
	}

}
class Findfact
{
	long factorial(int x)
	{
		if(x==1)
			return 1;
		else
			return x* factorial(x-1);
				
	}
	
	long factorialusingloop(int x)
	{
		long val=1;
		for(int i=2;i<=x;i++)
		{
			val=val*i;
		}
		return val;
	}
	long factusingdp(int x)
	{
		long arr[]=new long[x+1];
		if(x==0)
			return 1;
		arr[0]=1;
		for(int i=1;i<arr.length;i++)
		{
			arr[i]=arr[i-1]*i;
		}
		
		return arr[x];
	}
}