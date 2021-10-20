package fullstack.ashik.java.AshikJavaBasics;

import java.util.Scanner;

public class SimpleScannerTest 
{
	public static void main(String[] args) 
	{
		Scanner mohamed=new Scanner(System.in);
		
		System.out.println("Tell us how many mobiles you want: ");
		int count=mohamed.nextInt();
		int costToBePaid=count*17000;
		System.out.println("Enter the amount to place order :");
		int userPay=mohamed.nextInt();
		if(userPay>=costToBePaid)
		{
			System.out.println("Your Order for Realme X8Pro quantity "+count+" has placed");
		}
		else
		{
			System.out.println("Amount is insufficient to place order");
		}
		
		mohamed.close();
	}
}
