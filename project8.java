import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class project8 
{
	public static void main(String[] args) throws FileNotFoundException
    {
		String[] data = enterData("SampleData.txt");                           // calling the enterData method
 
		changeToLowerCase(data);                  // calling the method that will change all of the words to lower case
 
		Arrays.sort(data);                                    // putting the data in order
 
		String mostCommonFood = findMostCommonFood(data);                // calling the method that will find the most common food eaten
               
		int count = 0;                              // initializing the count and max
		int max = 0;
		for (int i = 0; i < data.length; ++i) 
		{
			if (data[i].equals(data[i])) 
			{
				++count;
			}
			if (max < count) 
			{
				max = count;
			}
			System.out.print(data[i] + "        " + count + "        " + max);                // printing out the user interface
			System.out.println("");
		}
		System.out.print("The most common food is" + " " + mostCommonFood);
    }
   
	public static String[] enterData(String fileName) throws FileNotFoundException
	{            
		int count = 0;
		Scanner keyboard = new Scanner(new File(fileName));                       // reading in the content from the text file
		while (keyboard.hasNextLine())
		{                               // counting the number of item in the text file
			++count;
			keyboard.nextLine();
		}
		keyboard.close();
 
		String[] data = new String[count]; 
		keyboard = new Scanner(new File(fileName));                         // re-reading the file
		for (int i = 0; i < count; ++i) 
		{                                            // loading the text file into an array
			data[i] = keyboard.nextLine();
		}
		keyboard.close();
		return data;
	}
   
   public static void changeToLowerCase(String[] data)                          
   {            for (int i = 0; i < data.length; ++i) {
                 String temp = data[i];               // creating a temporary memory location for a string in the array
 temp = temp.toLowerCase();               // changes the string to lower case
 data[i] = temp;                                         // loading the changed value back into the array
   }
                 
   }
   
   public static String findMostCommonFood(String[] data)
   {            int count = 0;
                 int max = 0;
                 String mostCommonFood = "";                                       // creating an empty string
 for (int i = 0; i < data.length - 1; ++i) {
               if (data[i + 1].equals(data[i])) {                                       // since the array is sorted, if the second item is the same as the first
count = count + 1;                                    //count is increased by 1
   }
   else {
                count = 1;        // if not, then there's only one of that food
   }
   if (max < count) {
                max = count;
                mostCommonFood = data[i];      // by finding the max count of each item, the most common food is found
                                                       }
                                                                    
                           }
                                         return mostCommonFood; 
                           }
}
