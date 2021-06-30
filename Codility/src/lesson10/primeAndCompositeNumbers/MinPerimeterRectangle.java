package lesson10.primeAndCompositeNumbers;

public class MinPerimeterRectangle {

	public static void main(String[] args) {
		System.out.println(solution(30));

	}
	public static int solution(int n) {
		long minperi=Integer.MAX_VALUE;
        for(long i=1; i*i<=n; i++) 
        {
        	if(n%i==0) 
        	{
        		minperi=Math.min(minperi, 2*(i+(n/i)));
       		} 
        }
        
        return (int)minperi;
	}

}

/* int n = (int)Math.sqrt(N);
for(int i = n; i >= 0; i--) {
if(N % i == 0) {
    return 2*(i + N/i);
}
}
return 1;*/