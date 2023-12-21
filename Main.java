import java.util.Scanner;

 class Calculator {

    // Method to get input from the user
    public static int input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Call the add method and return the result
        int result = add(num1, num2);
        return result;
    }

    // Method to perform addition
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Call the input method and get the result
        int result = input();

        // Print the result
        System.out.println("Result of addition: " + result);
    }
}