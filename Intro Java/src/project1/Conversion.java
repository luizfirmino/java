package project1;

import java.util.Scanner;

public class Conversion {

	public Conversion() {
		// TODO Auto-generated constructor stub
	}

    public static double ConvertToCelsius (double fahrenheitTemperature) {
        return (5.0 / 9.0 * (fahrenheitTemperature - 32));
    }

    public static double ConvertToFahrenheit (double celsius) {
        return (9.0 / 5.0 * celsius + 32);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		System.out.print("Celsius/Fahrenheit CONVERSOR \n"); // prompt	
		
		int option = 0;
		boolean skip = false;
		
		while(!skip) {
		
			// Menu
			System.out.print("Enter the option: \n"); // prompt
			System.out.print("1. Celsius to Fahrenheit \n"); // prompt
			System.out.print("2. Fahrenheit to Celsius \n"); // prompt
			System.out.print("3. Quit \n"); // prompt
			option = input.nextInt();
		
			double t = 0; // temperature to be converted
			if (option == 1) {
				System.out.print("Enter Celsius temperature: "); // prompt
				t = input.nextInt();
				System.out.print("The Fahrenheit equivalent of " + t + " Celsius is: " + ConvertToFahrenheit(t) + "\n\n");
			} else if (option == 2){
				System.out.print("Enter Fahrenheit temperature: "); // prompt
				t = input.nextInt();
				System.out.print("The Celsius equivalent of " + t + " Fahrenheit is: " + ConvertToCelsius(t) + "\n\n");	
			} else if (option == 3) {
				skip = true;
			}
		
		}
		
		input.close();
	}

}
