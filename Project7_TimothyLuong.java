import java.util.Arrays;
import java.util.Scanner;
public class Project7_TimothyLuong
{
	public static void main(String[] args) 
	{
		//Declare Variables
		Scanner input = new Scanner(System.in);
		String data ="";
		int numTokens = 20;
    
		//Loop while it is yes
		do
		{	
			//Pass to methods
			int[] randomNumbers = generateRandomDigits(1, 10, 3);
			int pointsEarn = calculateWin(randomNumbers);

			//Print out the beginning statements
			System.out.println("You have " + numTokens + " tokens.");
			System.out.println("Your spin was " + Arrays.toString(randomNumbers).replace("[","").replace(",","").replace("]",""));
			System.out.println("You earned " + pointsEarn + " points.");
      
			numTokens += pointsEarn;    //Calculate number of tokens
      
			//Print out the final statements
			System.out.println("You now have " + numTokens + " tokens.");
			System.out.println("Would you like to play again? Yes/No");
			data = input.nextLine();
		}while(data.equalsIgnoreCase("yes"));
    
		input.close();   //Close the scanner
	}
	
	//Method for generating random integer in an array
	public static int[] generateRandomDigits(int low, int high, int size)
	{
		int[] randomNumbers = new int[size];
		for(int i = 0; i < randomNumbers.length; ++i)
		{
			randomNumbers[i] = findRandom(low, high);
		}
		return randomNumbers;
	}
	
	//Method to find random integer
	public static int findRandom(int low, int high)
	{
		int randomNumbers = (int)(Math.random() * high) + low;
		return randomNumbers;
	}
  
	//Method for calculate the winning amount
	public static int calculateWin(int[] scores)
	{
		int score = 0;
		//If all integers matches
		if (scores[0] == scores[1] && scores[0] == scores[2] && scores[1] == scores[2])
		{
			//All 7
			if(scores[0] == 7 && scores[1] == 7 && scores[2] == 7)
			{
				score = 750;
			}
			//All 3 integers matches
			else
			{
				score = 75; 
			}
		}
		//If two integers matches
		else if (scores[0] == scores[1] || scores[0] == scores[2] || scores[1] == scores[2])
		{
			//If 2 7's
			if(scores[0] == 7 && scores[1] == 7 || scores[0] == 7 && scores[2] == 7 || scores[1] == 7 && scores[2] == 7)
			{
				score = 20;
			}
			//2 out of 3 matches
			else
			{
				score = 5;
			}
		}
		//No matches
		else
		{
			score = -1;
		}
		return score;
	}
}