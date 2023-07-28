package Fahrenheit_to_Celsius;

import java.util.Scanner;

public class FranToCelsius {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float Fahrenheit, Celsius;
		System.out.print("Temperature in Farenheit: ");
        Fahrenheit = scanner.nextFloat();
        Celsius  = ((Fahrenheit-32)*5)/9;  
        System.out.println("Temperature in celsius is: "+Celsius);

	}

}
