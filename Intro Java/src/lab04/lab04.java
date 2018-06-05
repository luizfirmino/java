package lab04;

import java.util.Scanner;

public class lab04 {

	public lab04() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		System.out.print("FINDING THE LARGEST NUMBER SYSTEM\n"); // prompt
		System.out.print("Enter a serie of 10 numbers\n"); // prompt
		
		int counter = 0;
		int number = 0;
		int numbers[] = new int[10];
		
		while(counter < 10) {
			System.out.print("Enter the " + (counter+1) + "º number: "); // prompt
			numbers[counter] = input.nextInt();
			counter++;
		}
		counter = 0;
		
		//Find for the largest number
		while(counter < 10) {
			if (numbers[counter] > number) {
				number = numbers[counter];
			}
			counter++;
		}
		
		System.out.println("The largest number entered was: " + number);
		
	}

}
