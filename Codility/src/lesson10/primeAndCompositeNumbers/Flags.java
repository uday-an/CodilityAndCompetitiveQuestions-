package lesson10.primeAndCompositeNumbers;

import java.util.*;

public class Flags {

	public static void main(String[] args) {
		//int arr[]= {1,5,3,4,3,4,1,2,3,4,6,2};
		int arr[]= {1,10,1,10,1,10,1,10,1,10,1};
		System.out.println(solution(arr));
	}
	public static int solution(int[] a) {
		int n = a.length;

	    ArrayList<Integer> peaks = new ArrayList<Integer>();
	    for(int i = 1; i < n-1; i++){
	        if(a[i] > a[i-1] && a[i] > a[i+1]) 
	        	peaks.add(i);
	    }
	    if(peaks.size()==0)
	    	return 0;
	    if(peaks.size()==1)
	    	return 1;
	    Integer arr[]=new Integer[peaks.size()];
	    peaks.toArray(arr);	    
	    		
	    int k=(int)(Math.sqrt(n)+1);
	    int sf=2;
	    int count;
	    int max=0;
	    while(sf<=k) {
	    count=1;
	    int next=arr[0]+k;
	    int check=0;
	    //System.out.println(next);
	    for(int peak:arr)
	    {
	    	if(check==0)
	    	{
	    		check=1;
	    		continue;
	    	}
	    	if(peak>=next)
	    	{
	    		//System.out.println(peak);
	    		count++;
	    		if((long)(peak+k)>n || count==k)
	    			break;
	    		next=peak+k;
	    		//System.out.println(next);
	    	}
	    	//System.out.println("----------------");
	    }
	    if(count>max)
	    {
	    	max=count;
	    	sf=max;
	    	//System.out.println("for "+k+" -- "+ max);
	    	if(count==k)
	    		break;
	    }
	    k--;
	    }
	    return max;
	    
}
}


/* for(int i=0;i<k-1;i++)
{
	int peak=peaks.get(i);
	int next=peaks.get(i)+k;
	for(int j=i+1;j<k;j++)
	{
		if(peaks.get(j)>=next)
    	{
    		count++;
    		next=peaks.get(j)+k;
    	}
	}
	max=Math.max(max, count);
	count=1;
}*/




//below is 100%
/* public int solution(int[] A) {  
ArrayList<Integer> array = new ArrayList<Integer>();  
for (int i = 1; i < A.length - 1; i++) {  
 if (A[i - 1] < A[i] && A[i + 1] < A[i]) {  
  array.add(i);  
 }  
}  
if (array.size() == 1 || array.size() == 0) {  
 return array.size();  
}  
int sf = 1;  
int ef = array.size();  
int result = 1;  
while (sf <= ef) {  
 int flag = (sf + ef) / 2;  
 boolean suc = false;  
 int used = 0;  
 int mark = array.get(0);  
 for (int i = 0; i < array.size(); i++) {  
  if (array.get(i) >= mark) {  
   used++;  
   mark = array.get(i) + flag;  
   if (used == flag) {  
    suc = true;  
    break;  
   }  
  }  
 }  
 if (suc) {  
  result = flag;  
  sf = flag + 1;  
 } else {  
  ef = flag - 1;  
 }  
}  
return result;  
}  */