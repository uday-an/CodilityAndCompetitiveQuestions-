import java.util.Scanner;

public class Finnonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter No.");
		int number=obj.nextInt();
		Fibo fb=new Fibo();
		fb.printFiboSeries(number);
	}

}
class Fibo
{
	final int NIL = -1; 
	  
	  int lookup[] = new int[100]; 
	  
	  /* Function to initialize NIL values in lookup table */
	  void _initialize() 
	  { 
	    for (int i = 0; i < 100; i++) 
	        lookup[i] = NIL; 
	  } 
	  
	void printFiboSeries(int n)
	{
		int a=0,b=1;
		int c=0;
		while(a<=n)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
	public int calculate(int n) { //5
        if(n<=1) {
            return n;
        }
        //System.out.println("Recursion.."+(n-2)+(n-1));
        return calculate(n-2) + calculate(n-1);
    }
	int fib(int n) 
	  { 
	    if (lookup[n] == NIL) 
	    { 
	      if (n <= 1) 
	          lookup[n] = n; 
	      else
	          lookup[n] = fib(n-1) + fib(n-2); 
	    } 
	    return lookup[n]; 
	  } 
    
    int calculateIterative(int n)
    {
        if(n<=1) {
            return n;
        }
        int F[] = new int[n+1];
        
        F[0]=0;
        F[1]=1;
        
        for(int i=2;i<=n;i++)
        {
            F[i] = F[i-2] + F[i-1];
            System.out.println("Loop "+i+ " and "+F[i]);
        }
        return F[n];
    }
}
