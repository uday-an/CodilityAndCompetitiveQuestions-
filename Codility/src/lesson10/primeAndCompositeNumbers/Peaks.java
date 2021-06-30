package lesson10.primeAndCompositeNumbers;


import java.util.*;
public class Peaks {

	public static void main(String[] args) {
		//int arr[]= {1,2,3,4,3,4,1,2,3,4,6,2};
		int arr1[]= {1,2,3,4,5,7,6};
		System.out.println(solution(arr1));

	}
	public static int solution(int[] A) {
		int N = A.length;

	    ArrayList<Integer> peaks = new ArrayList<Integer>();
	    for(int i = 1; i < N-1; i++){
	        if(A[i] > A[i-1] && A[i] > A[i+1]) 
	        	peaks.add(i);
	    }
	    if(peaks.size()==0)
	    	return 0;

	    for(int size = peaks.get(0)+1; size <= N; size++){
	        if(N % size != 0) 
	        	continue;
	        int find = 0;
	        int groups = N/size;
	        for(int peakIdx : peaks){
	            if(peakIdx/size > find){
	                break;
	            }
	            if(peakIdx/size == find) find++;
	        }
	        if(find == groups) 
	        	return groups;
	       
	    }

	    return 0;
	}
}
