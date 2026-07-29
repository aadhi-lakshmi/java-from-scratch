// Swap.java
// Topic: Basic Java Programs
// Demonstrates 3 different ways to swap two numbers, using user input.

import java.util.Scanner;

public class Swap
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // ---------- Method 1: Using a third (temporary) variable ----------
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.printf("Method 1 - Before: a=%d b=%d%n", a, b);

        int temp = a;
        a = b;
        b = temp;

        System.out.printf("Method 1 - After: a=%d b=%d%n%n", a, b);

        // ---------- Method 2: Without a third variable (arithmetic) ----------
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.printf("Method 2 - Before: x=%d y=%d%n", x, y);

        x = x + y;   // x now holds sum of both
        y = x - y;   // y becomes original x
        x = x - y;   // x becomes original y

        System.out.printf("Method 2 - After: x=%d y=%d%n%n", x, y);

        // ---------- Method 3: Without a third variable (XOR) ----------
        System.out.print("Enter first number: ");
        int p = sc.nextInt();
        System.out.print("Enter second number: ");
        int q = sc.nextInt();

        System.out.printf("Method 3 - Before: p=%d q=%d%n", p, q);

        p = p ^ q;
        q = p ^ q;
        p = p ^ q;

        System.out.printf("Method 3 - After: p=%d q=%d%n", p, q);

        sc.close();
    }
}
