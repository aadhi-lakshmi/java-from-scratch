// OperatorsDemo.java
// Topic: Operators
// Demonstrates arithmetic, relational, logical, and increment/decrement operators.

public class OperatorsDemo
{
    public static void main(String[] args)
    {
        int a = 10, b = 3;

        // Arithmetic
        System.out.println("a + b = " + (a + b));
        System.out.println("a / b = " + (a / b));       // int division, truncates
        System.out.println("a / (double)b = " + (a / (double) b)); // forces decimal result
        System.out.println("a % b = " + (a % b));

        // Relational
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        // Logical with short-circuit
        boolean result = (a > 5) && (b > 0);
        System.out.println("a > 5 && b > 0: " + result);

        // Pre vs post increment
        int x = 5;
        System.out.println("x++ (post): " + (x++));  // prints 5, x becomes 6
        System.out.println("x after post++: " + x);

        int y = 5;
        System.out.println("++y (pre): " + (++y));   // y becomes 6, prints 6
    }
}

