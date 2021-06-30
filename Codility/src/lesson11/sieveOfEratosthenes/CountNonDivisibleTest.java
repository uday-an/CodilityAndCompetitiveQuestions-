package lesson11.sieveOfEratosthenes;


//by sir
import java.util.*;
public class CountNonDivisibleTest {
	public static void main(String[] args) {
	    
        int array[]= {3,1,2,3,6};
        CountNonDivisible2 cntNonDiv = new CountNonDivisible2();
        int ans[] = cntNonDiv.solution(array);
        System.out.println(Arrays.toString(ans));
    }
}
class CountNonDivisible2
{
    public int[] solution(int A[]) {
        
        int counts[] = new int[A.length*2 +1];
        
        for (int i : A) {
            counts[i]++;
        }
        for(int i=0;i<counts.length;i++) {
        //for (int i : counts) {
            System.out.println(i+" "+counts[i]);
        }
        
        int divisorsNum[] = new int[counts.length];
        for(int i=1;i*i < divisorsNum.length;i++)
        {
            for(int j=i*i; j< divisorsNum.length; j=j+i)
            {
                divisorsNum[j] += counts[i];
                if(j!=i*i) {
                    divisorsNum[j] += counts[j / i ];
                }
            }
        }
        int finalResult[] = new int [ A.length ];
        for(int i=0;i< finalResult.length;i++) {
            finalResult[i]= A.length - divisorsNum[A[i]];
        }
        
        return finalResult;
    }
}