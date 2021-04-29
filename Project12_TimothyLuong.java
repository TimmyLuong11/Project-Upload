import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;


public class Project12_TimothyLuong 
{
	public static final int SIZE = 100;
	public static void main(String[] args) throws FileNotFoundException
	{
		// The size of the global dictionary is fixed
		ArrayList<String> globalDictionary = readDictionary("Dictionary.txt");
		
		// The personal dictionary has to be allocated extra size and the size must be tracked
		ArrayList<String> personalDictionary = new ArrayList<String>(SIZE);
		
		// The personal dictionary has to be allocated extra size and the size must be tracked
		int personalSize = readDictionaryFixedSize(personalDictionary, "personal.txt"); 
		
		// The size of the personal dictionary may change during execution
		int personalDictSize = processInput(globalDictionary, personalDictionary, personalSize );
		
		// Write the personal dictionary out to the file it came from
		writePersonalDictionary(personalDictionary, personalDictSize, "personal.txt");
		
	}
	
	//Method to create the size of the personal dictionary
	public static int processInput(ArrayList<String> global, ArrayList<String> personal, int personalSize)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String answer;
		
		// user input will terminate this loop
		while (true)
		{
			// this means we can't spell check quit--but that's OK.
			System.out.println("Enter a word or QUIT to stop:");
			String word = keyboard.next();
			word = word.toLowerCase(); // the dictionary is in lower case
			
			Collections.sort(personal);
			
			// Get out of this method if the user wants to quit
			if (word.equalsIgnoreCase("Quit"))
				return personalSize;
			
			// Search the global dictionary
			if (Collections.binarySearch(global, word) >= 0)
			{
				System.out.println("That word is spelled correctly");
			}
			// Search the personal dictionary
			else if (Collections.binarySearch(personal, word) < 0)
			{
				System.out.println("That word is not spelled correctly");
				System.out.println("Would you like to add it to your personal dictionary Yes/No");
				answer = keyboard.next();
				if (answer.equalsIgnoreCase("Yes") && personalSize < SIZE-1)
				{
					personal.add(personalSize, word);
					++personalSize;
					Collections.sort(personal);
				}
			} // word not found in either dictionary
			else // This logic looks odd, but it was done this way to avoid calling
				// either search twice
			{
				System.out.println("That word is spelled correctly"); // found in personal dictionary
			}
				
		} // end while

	}
	

	//Read the pesonal dictionary to arrayList 
	public static ArrayList<String> readDictionary(String fileName) throws FileNotFoundException
	{
		Scanner keyboard = new Scanner(new File(fileName));
		ArrayList<String> globalDictionary = new ArrayList<String> ();
		while(keyboard.hasNext())
		{
			globalDictionary.add(keyboard.next());
		}
		keyboard.close();
		return globalDictionary;
	}
	
	//Read the size of the personal dictionary 
	public static int readDictionaryFixedSize(ArrayList<String> array, String fileName) throws FileNotFoundException
	{
		Scanner file = new Scanner(new File(fileName));

		// Read in the file contents until you run out of File or array
		int index = 0;
		while (index < SIZE && file.hasNextLine())
		{
			array.size();
			++index;
		}
		file.close();
		return index;

	}
	
	//Method to write to personal dictionary
	public static void writePersonalDictionary(ArrayList<String> personalDictionary, int size, String fileName)
		throws FileNotFoundException
	{
		PrintWriter pw = new PrintWriter(new File(fileName));
		
		for(int i=0; i<size; ++i)
		{
			pw.write(personalDictionary.get(i) + "\n");			
		}
		
		pw.close();
	}
}
