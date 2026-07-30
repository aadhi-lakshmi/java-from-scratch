// Largest.java
// Topic: Basic Java Programs
// Finds the largest of three numbers.

import java.util.Scanner;

public class Largest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int largest;

        if (a >= b && a >= c)
        {
          largest = a;
        }
        else if (b >= c)
        {
          largest = b;

        }
        else
        {
          largest = c;
        }
//Java has a built-in Math.max() you could chain instead:
//int largest = Math.max(a, Math.max(b, c));
        System.out.printf("Largest number is: %d%n", largest);

        sc.close();
    }
}
