// EvenOdd.java
// Topic: Basic Java Programs
// Checks whether a number is even or odd.

import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
        {
            System.out.printf("%d is Even%n", num);
        }
        else
        {
            System.out.printf("%d is Odd%n", num);
        }

        sc.close();
    }
}
