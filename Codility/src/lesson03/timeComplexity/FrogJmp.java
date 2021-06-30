package lesson03.timeComplexity;
 import java.util.*;
public class FrogJmp {

	public static void main(String[] args) {
		System.out.println(solution(10,100,30));
	}
	public static int solution(int x, int y, int d)
	{
		int hops=0;
		y=y-x;//find total distance between 2 points
		if(y%d==0)
			hops=y/d;
		else
			hops=(y/d)+1;
		return hops;
	}
}
