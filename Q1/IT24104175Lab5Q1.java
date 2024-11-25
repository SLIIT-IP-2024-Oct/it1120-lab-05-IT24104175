import java.util.Scanner;

public class IT24104175Lab5Q1 {
	public static void main(String[]args) {

	//create a Scanner object to read input
	Scanner input = new Scanner(System.in);

	//Declare variables
	int num1, num2, num3;

	//Take user inputs
	
	System.out.print("Enter the first integer: ");
	num1 = input.nextInt();

	System.out.print("Enter the second integer: ");
	num2 = input.nextInt();

	System.out.print("Enter the third integer: ");
	num3 = input.nextInt();

	//Calculate the largest and smallest number
	int Largest = num1;
	int Smallest = num1;

	//Compare to get Largest number
	if (num2 > Largest) {
	   Largest = num2;
	}

	if (num3 > Largest) {
	   Largest = num3;
	}

	//Compare to get the Smallest nmuber

	if (num2 < Smallest) {
	   Smallest = num2;
	}

	if (num3 < Smallest) {
	   Smallest = num3;
	}

	//Display results
	System.out.println();
	System.out.println("User entered numbers are: " + num1 + " " + num2 + " " + num3);

	System.out.println("The Smallest number is: " + Smallest);
	System.out.println("The Largest number is: " + Largest);
	
	}
}

	
	