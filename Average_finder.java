import java.util.Scanner;
public class Average_finder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Here we find average of number");
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        double avg = (num1 + num2 + num3)/3;
        System.out.println("here we find the average of the three numbers");
        System.out.println("The formula is to find the average is (a+b+c)/3");
        System.out.println("\t\t"+num1 + "+" + num2 + "+" + num3      );
        System.out.println("    ______________________________      = "+avg);
        System.out.println("                 3                    ");
        sc.close();
    }
}