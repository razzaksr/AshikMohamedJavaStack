package fullstack.ashik.java.AshikJavaBasics;

import java.util.Scanner;

public class Realtime 
{
	public static void main(String[] args) 
	{
		System.out.println("Stock clearance sale");
		Scanner scan=new Scanner(System.in);
		double income=0.0, acPrice=38000.5; int stock=40;
		
		for(int days=1;days<=5 && stock>0;days++)
		{
			System.out.println("Tell us how many ac sold today:");
			int count=scan.nextInt();
			income+=(count*acPrice);
			stock-=count;
			
			acPrice-=(acPrice*0.0750);
			//acPrice=acPrice-(acPrice*7.5)/100;
		}
		
		System.out.println("Total income: "+income);
		System.out.println("Stock left: "+stock);
		
		scan.close();
	}
}
