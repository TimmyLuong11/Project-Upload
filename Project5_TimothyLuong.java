import java.util.Scanner;
public class Project5_TimothyLuong 
{
	public static void main(String[] args)
	{
		//Declare any variables 
		Scanner keyboard = new Scanner(System.in);
		int count = 0; 
		int one = 0; 
		int two = 0; 
		int three = 0; 
		int four = 0; 
		int five = 0;
		int noChange = 0;
		int positiveChange = 0;
		int negativeChange = 0;
		int lastData = 0;

		//Print out # of poll 
		System.out.println("Enter the number of times polling data will be collected.");
		int pollingCount = keyboard.nextInt();
		  
		//Loop
		while(count != pollingCount)
		{
			System.out.println("Enter the polling data");
		    int pollingData = keyboard.nextInt();
		    if(pollingData == 1)
		    {
		    	one++;
		    }
		    else if(pollingData == 2)
		    {
		    	two++;
		    }
		    else if(pollingData == 3)
		    {  
		    	three++;
		    }
		    else if(pollingData == 4)
		    {
	    		four++;
		    } 
		    else
		    {
		    	five++;
		    }

		    if(pollingData == lastData)
		    {
		    	noChange++;
		    }
		    else if(lastData != 0)
		    {
		    	if(pollingData > lastData)
		    	{
		    		positiveChange++;
		    	}
		    	else
		    	{
		    		negativeChange++;
		    	}    
		    }
		    
		    lastData = pollingData;
		    count++;
	    }
		
		//Print out final statement
		System.out.println("1 was chosen " + one + " times.");
		System.out.println("2 was chosen " + two + " times.");
		System.out.println("3 was chosen " + three + " times.");
		System.out.println("4 was chosen " + four + " times.");
		System.out.println("5 was chosen " + five + " times.");
		System.out.println("There were: ");
		System.out.println(positiveChange + " Positive changes");
		System.out.println(negativeChange + " Negative changes");
		System.out.println(noChange + " No changes");
		keyboard.close();
	}
}
