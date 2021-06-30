package lesson02.arrays;

import java.util.HashMap;
import java.util.Set;

public class OddOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=0;
		int arr[]= {9,9};
		for (int i = 0; i < arr.length; i++)  
        { 
            res = res ^ arr[i]; 
            System.out.println(res);
        } 
		System.out.println("----------");
		String g="LTI";
		int ar[]= {12,5,6,4,6,7};
		for (int i = 0; i < ar.length; i++)  
        { 
            System.out.println(ar[i]);
        } 
		System.out.println(g);
		
		
		System.out.println("----------");
		solution1(ar,g);
		System.out.println("----------");
		
		//An array in Java is an object. When you create an array via new, it's created on the heap and
		//a reference value (analogous to a pointer in C) is returned and assigned to your variable.
		
		for (int i = 0; i < ar.length; i++)  
        { 
            System.out.println(ar[i]);
        } 
		System.out.println(g);
		
	}
	public static int solution(int a[])
	{
		if(a.length==1)
			return a[0];
		int x=0;//for boolean interpretation
		for (int i = 0; i < a.length; i++)  
        { 
            x = x ^ a[i];
            //System.out.println(x);
        } 
		
		
		return x;
	}
	public static void solution1(int a[], String x)
	{
		System.out.println("in function");
		for(int i=0;i<a.length;i++)
		{
			a[i]=a[i]+100;
			System.out.println(a[i]);
		}
		x="LTI mumbai";
		System.out.println(x);
		System.out.println("------------------");
	}
	
	public static int solution2(int a[])
	{
		HashMap<Integer, Integer> h=new HashMap<>();
		h.put(a[0], 1);
		int oddOne=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(h.containsKey(a[i]))
			{
				h.put(a[i], h.get(a[i])+1);
			}
			else
			{
				h.put(a[i],1);
				
			}
			
			
		}
		Set<Integer> arr=h.keySet();
		for(int i:arr)
		{
			if(h.get(i)%2==1)
			{
				return i;
			}
		}
		return oddOne;
		
		
	}

}


/*
XOR-- in binary interpretation (0 and 1), 0 if two nos are same
and 1 for different.

Same case with the decimal-- 0 and no. is the same no.( 0^9=9)
and same nos. is 0 (9^9=0)

so if nos are 5,5,5,6,6,7,8,7,8
XOR of all above will give 0 for all same no. PAIRS and output will be 0^non pair numbers
i.e. 0^5 which is 5

*/