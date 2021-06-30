package lesson05.prefixSum;

public class CountDiv {
	public static void main(String[] args) {
		System.out.println(solution(11,345,17));
		
	}
	public static int solution(int a, int b, int k) {
		if(a==b)
			if(b%k==0)
				return 1;
			else
				return 0;
		if(a%k!=0)
			a=a+(k-(a%k));	
		b=b-(b%k);
		
		return ((b-a)/k)+1;
						
	}
}
