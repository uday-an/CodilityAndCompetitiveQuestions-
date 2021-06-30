package lesson10.primeAndCompositeNumbers;

public class CountFactors {

	public static void main(String[] args) {
		System.out.println(solution(Integer.MAX_VALUE));

	}
	public static int solution(int n) {
		if(n==1)
			return 1;
		if(n==2 || n==3)
			return 2;
		int count=0;
		long i=1;
		while(i*i <n)
		{
			if(n%i==0)
				count+=2;
			i++;	
		}
		if(i*i == n)
			count+=1;
		
		return count;
	}
}

/*public static int solve(int n)
    {
        long ans = 0;
        for(long i=1; i*i<=n; i++) { if(n%i==0) {if(i*i==n) ans+=1; else ans+=2;} }
        return (int)ans;
    }*/
