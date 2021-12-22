package fullstack.ashik.java.AshikJavaBasics;

public class Sequence 
{
	public static void main(String[] args) 
	{
		char salem='a';// 97
		for(;salem<=122;salem+=2)
		{
			System.out.println(salem);
		}
		// infinite loop
		/*
		while(true)
		{
			System.out.println("While endless");
		}
		*/
		
		/*
		do
		{
			System.out.println("Do Endless");
		}while(true);
		*/
		
		for(;;)
		{
			System.out.println("For Endless");
		}
	}
}
