import java.util.Scanner;
public class Project4_TimothyLuong 
{
	public static void main(String[] args)
	{
		//Declare any variable
		Scanner input = new Scanner(System.in);
		int sum = 0;

		//Print out test statement
		System.out.println("Answer yes or no to the following quesitons.");
		System.out.println("I am falling further behind in many of the responsibilities in my life.");
		String data = input.nextLine();
		if(data.equals("yes") || data.equals("Yes"))
		{
			sum = sum + 1;
		}
		else
		{
			sum = sum + 0;
		}
		System.out.println("I feel tired most of the time.");
		data = input.nextLine();
		if(data.equals("yes") || data.equals("Yes"))
		{
			sum = sum + 1;
		}
		else
		{
			sum = sum + 0;
		}
		System.out.println("I am falling further behind in many of the responsibilities in my life.");
		data = input.nextLine();
		if(data.equals("yes") || data.equals("Yes"))
		{
			sum = sum + 1;
		}
		else
		{
			sum = sum + 0;
		}
	
		//Print out final statement
		if(sum == 0)
		{
			System.out.println("You're more exhausted than stressed out");
		}
		else if(sum == 1)
		{
			System.out.println("You're beginning to stress out");
		}
		else if(sum == 2)
		{
			System.out.println("You're possibly stressed out");
		}
		else
		{
			System.out.println("You're probably stressed out");
		}
		input.close();
	}
}