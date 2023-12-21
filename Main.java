import java.util.Scanner;

 class ArithmeticSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for 2, 3, or 4 variables
        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Sum of two numbers: " + findSum(num1, num2));

        System.out.println("Enter three numbers:");
        double num3 = scanner.nextDouble();
        System.out.println("Sum of three numbers: " + findSum(num1, num2, num3));

        System.out.println("Enter four numbers:");
        double num4 = scanner.nextDouble();
        System.out.println("Sum of four numbers: " + findSum(num1, num2, num3, num4));
    }

    // Method to find sum of 2 numbers
    static double findSum(double a, double b) {
        return a + b;
    }

    // Method to find sum of 3 numbers
    static double findSum(double a, double b, double c) {
        return a + b + c;
    }

    // Method to find sum of 4 numbers
    static double findSum(double a, double b, double c, double d) {
        return a + b + c + d;
    }
}