/**
 * This is the Class Planner class. It takes in a string containing data
 * for a class. It stores that data and does a minor calculation to
 * determine how many sections are needed for the class.
 *
 * @author Stephen
 * @version 2019-01-17
 */
public class Planner
{
   /*
    * The maximum number of students that may be enrolled in a single section.
    * Use this and the number of students enrolled in the class to calculate
    * then number of sections needed for the class.
    */
   private static final int MAX_SECTION_SIZE = 20;
 
   /*
    * This stores the data for the class in the following order:
    * info[0] = class name (capitalized)
    * info[1] = class location
    * info[2] = number of students
    * info[3] = number of sections needed
    */
   
   private String[] info;
  
   
   /**
    * Constructor for Planning class.  The constructor takes in an input
    * string, breaks it up, and then stores the pieces into the class
    * variable info.  It also does a minor calculation to fill in info[3].
    *
    * The class name must be capitalized when it is stored.
    * The number of sections is equal to the ceiling of (NumStudents/MAX_CLASS_SIZE)
    *
    * @param input A String containing information about the class. The input
    * will always be String of 4 elements separated by commas of the form:
    * "ClassName,ClassLocation,NumStudents"
    */
   public Planner(String input)
   {
	   //TODO: split input (look at String.split()) and store necessary information in the info array.
	   String[] temp = input.split(",");
	   
	   //Assign inputs to variables:
	    
	 		
	   info = new String[4];
	   info[0] = temp[0].toUpperCase();
	   info[1] = temp[1];
	   info[2] = temp[2];
	 		
	   //Calculate and store the info:
	   double numStudents = Double.parseDouble(info[2]);
	   double numSections = Math.ceil(numStudents/MAX_SECTION_SIZE);
	   info[3] = "" + (int) numSections;
   }
   
   /**
    * Getter method for the info array.
    * @return information
    */
   public String[] getInfo()
   {
	   // TODO: return info array
	   return info; 
	   

   }
 
   /**
    * This is the toString method.  It overrides the default toString method
    * to print out the information in the desired format.
    *
    * @return The string representation of the Planning object. The string is of the
    * format:
    * "CLASS: (className), LOCATION: (classLocation), ENROLLED: (numberStudents), SECTIONS: (numberSections)"
    * Replace the parenthesized section with the stored values. e.g.
    * if the class name is "CS2334", the first part of the string is "CLASS: CS2334"
    * Make sure that all spaces and punctation are replicated exactly.
    */
   @Override
   public String toString()
   {
      //TODO: construct and return correct string.
	   return String.format("CLASS: %s, LOCATION: %s, ENROLLED: %s, SECTIONS: %s", info[0], info[1], info[2], info[3]);
   }
}