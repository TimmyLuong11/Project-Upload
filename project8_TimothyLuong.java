import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class project8_TimothyLuong
{

	public static void main(String[] args) throws FileNotFoundException
	{
		//Pass the data to each method
		String[] data = enterData("SampleData.txt");
		changeToLowerCase(data);
    
		//Sort the data
		Arrays.sort(data);
    
		//Find the most common food
		String commonFood = findMostCommonFood(data);
	  
		//Method for printing the data
		printData(data);

		//Print out the statement 
		System.out.println("The most common food is: " + commonFood);
	}
	
	//Method for taking in the txt file
	public static String[] enterData(String fileName) throws FileNotFoundException
	{
		//Declare Variables
		Scanner dataList = new Scanner(new File(fileName));
		int count = 0;
		
		//Loop to find the number of lines
		while(dataList.hasNextLine())
		{
			++count;
			dataList.nextLine();
		}
		dataList.close();
		
		//Declaring new variables
		String[] dataResult  = new String[count];
		dataList = new Scanner(new File(fileName));
		
		//Loop for an array
		for(int i = 0; i < count; ++i)
		{
			dataResult[i] = dataList.nextLine();
		}
		dataList.close();
		return dataResult;
	}
  
	//Method for sorting the data
	public static void changeToLowerCase(String[] data)
	{
		//Loop to change all to lower case
		for(int i=0; i < data.length; ++i)
		{
			String dataString = data[i];
			data[i] = dataString.toLowerCase();
		}
	}
	
	//Method for find the most common 
	public static String findMostCommonFood(String[] data)
	{
		//Declare Variables 
		int max = 0;
		int count = 0;
		String commonFood = "";
		
		//Loop for finding the common food
		for(int i = 1; i < data.length; ++i)  
		{
			if(data[i].equalsIgnoreCase(data[i - 1]))
			{
				++count;
			}
			else
			{
				count = 1;
			}
			if(max < count)
			{
				max = count;
				commonFood = data[i];
			}
		}
		return commonFood;
	}

	//Method for printing the data
	public static void printData(String data[])
	{
		//Printing out the items
		System.out.format("%-15s%15s%15s\n", "Food", "Count", "Max Count");
		
		//Declaring variables
		int maxCount = 0;
		int count = 0;
		String food = "";
		
		//Loop for find the common food and printing it out 
		for(int i=0; i < data.length; i++)
    	{
			if(i == 0)
			{
				count = 1;
				food = data[i];
			}
			else 
			{
				if(data[i].equalsIgnoreCase(data[i - 1]))
				{
					++count;
				}
				else 
				{
					System.out.format("%-15s%13d%13d\n", food, count, maxCount);
					food = data[i];
					count = 1;
				}
			}
			if(maxCount < count)
			{
				maxCount = count;
			}
    	}
		System.out.format("%-15s%13d%13d\n", food, count, maxCount);
	} 
}
