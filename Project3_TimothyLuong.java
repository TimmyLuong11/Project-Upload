import java.util.Scanner;
public class Project3_TimothyLuong 
{
	public static void main(String[] args)
	{
		//Declare any variables 
		Scanner keyboard = new Scanner(System.in);
			
		//Print input statement 
		System.out.println("Enter the name of the first type of yarn");
		String type = keyboard.nextLine();
		System.out.println("Enter the number of yards per ball of yarn");
		double numOfYard = keyboard.nextDouble();
		if(numOfYard < 0)
		{
			System.out.println("The number of yards per ball must be positive, please re-enter");
			numOfYard = keyboard.nextDouble();
		}
		System.out.println("Enter the number of balls needed");
		double numBalls = keyboard.nextDouble();
		if(numBalls < 0)
		{
			System.out.println("The number of ball must be positive, please re-enter");
			numBalls = keyboard.nextDouble();
		}
		keyboard.nextLine();
		System.out.println("Enter the name of the substituted yarn");
		String subYarn = keyboard.nextLine();	
		System.out.println("Enter the number of yards per ball");
		double yardPerBall = keyboard.nextDouble();
		if(yardPerBall < 0)
		{
			System.out.println("The number of ball must be positive, please re-enter");
			yardPerBall = keyboard.nextDouble();
		}
			
		//Do math
		double subAmount = Math.ceil(numOfYard * numBalls / yardPerBall); 

		//Print out final statement
	    System.out.println("You should purchase " + (int)subAmount + " balls of " + subYarn + " instead of " + (int)numBalls + " of " + type);
  }
}
