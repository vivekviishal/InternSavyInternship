package basicCalculator;
import java.util.Scanner;
public class Basic_CLI_Calculator {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        while(true) {

		        System.out.print("Enter the 1st number: ");
		        double num1 = scanner.nextDouble();

		        System.out.print("Enter the 2nd number: ");
		        double num2 = scanner.nextDouble();

		        System.out.print("\n");
		        System.out.println("--------------------------------");
		        System.out.println("**** SELECT AN OPERATION ****");
		        System.out.println("1-> Add(+)");
		        System.out.println("2-> Subtract(-)");
		        System.out.println("3-> Multiply(*)");
		        System.out.println("4-> Divide(/)");
		        System.out.println("--------------------------------");
		        
		        System.out.print("Enter your choice: ");
		        int choice = scanner.nextInt();

		        double result = 0;

		        switch (choice) {
		            case 1:
		                result = num1 + num2;
		                System.out.println("Result: " + result);
		                break;
		            case 2:
		                result = num1 - num2;
		                System.out.println("Result: " + result);
		                break;
		            case 3:
		                result = num1 * num2;
		                System.out.println("Result: " + result);
		                break;
		            case 4:
		                if (num2 == 0) {
		                    System.out.println("Error: Cannot divide by zero!");
		                } else {
		                    result = num1 / num2;
		                    System.out.println("--------------------------------");
		                    System.out.println("**** Result: " + String.format("%.2f", result) + " ****");
		                    System.out.println("--------------------------------");
		                }
		                break;
		            default:
		            	System.out.println("--------------------------------");
		                System.out.println("!!!! Invalid choice !!!!");
		                System.out.println("--------------------------------");
		        }
		        System.out.println("**** TO CONTINUE MORE CALCULATION ****");
		        System.out.println("PRESS-> 1");
		        System.out.println("**** To End CALCULATION ****");
		        System.out.println("PRESS-> 2");
		        System.out.print("Enter your choice: ");
		        int choice2 = scanner.nextInt();
		        if(choice2==1) {
		        	continue;
		        }
		        else {
		        	System.out.println("!!!! The Calculation Is Ended !!!!");
		        	break;
		        }
		        }

		        scanner.close();

	}

}
