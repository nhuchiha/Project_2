/* Programming Fundamentals
 * Name: Nhu-Chi Ha
 * PROGRAMMING ASSIGNMENT 2
 */
import java.util.Scanner;

public class Figures 
{

	public static void main(String[] args) 
	{
		// Introduction
		System.out.println("Programming Fundamentals");
		System.out.println("Name: Nhu-Chi Ha");
		System.out.println("PROGRAMMING ASSIGNMENT 2");
		
		//Initialize the variables
		int size = 0;
		int option = 0; 
		
		Scanner scan = new Scanner(System.in);
		
		//Prompt user for the input
		System.out.print("Enter the size of the figure (odd number): ");
		
		// Condition to enforce user enter the odd number
		while(size % 2 == 0)
		{
			size = scan.nextInt();
			if(size % 2 == 0)
			{
				System.out.println("Invalid figure size - must be an odd number ");
				System.out.print("Renter the size of the figure:");
			}	
		}
		// Create the menu
		System.out.println("MENU:");
		System.out.println("1. Print box");
		System.out.println("2. Print diamond");
		System.out.println("3. Print X");
		System.out.println("4. Quit program");
		
		while(option != 4)
		{
			//User input for option
			System.out.print("\nPlease select an option: ");
			option = scan.nextInt();
			
			// Condition for user to select options
			if(option == 1)
				printBox(size);
			else if (option == 2)
				printDiamond(size);
			else if (option == 3)
				printX(size);
			else if (option > 5 || option == 0)	
				System.out.println("Wrong Number!");
			else if (option == 4)
				System.out.println("Good bye!\n");
		}
	}
	// Create the box figure
	public static void printBox(int size)
	{
		for(int i = 0; i < size; i++)
		{
			for(int j = 1; j < size; j++)
				System.out.print("*");
			System.out.println("*");
		}			
	}
	// Create the diamond figure
	public static void printDiamond(int size)
	{
		for(int i = 0; i < size; i++)
		{
			// Define variable for middle and inner space
			int m = size / 2;
			int k = Math.abs(m - i);
			
			for (int j = 0; j < k; j++)
				System.out.print(" ");
			System.out.print("*");
			
			for (int j = 0; j < (m - k) * 2 ; j++)
				System.out.print(" ");
			System.out.println("*");
		}
	}
	// Create the X figure
	public static void printX(int size)
	{
		for(int i = 1 ; i <= size; i++)
		{
			// Define midpoint
			int m = (size / 2) + 1;
			// Define inner spaces
			int k = Math.abs(m - i);
			
			for (int j = 0; j < (m - k -1); j++)
				System.out.print(" ");
			System.out.print("X");
			
			//skip midpoint
			if(i == m)
				System.out.println("");
			
			for (int j = 0; j < (2 * k) - 1 ; j++)
				System.out.print(" ");
			if(i != m)
				System.out.println("X");
		}
	}
}
