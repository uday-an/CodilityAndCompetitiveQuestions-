package trees;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws Exception{
		
		Scanner obj=new Scanner(System.in);
		int noOfObjects=obj.nextInt();
		Account c[]=new Account[noOfObjects];
		for(int i=0;i<noOfObjects;i++)
		{
			int number=obj.nextInt();
			int noOfAccountHolders=obj.nextInt();
			obj.nextLine();//
			String acType=obj.nextLine();//
			int balance=obj.nextInt();
			c[i]=new Account(number, noOfAccountHolders, acType, balance);
		}
		obj.nextLine();//
		String accttype=obj.nextLine();//
		Account c1=findAccountWithMaximumNoOfAccountHolders(c);
		if(c1==null)
		{
			System.out.println("No Account found with mentioned attribute");
		}
		else
		{
			System.out.println("number-"+c1.getNumber());
			System.out.println("noOfAccountHolders-"+c1.getNoOfAccountHolders());
			System.out.println("acType-"+c1.getAcType());
			System.out.println("balance-"+c1.getBalance());
		}
		Account c2=searchAccountByAcType(c, accttype);
		if(c2==null)
		{
			System.out.println("No Account found with mentioned attribute");
		}
		else
		{
			System.out.println("number-"+c2.getNumber());
			System.out.println("noOfAccountHolders-"+c2.getNoOfAccountHolders());
			System.out.println("acType-"+c2.getAcType());
			System.out.println("balance-"+c2.getBalance());
		}

	}

	public static Account findAccountWithMaximumNoOfAccountHolders(Account[] c)
	{
		if(c.length==0)
		{
			return null;
		}
		Account ans=c[0];
		int maxPin=c[0].getNoOfAccountHolders();
		
		for(int i=1;i<c.length;i++)
		{
			if(c[i].getNoOfAccountHolders()>maxPin)
			{
				ans=c[i];
				maxPin=c[i].getNoOfAccountHolders();
			}
		}
		return ans;
	}
	
	public static Account searchAccountByAcType(Account[] c, String accttype)
	{
		if(c.length==0)
		{
			return null;
		}
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i].getAcType().equalsIgnoreCase(accttype))
			{
				return c[i];
			}
		}
		return null;
	}
	
}

class Account{
	private int number;
	private int noOfAccountHolders;
	private String acType;
	private int balance;
	
	
	
	
	public Account(int number, int noOfAccountHolders, String acType, int balance) {
		super();
		this.number = number;
		this.noOfAccountHolders = noOfAccountHolders;
		this.acType = acType;
		this.balance = balance;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNoOfAccountHolders() {
		return noOfAccountHolders;
	}
	public void setNoOfAccountHolders(int noOfAccountHolders) {
		this.noOfAccountHolders = noOfAccountHolders;
	}
	public String getAcType() {
		return acType;
	}
	public void setAcType(String acType) {
		this.acType = acType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}