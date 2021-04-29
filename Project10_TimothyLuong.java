import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Project10_TimothyLuong 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//Declearing constant variables
		final int ROWS = 10;
		final int COLS = 10;
		final int stripeWidth = 2;
		
		//Passing values to methdos
		int[][] verticalStripes = createVerticalStripes(ROWS, COLS, stripeWidth);
		int[][] horizontalStripes = createHorizontalStripes(ROWS, COLS, stripeWidth);
		int[][] diagonalStripes = createDiagonalStripes(ROWS, COLS, stripeWidth);
		int[][] checkerboardStripes = createCheckerboardStripes(ROWS, COLS, stripeWidth);
		createImage("verticalStripes.pgm", verticalStripes, ROWS, COLS, stripeWidth);
		createImage("horizontalStripes.pgm", horizontalStripes, ROWS, COLS, stripeWidth);
		createImage("diagonalStripes.pgm", diagonalStripes, ROWS, COLS, stripeWidth);
		createImage("checkerboardStripes.pgm", checkerboardStripes, ROWS, COLS, stripeWidth);
	}
	
	//Method for creating the vertical stripes 
	public static int[][] createVerticalStripes(int height, int width, int stripeWidth)
	{
		//Declearing Variables for 2D array 
		int[][] image = new int[height][width];
		
		//Loop for creating the 2D array of vertical stripes
		for (int rows = 0; rows < height; ++rows)
		{
			for(int cols = 0; cols < width; ++cols)
			{
				if((cols/stripeWidth) %2 == 0)
				{
					image[rows][cols] = 0;
				}
				else
				{
					image[rows][cols] = 225;
				}
			}	
		}
		return image;
	}
	
	//Method for creating the Horizonatal Stripes
	public static int[][] createHorizontalStripes(int height, int width, int stripeWidth)
	{
		//Declearing Variable for 2D array 
		int[][] image = new int[height][width];
		
		//Loop for creating the 2D array of horzontal stripes 
		for (int rows = 0; rows < height; ++rows)
		{
			for(int cols = 0; cols < width; ++cols)
			{
				if((rows/stripeWidth) %2 == 0)
				{
					image[rows][cols] = 0;
				}
				else
				{
					image[rows][cols] = 225;
				}
			}	
		}
		return image;
	}
	
	//Method for creating the Diagonal Stripes 
	public static int[][] createDiagonalStripes(int height, int width, int stripeWidth)
	{
		//Declearing varialbe for 2D array
		int[][] image = new int[height][width];
		
		//Loop for creating the 2D array of Diagonal stripes 
		for (int rows = 0; rows < height; ++rows)
		{
			for(int cols = 0; cols < width; ++cols)
			{
				if(((rows + cols)/2) %2 == 0)
				{
					image[rows][cols] = 0;
				}
				else
				{
					image[rows][cols] = 225;
				}
			}	
		}
		return image;
	}
	
	//Method for creating the Checkerboard Stripes 
	public static int[][] createCheckerboardStripes(int height, int width, int stripeWidth)
	{
		//Declearing varialbe for 2D array
		int[][] image = new int[height][width];
		
		//Loop for creating the 2D array of checkerboard stripes 
		for (int rows = 0; rows < height; ++rows)
		{
			for(int cols = 0; cols < width; ++cols)
			{
				if(((rows/stripeWidth) %2) == ((cols/stripeWidth) %2))
				{
					image[rows][cols] = 0;
				}
				else
				{
					image[rows][cols] = 225;
				}
			}	
		}
		return image;
	}
	
	//Method for creating the image
	public static void createImage(String fileName, int[][] imageArray, int height, int width, int stripeWidth) throws FileNotFoundException
	{
		//Print out the image from the 2D array
		PrintWriter pw = new PrintWriter(new File(fileName));
		pw.write("P2\n");
		pw.write("10 10\n");
		pw.write("225\n");
		
		for (int rows = 0; rows < height; ++rows)
		{
			for(int cols = 0; cols < width; ++cols)
			{
				if(cols == 0)
				{
					pw.write("");
				}
				pw.write(imageArray[rows][cols] + " ");
			}
		}
		pw.close();
	}	
}


