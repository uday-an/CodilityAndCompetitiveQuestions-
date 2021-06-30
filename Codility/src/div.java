
public class div {

	public static void main(String[] args) {
		System.out.println(solution("bytdag",new int[] {4,3,0,1,2,5}));

	}
	public static String solution(String S, int[] A)
	{
		String ans="";
		ans=ans+S.charAt(0);
		int i=A[0];//3
		while(A[i]!=0)
		{
			ans=ans+S.charAt(i);
			i=A[i];
		}
		ans=ans+S.charAt(i);
		return ans;
	}
}
