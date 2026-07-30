// Factorial.java
// Topic: Basic Java Programs
// Calculates factorial of a number using a loop.

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long factorial = 1;

        for (int i = 1; i <= num; i++)
        {
            factorial = factorial * i;
        }

        System.out.printf("Factorial of %d is %d%n", num, factorial);

        sc.close();
    }
}
