import java.util.Scanner;
public class Area_parimeter_of_circle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("First we find the area of circle");
        System.out.println("for find the area and perimeter of circle we need radius of circle");
        System.out.println("Enter the radius of circle: ");
        int r = sc.nextInt();
        double area=Math.PI*r*r;
        double perimeter=2*Math.PI*r;
        System.out.println("The formula to find the area of circle is : A = πr^2");
        System.out.println("The area of circle is: "+area);
        System.out.println("Now we find the perimeter of circle");
        System.out.println("The formula to find the perimeter of circle is : P = 2πr");
        System.out.println("The perimeter of circle is: "+perimeter);
        sc.close();
    }
}
