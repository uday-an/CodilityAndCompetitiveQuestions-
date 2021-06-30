package lesson11.sieveOfEratosthenes;

public class CountSemiprimes {

	public static void main(String[] args) {
		int p[]= {1,4,16};
		int q[]= {26,10,20};
		int arr[]=solution1(26,p,q);
		for(int i:arr)
			System.out.println(i);

	}
	
	public static int[] solution1(int N, int[] p, int[] q) {
		int len=p.length;
		int soln[]=new int[len];
		 int F[] = new int[N+1];
	        int i=2;
	        int k=0;
	        
	        while( i*i <=N)
	        {
	            if(F[i] == 0) 
	                k=i*i;
	            while(k<=N) {
	                if(F[k]==0) 
	                    F[k]=i;
	                k+=i;
	                //System.out.println("F[k]"+F[k]);
	            }
	            i=i+1;
	        }
	        int semiprime[]=new int[N+1];
	        for(int t=4;t<(N+1);t++)
	        {
	        	if(F[t]!=0)
	        	{
	        		if(factorization(t,F))
	        		{
	        			semiprime[t]=1;
	        		}
	        	}
	        }
	        for(int t=2;t<N;t++)
				semiprime[t+1]+=semiprime[t];
	        
	        int f=0;
	        for(int t:semiprime)
	        {
	        	
	        	System.out.println(f+" "+t);
	        	f++;
	        }
	        
	        System.out.println("-------------Answer Below-------------");
	        for(int t=0;t<len;t++)
			{
				soln[t]=semiprime[q[t]]-semiprime[p[t]-1];

			}
		return soln;
	}
	public static boolean factorization(int x, int arrayF[])
    {
        //int primeFactors[] = new int [ arrayF.length ];
        //System.out.println("\t" +arrayF[x]);
		int count=0;
        while(arrayF[x] > 0) {
            count++;
            //primeFactors[x] = primeFactors[x] + arrayF[x];
            x/=arrayF[x];
           // primeFactors[x]= primeFactors[x]+primeFactors[x]; 
        }
        count++;
        if(count==2)
        	return true;
        return false;
    }
}
