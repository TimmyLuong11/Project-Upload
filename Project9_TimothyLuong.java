import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class Project9_TimothyLuong
{

  public static void main(String[] args) throws FileNotFoundException 
  {
    //Declearing variables and methods 
    Scanner keyboard = new Scanner(System.in);
    String word = "";
    String[] globalDictionary = globalDictionary("Dictionary.txt");
    String[] personalDictionary = new String[100];
    int personal = personalDictionary(personalDictionary, "personal.txt");
    boolean quit = false;

    //Loop through the program and asking the questions
    while (!quit) 
    {
      System.out.println("Enter a word or QUIT to stop:");
      word = keyboard.nextLine();
      if (word.equalsIgnoreCase("QUIT"))
        quit = true;
      else
      {
        if (inputWords(globalDictionary, globalDictionary.length, word) == -1 ||inputWords1(personalDictionary, personalDictionary.length, word) == -1) 
        {
          System.out.println("That word is not spelled correctly");
          System.out.println("Would you like to add it to your personal dictionary Yes/No: ");
          if (keyboard.nextLine().equals("yes")) 
          {
            if (personal == personalDictionary.length)
            {
              System.out.println("No more space to add to personal dictionary!");
            }
            else 
            {
              writeToPersonal("personal.txt", word); 
              personalDictionary[personal] = word;
              ++personal;
            }
          }
        }
        else
        {
        	System.out.println("That word is spelled correctly");
        }
      } 
     
    }
   keyboard.close(); 
  }

  //Method for reading in the dictionary
  public static String[] globalDictionary(String fileName) throws FileNotFoundException 
  {
    Scanner dictionaryList = new Scanner(new File(fileName));
     int count = 0;
     while(dictionaryList.hasNextLine())
     {
       ++count;
       dictionaryList.nextLine();
     }
     dictionaryList.close();
     String[] dictionaryResult  = new String[count];
     dictionaryList = new Scanner(new File(fileName));
     for(int i = 0; i < count; ++i)
     {
       dictionaryResult[i] = dictionaryList.nextLine();
     }
     dictionaryList.close();
     return dictionaryResult;
  }

  //Method for reading the personal dictionary
  public static int personalDictionary(String[] personalDictionary, String fileName) throws FileNotFoundException 
  {
    int index = 0;
    Scanner dictionary = new Scanner(new File(fileName));
      
    while (dictionary.hasNextLine()) 
    {
      personalDictionary[index] = dictionary.nextLine();
      ++index;
    }
    dictionary.close();
    return index;
  }
  
  //Method for writing in the personal dictionary
  public static void writeToPersonal(String fileName, String word) throws FileNotFoundException 
  {
    PrintWriter pw = new PrintWriter(new FileOutputStream(fileName, true));
    pw.write(word + "\n");
    pw.close();
  }

  //Method for checking if the word is in the global dictionary
  public static int inputWords(String[] global, int personalSize, String word)
  {
    Arrays.sort(global);
    int first = 0;
    int last = personalSize - 1;
    while (first <= last) 
    {
      int mid = (first + last) / 2;
      if (global[mid].equalsIgnoreCase(word))
      {
        return mid;
      }
      else if (word.compareTo(global[mid]) < 0)
      {
        last = mid - 1;
      }
      else
      {
        first = mid + 1;
      }
    }
    return -1;
  }
  
  //Method for checking if the word is in the personal dictionary
  public static int inputWords1(String[] global, int personalSize, String word)
  {
    Arrays.sort(global);
    int first = 0;
    int last = personalSize - 1;
    while (first <= last) 
    {
      int mid = (first + last) / 2;
      if (global[mid].equalsIgnoreCase(word))
      {
        return mid;
      }
      else if (word.compareTo(global[mid]) < 0)
      {
        last = mid - 1;
      }
      else
      {
        first = mid + 1;
      }
    }
    return -1;
  }
}
