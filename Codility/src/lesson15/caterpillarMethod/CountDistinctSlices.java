package lesson15.caterpillarMethod;

import java.util.*;
public class CountDistinctSlices {

	public static void main(String[] args) {
		int a[]= {1,2,3,2,1};
		System.out.println(solution(6,a));

	}
	public static int solution(int m, int[] a) {
		 if(a.length==0)
	            return 0;
	        long count=0;
	        int c=1;
	        int l=a.length;
	        HashSet<Integer> hs=new HashSet<Integer>();
	        hs.add(a[0]);
	        long presize=1;
	        while(c<l)
	        {
	            hs.add(a[c]);
	            long cursize=hs.size();
	            if(cursize>presize)
	            {
	                presize=cursize;
	                c++;
	                continue;
	            }
	            else
	            {
	                //count+=(cursize*(cursize+1))/2;
	                int dupval=a[c];
	                long t=c;
	                c--;
	                while(c>-1 && a[c]!=dupval)
	                {
	                    c--;
	                }
	                c++;
	                t=t-c;
	                count+=((cursize*(cursize+1))/2)-((t*(t+1))/2);
	                
	                if(count>=1000000000)
		            	return 1000000000;
	                presize=1;
	                hs.clear();
	                hs.add(a[c]);
	                c++;
	                
	            }
	            
	        }
	        count+=(presize*(presize+1))/2;
	        if(count>=1000000000)
            	return 1000000000;
	        return (int)count;
	}
}




/*
int beg=0,end=0,noOfSlice=0;
boolean[] visited = new boolean[M+1];
while(beg<A.length && end<A.length) {
    if(!visited[A[end]]) {
        visited[A[end]]=true;
        noOfSlice += end-beg+1;
        end++;
        if(noOfSlice>=1000000000)
            return 1000000000;
    }else {
        visited[A[beg]]=false;
        beg++;
    }
}
return noOfSlice;
*/
