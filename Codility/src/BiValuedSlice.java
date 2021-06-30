/*
 * A Zero Indexed Array A consisting of N integers is given. A pair of integers (P,Q) such that 0<=P<=Q
that, given an Array A consisting of N integers, returns the size of the largest bi-valued slice in A.

For example : A[0] = 5, A[1] = 4, A[2] = 4, A[3] = 5, A[4] = 0, A[5] = 12 the function should return 4, 
because (0,3) is a slice containing only 4 and 5. Note that a bi-valued slice can also contain just one value. 
Slice(3,5) is not bi-valued since it consists of three different numbers.
 */


//Solution in O(n) to O(nlogn)

public class BiValuedSlice {

	public static void main(String[] args) {
		int arr[]= {1,1,1,1,1,1,1,1,9};//only 2 value present
		System.out.println(solution(arr));
		int arr0[]= {};//empty array
		System.out.println(solution(arr0));
		int arr1[]= {1,1,1,1,1,1};//extreme case only 1 value, whole length should be the answer
		System.out.println(solution(arr1));
		int arr2[]= {5,4,4,5,0,12};//example in the question
		System.out.println(solution(arr2));
		int arr3a[]= {6,7,6,7,6,7,6,7};//2 values multiple repetition
		System.out.println(solution(arr3a));
		int arr3b[]= {6,6,6,6,7,7,7};//2 values in order with multiple repetition
		System.out.println(solution(arr3b));
		int arr4[]= {6,6,6,6,7,7,7,8,8,8};//3 values
		System.out.println(solution(arr4));
		int arr5[]= {5,4,4,5,5,5,0,12};//random
		System.out.println(solution(arr5));
		int arr6[]= {5,4,4,5,5,5,8,8,8,0,12};//random multiple with equal bi valued
		System.out.println(solution(arr6));
		int arr7[]= {5,4,4,5,5,5,8,8,8,8,0,34,12,56,4,4,4,5,4,5,4,5,4,5,5,5,5,4,4,4,5,12};//many cases of repetition
		System.out.println(solution(arr7));
		int arr8[]= {-1,3,-6,-2,5,-2,5,7,8,9};//with negative numbers
		System.out.println(solution(arr8));
		int arr9[]= {1,2,3,4,5,6,-12344,7,8,9,-231};//random
		System.out.println(solution(arr9));
		

	}
	public static int solution(int[] a) {
		if(a.length==0)
			return 0;
		
		int max=0;
		int initial=0,second=0;
		int val2 = 0;//to take care of second value
		int k=1;
		int val1=a[0];//to take care of the first value
		int l=a.length;
		int prev=0;
		
		//first loop from 1 to k where k<=l, to find the first 2 different numbers
		while(k<l)
		{
			if(a[k]!=val1)
			{
				val2=a[k];
				second=k;
				k++;
				prev=val2;
				break;
			}
			k++;
		}
		
		if(second==0 || second==l-1)//if only 1 or 2 number is present throughout the array, whole length is the answer
			return l;
//Remember it is given in the question that only 1 value can also make Bi-valued slice
		
		
//Below is the loop for k to l
		
// Hence whole code in O(l) only
		for(int i=k;i<l;i++)
		{
			if(a[i]!=val1 && a[i]!=val2)//if new value is found other than previous 2
			{
				max=Math.max(max, i-initial);//find the size of slice till now
				initial=second;
				second=i;
				val1=prev;//update the new val1 as the previous value
				prev=a[i];//keep update of the previous value
				val2=a[i];//update the new val2 as the new value found
			}
			else {
				if(a[i]!=a[i-1])
				{
					second=i;//keep update of at what location previous value has started
					prev=a[i];//keep update of the previous value
				}
			}
		}
		
		if(initial==0)//if no new value is found initial will remain same, hence the whole length is answer
			return l;
		
		return max;
	}
}
