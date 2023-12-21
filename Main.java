import java.util.Scanner;

 class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for square side length
        System.out.println("Enter side length of the square:");
        double sideLength = scanner.nextDouble();
        System.out.println("Area of the square: " + findArea(sideLength));

        // Input for rectangle length and width
        System.out.println("Enter length and width of the rectangle:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        System.out.println("Area of the rectangle: " + findArea(length, width));

        // Input for circle radius
        System.out.println("Enter radius of the circle:");
        double radius = scanner.nextDouble();
        System.out.println("Area of the circle: " + findArea(radius));
    }

    // Method to find area of a square
    static double findArea(double side) {
        return side * side;
    }

    // Method to find area of a rectangle
    static double findArea(double length, double width) {
        return length * width;
    }

    // Method to find area of a circle
    static double findArea(double radius) {
        return Math.PI * radius * radius;
    }
}