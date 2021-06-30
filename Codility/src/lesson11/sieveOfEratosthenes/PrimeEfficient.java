package lesson11.sieveOfEratosthenes;

public class PrimeEfficient {

	public static void main(String[] args) {
		solution(17);

	}
	public static void solution(int n)
	{
		boolean prime[]=new boolean[n+1];
		for(int i=0;i<n+1;i++)
			prime[i]=true;
		
		for(int p=2;p*p<=n;p++)
		{
			if(prime[p]==true)
			{
				for(int i=p*2;i<=n;i+=p)
				{
					System.out.println(i);
					prime[i]=false;
				}
			}
		}
		System.out.println("-----------");
		System.out.println(prime[17]);
		for(int i=2;i<=n;i++)
		{
			if(prime[i]==true)
				System.out.println(i);
		}
	}

}

/*
 public class FactorizationTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arrayF[] = makeArray(20);
        for (int i = 0; i < arrayF.length; i++) {
            System.out.print("\t"+i);
        }
        System.out.println();
        for (int i = 0; i < arrayF.length; i++) {
            
            System.out.print("\t"+arrayF[i]);
            
        }
        System.out.println("---------------");
        int array[]=factorization(18, arrayF);
        for (int i = 0; i < arrayF.length; i++) {
            System.out.print("\t"+array[i]);
        }
    }
        

public    static int[] factorization(int x, int arrayF[])
    {
        int primeFactors[] = new int [ arrayF.length ];
        //System.out.println("\t" +arrayF[x]);
        while(arrayF[x] > 0) {
            
            primeFactors[x] = primeFactors[x] + arrayF[x];
            x/=arrayF[x];
            primeFactors[x]= primeFactors[x]+primeFactors[x]; 
        }
        return primeFactors;
    }
    

public static int[] makeArray(int N) {
        int F[] = new int[N+1];
        int i=2;
        int k=0;
        
        while( i*i < N-1)
        {
            if(F[i] == 0) 
                k=i*i;
            while(k<N-1) {
                if(F[k]==0) 
                    F[k]=i;
                k+=i;
                //System.out.println("F[k]"+F[k]);
            }
            i=i+1;
        }
        return F;
    }
}
 */
