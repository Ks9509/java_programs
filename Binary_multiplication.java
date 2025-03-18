import java.util.Scanner;

public class Binary_multiplication {
    
    // Function to convert decimal to binary
    long decimalToBinary(int num) {
        long binary = 0;
        int place = 1; // Position in binary number system
        
        while (num > 0) {
            int rem = num % 2;  // Extract last binary digit
            binary += rem * place; // Store in correct place value
            num /= 2;  // Reduce number
            place *= 10; // Move to next place value
        }
        return binary;
    }

    // Function to convert binary to decimal
    int binaryToDecimal(long binary) {
        int decimal = 0, base = 1; // Base = 1, then 2, 4, 8...
        
        while (binary > 0) {
            int lastDigit = (int)(binary % 10); // Get last digit
            decimal += lastDigit * base; // Convert binary to decimal
            base *= 2;
            binary /= 10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hi there, my name is Keshav Sharma and this is my binary multiplication code.");
        System.out.println("First, we convert two numbers to binary and then multiply them.");
        
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();

        Binary_multiplication obj = new Binary_multiplication();

        // Convert to binary
        long binary1 = obj.decimalToBinary(n1);
        long binary2 = obj.decimalToBinary(n2);

        System.out.println("Binary of first number: " + binary1);
        System.out.println("Binary of second number: " + binary2);

        // Convert binary back to decimal for multiplication
        int decimalProduct = n1 * n2; // Multiply in decimal

        // Convert back to binary
        long binaryProduct = obj.decimalToBinary(decimalProduct);

        System.out.println("Binary product of the two given numbers is: " + binaryProduct);

        sc.close();
    }
}
