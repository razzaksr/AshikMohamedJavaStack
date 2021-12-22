package fullstack.ashik.java.AshikJavaBasics;

// break continue

public class Moderators 
{
	public static void main(String[] args) 
	{
		char hey='A';
		for(;hey<=90;hey++)
		{
			if(hey==70||hey==65||hey%2==0)
			{
				continue;
			}
			System.out.println(hey);
		}
		
		
		
		hey='A';
		for(;hey<=90;hey++)
		{
			if(hey==70)
			{
				break;//continue;
			}
			System.out.println(hey);
		}
	}
}
