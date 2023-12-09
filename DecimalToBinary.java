import java.util.Scanner;

public class DecimalToBinary {
    public static String decimalToBinary(int decimalNum) {
        return Integer.toBinaryString(decimalNum);
    }

    public static String reverseBinary(String binaryNum) {
        StringBuilder reversedBinary = new StringBuilder(binaryNum).reverse();
        return reversedBinary.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalInput = scanner.nextInt();

        String binaryRepresentation = decimalToBinary(decimalInput);
        System.out.println("Binary representation: " + binaryRepresentation);

        String reversedBinary = reverseBinary(binaryRepresentation);
        int reversedDecimal = Integer.parseInt(reversedBinary, 2);

        System.out.println("Reversed binary: " + reversedBinary);
        System.out.println("Decimal equivalent of reversed binary: " + reversedDecimal);
    }
}
