
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindArms a=new FindArms();
		for(int i=1;i<5001;i++)
		{
			a.ArmstrongOrNot(i);
		}
		System.out.println("-------------------------------");
		a.ArmstrongOrNot(500);
		for(char x='a';x<'z';x++) {
			
		}
		for(float x=0;x<5;x++) {
			
		}
	}

}
class FindArms{
	void ArmstrongOrNot(int nu)
	{
		int num=nu;
		double sum=0;
		int digit=0;
		while(num!=0)
		{
			digit=num%10;
			sum=sum+Math.pow(digit, 3);
			num=num/10;
		}
		if(nu==(int)sum)
		{
			System.out.println(nu);
		}
		else
			System.out.println(nu+" is not an armstrong number");
	}
}
