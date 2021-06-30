package lesson06.sorting;

/*
 * idea behind this logic is every disc which opens from left, until it gets closed, all the other circles which will open 
 * before its closing will come in its intersection or disc overlapping
 */


import java.util.*;
public class NumberOfDiscIntersections {

	public static void main(String[] args) {
		int arr[]= {1,5,2,1,4,0};
		System.out.println(solution(arr));

	}
	public static int solution(int[] A) {
		long start[] = new long[A.length];
		long end[] = new long[A.length];
		for(int i=0; i<A.length; i++) {
			start[i] = (long) i-A[i];
			end[i] = (long) i+A[i];
		}

		Arrays.sort(start);
		Arrays.sort(end);
		/*for(int i=0;i<start.length;i++)
		{
			System.out.println(start[i]+"  "+end[i]);
		}*/

		int noOfIntersections = 0;
		int noOfCirclesOpen = 0;
		int startPoint = 0;
		int endPoint= 0;
		
		while(startPoint < start.length) {
			if(start[startPoint] <= end[endPoint]) {
				noOfCirclesOpen ++;
				noOfIntersections += noOfCirclesOpen - 1;
				//System.out.println(noOfCirclesOpen+"  "+noOfIntersections);
				if(noOfIntersections > 10000000)
					return -1;
				startPoint ++;
			}
			else {
				//System.out.println(noOfCirclesOpen+"  "+noOfIntersections);
				noOfCirclesOpen --;
				endPoint ++;
			}
		}
		return noOfIntersections;
	}

}
