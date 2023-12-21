import java.util.Scanner;

 class CuboidCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the cuboid dimensions
        System.out.println("Enter length, breadth, and height of the cuboid:");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        double height = scanner.nextDouble();

        // Call the volume method, which in turn calls the area and perimeter methods
        double volumeResult = calculateVolume(length, breadth, height);

        // Output the final results
        System.out.println("Volume of the cuboid: " + volumeResult);
    }

    // Method to calculate volume, which in turn calls area and perimeter methods
    static double calculateVolume(double length, double breadth, double height) {
        double areaResult = calculateArea(length, breadth, height);
        double volume = areaResult * height;
        return volume;
    }

    // Method to calculate area, which in turn calls perimeter method
    static double calculateArea(double length, double breadth, double height) {
        double perimeterResult = calculatePerimeter(length, breadth, height);
        double area = 2 * (length * breadth + breadth * height + height * length);
        return area;
    }

    // Method to calculate perimeter
    static double calculatePerimeter(double length, double breadth, double height) {
        double perimeter = 4 * (length + breadth + height);
        System.out.println("Perimeter of the cuboid: " + perimeter);
        return perimeter;
    }
}