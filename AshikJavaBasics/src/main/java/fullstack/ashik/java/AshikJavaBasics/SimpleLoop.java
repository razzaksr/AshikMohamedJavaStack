package fullstack.ashik.java.AshikJavaBasics;

import java.util.Scanner;

public class SimpleLoop 
{
	public static void main(String[] args) 
	{
		Scanner mohamed=new Scanner(System.in);
		
		int stock=40;
		while(stock>0)// sale continue until stock becomes 0
		{
			System.out.println("Tell us how many mobiles you want: ");
			int count=mohamed.nextInt();
			if(count<=stock)// can we place order for the buyer who order the count
			{
				int costToBePaid=count*17000;
				System.out.println("Enter the amount to place order :");
				int userPay=mohamed.nextInt();
				if(userPay>=costToBePaid)// whether buyer amount meets its payable money
				{
					System.out.println("Your Order for Realme X8Pro quantity "+count+" has placed");
					stock-=count;// stock=stock-count
				}
				else
				{
					System.out.println("Amount is insufficient to place order");
				}
			}
			else
			{
				System.out.println("Insifficient stock to place order");
			}
		}
		
		mohamed.close();
	}
}
