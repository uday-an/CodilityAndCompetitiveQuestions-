package lesson12.euclideanAlgorithm;
/*
 Note that the GCD will need to contain all of the prime factors of both numbers for the answer to be true, so check if newa = a/GCD and newb = b/GCD can be reduced to 1 by repeatedly dividing them by Euclid(newa, GCD) and Euclid(newb, GCD) until newa and newb reach 1 which is success, or Euclid(newa, GCD) or Euclid(newb, GCD) returns 1 which is a fail.
Let's see how this works for a = 75, b = 15:

1) GCD = Euclid(75, 15) = 15
2) newa = 75/15 = 5, newb = 15/15 = 1, done with newb
3) newa = 5/Euclid(15, 5) = 5/5 = 1 success!

How about a = 6, b = 4:

1) GCD = Euclid(6, 4) = 2
2) newa = 6/2 = 3, newb = 4/2 = 2
3) Euclid(2, newa) = Euclid(2, 3) = 1 fail!

How about a = 2, b = 16:

1) GCD = Euclid(2, 16) = 2
2) newa = 2/2 = 1 (that's good), newb = 16/2 = 8
3) newb = 8/Euclid(2, 8) = 8/2 = 4
4) newb = 8/Euclid(2, 4) = 2
5) newb = 2/Euclid(2, 2) = 1 success!
  
 */


public class CommonPrimeDivisors {

	public static void main(String[] args) {
		int a[]= {1};
		int b[]= {1};
		System.out.println(solution(a,b));

	}
	public static int solution(int[] a, int[] b)
	{
		int len=a.length;
		int count=0;
		
		for(int i=0;i<len;i++)
		{
			if(a[i]==b[i])
			{
				count++;
				continue;
			}
			int div=gcd(a[i],b[i]);
			System.out.println(div);
			if(div==1)
				continue;
			//int dupa=a[i],dupb=b[i];
			int dupa=a[i]/div;
			int dupb=b[i]/div;
			if(dupa==1 && dupb==1)
				{
				count++;
				continue;
				}
			while(true)
			{
				if(dupa!=1)
				{
					int newgcda=gcd(div,dupa);
					if(newgcda==1)
						break;
					dupa=dupa/newgcda;
				}
				if(dupb!=1)
				{
					int newgcdb=gcd(div,dupb);
					if(newgcdb==1)
						break;
					dupb=dupb/newgcdb;
				}
				if(dupa==1 && dupb==1)
				{
				count++;
				break;
				}
			}
		}
		
		return count;
	}
	public static int gcd(int a, int b)
	{
		if(a%b==0)
			return b;
		else
			return gcd(b,a%b);
		
	}

}


/*public int solution(int A[], int B[]) {
        
        int count=0;
        for(int i=0;i<A.length;i++) {
            if(itHasSamePrimeDivisors(A[i], B[i]))
                count++;
        }
        return count;
    }
    
    int gcd(int a, int b) { //calculate the gcd
        if(a % b == 0) 
            return b;
        return gcd(b,a % b);
    }
}

class CommonPrimeDivisors
{
                                            //15     75  
    public boolean itHasSamePrimeDivisors(int a, int b) {
        int gcdValue = gcd(a,b); // 15 75   --- 15
        
        int gcdA; int gcdB;
        while(a!=1) {
            gcdA = gcd(a,gcdValue); // 15,15
            if(gcdA==1) 
                break;
            a = a/gcdA;
        }
        if(a!=1) {
            return false;
        }
        while(b!=1) {
            gcdB = gcd(b,gcdValue); // 75 15 -- 15 
            if(gcdB==1) 
                break;
            b = b/gcdB; // 75 / 15 
        }
        
        return b==1;
            
    }

public int solution(int A[], int B[]) {
        
        int count=0;
        for(int i=0;i<A.length;i++) {
            if(itHasSamePrimeDivisors(A[i], B[i]))
                count++;
        }
        return count;
    }
    


    int gcd(int a, int b) { //calculate the gcd
        if(a % b == 0) 
            return b;
        return gcd(b,a % b);
    }
}*/
