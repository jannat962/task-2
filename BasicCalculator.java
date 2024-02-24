import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Perform arithmetic operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        
        // Display the results
        System.out.println("Sum: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Difference: " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Product: " + num1 + " * " + num2 + " = " + product);
        System.out.println("Quotient: " + num1 + " / " + num2 + " = " + quotient);
        
        // Close the Scanner object
        scanner.close();
    }
}
