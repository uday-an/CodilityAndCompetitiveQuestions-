package lesson17.dynamicProgramming;

public class NumberSolitaire {

	public static void main(String[] args) {
		int arr[]= {1,-2,0,9,-1,-2};
		System.out.println(solution(arr));
		System.out.println(arr[0]+" "+arr[3]);

	}
	//first efficient solution using space
	public static int solution3(int A[])
    {
        int temp[] = new int[A.length]; //1,-2,0,9,-1,-2
        
        temp[0] = A[0]; //1
        
                
        for(int i=1;i<A.length;i++) {
            
            int maxValue = Integer.MIN_VALUE; //-2147483648
            
            for(int die=1;die<=6;die++) {
                if( i-die >= 0 ) {
                    maxValue = Math.max(temp[i-die] + A[i], maxValue);
                }
                temp[i] = maxValue;
            }
        }
        
        return temp[A.length-1];
    }
	//2nd efficient solution exactly similar to first
	public static int solution(int[] a) {
        
        int n=a.length;
        
        for(int i=1;i<n;i++){
            int v = a[i], maxResult = Integer.MIN_VALUE;    
            System.out.println("--- "+i+"  "+v);// maxResult : used to find the, max result till index i
            for(int j=1;j<=6;j++){  // Iterate for dice values and use the pre-computed max results till (i-1) to find the max result for ith index
                if(i-j>=0){
                    maxResult = Math.max(maxResult, v+a[i-j]);  
                    System.out.println(maxResult);
                }
            }
            a[i]= maxResult;                                    // update the max result for index i 
        }
        return a[n-1];    
    }
	
	//Below is not an efficient solution
	public static int solution1(int[] a) {
        int n=a.length;
        long sum=a[0];
        int min=Integer.MIN_VALUE;
        int counter=0,k=0,loc=0;
        
        for(int i=1;i<n;i++)
        {
            k=i;
            counter=Math.min(6,n-i);
            while(counter>0 && a[k]<1)
            {
                counter--;
                if(a[k]>min)
                {
                    min=a[k];
                    loc=k;
                }
                k++;
                if(counter==0)
                {
                    min=a[k-1];
                    loc=k-1;
                }
            }
            if(counter!=0)
            {
                sum+=a[k];
                i=k;
            }
            else
            {
                sum+=min;
                min=Integer.MIN_VALUE;
                i=loc;
            }
        }
        return (int)sum;
    }
}

/*
class Solution {
    public int solution(int[] A) {
        int n = A.length;
        int output[] = new int[n];
        output[0] = A[0];
        for(int i = 1; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = i-1; j>=0 && j >= i- 6 ; j--)
                max = Math.max(max, output[j]);
            output[i] = A[i] + max;
        }
        return output[n-1];
    }
*/