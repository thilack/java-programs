package project1;

import java.util.Scanner;

public class Bankpro {
	int balance=0;
	Scanner t=new Scanner(System.in);
	void balance()
	{
		System.out.println("your balance is"+balance);
		
	}
	void deposit()
	{
		System.out.println("enter your deposite amount:");
		int deposit=t.nextInt();
	balance=balance+deposit;
	System.out.println("your new balane is"+balance);
		
	}
	void withdraw()
	{
		System.out.println("enter the amount");
		int withdraw=t.nextInt();
	withdraw=balance-withdraw;
	System.out.println("your new balance is:"+withdraw);
	if(withdraw<80)
	{
		System.out.println("your balance is too low");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter your account number");
		int num=s.nextInt();
		System.out.println("thilack baskaran");
		System.out.println("type of account 1.salary a/c 2.student a/c");
		int acc=s.nextInt();
		if(acc==1)
		{
			System.out.println("welcome to salary account");
		}else
		{
			System.out.println("welcome to student account");
		}
		Bankpro b=new Bankpro();
				
	b.balance();
	b.deposit();	
		b.withdraw();

	}
	

}
