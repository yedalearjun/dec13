import java.util.Scanner;

 class SumOfBytes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the two byte values
        System.out.println("Enter the first byte value:");
        byte byte1 = scanner.nextByte();

        System.out.println("Enter the second byte value:");
        byte byte2 = scanner.nextByte();

        // Type casting byte values to integers and calculating the sum
        int sum = (int) byte1 + (int) byte2;

        // Output the result
        System.out.println("Sum of the two byte values: " + sum);
    }
}