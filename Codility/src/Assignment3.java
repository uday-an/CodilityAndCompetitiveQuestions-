
public class Assignment3 {

	public static void main(String[] args) {
		String str="hello everyone";
		System.out.println(solution(str,8));

	}

	public static int solution(String s, int k)
	{
		int count=0;
		String str[]=s.split(" ");
		//System.out.println(str.length);
		int sum=0;
		int len=str.length;
		int initial=0;
		for(int i=0;i<len;i++)
		{
			if(str[i].length()>k)
				return -1;
			if((sum+str[i].length()+i-initial)<k)
			{
				sum=sum+str[i].length();
			}
			else if((sum+str[i].length()+i-initial)==k)
			{
				//sum=sum+str[i].length()+i-initial;
				sum=0;
				initial=i+1;
				count++;
			}
			else
			{
				count++;
				sum=0;
				initial=i;
				i--;
				
			}
		}
		if(sum>0)
			count=count+1;
		
		return count;
	}
}
