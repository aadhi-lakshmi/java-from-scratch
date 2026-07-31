// TypeCastingDemo.java
// Topic: Variables & Data Types
// Demonstrates widening (implicit) casting, narrowing (explicit) casting,
// and what happens when a value overflows a smaller data type.

public class TypeCastingDemo
{
    public static void main(String[] args)
    {
        // Widening - smaller type to larger type, done automatically, no data loss
        int a = 10;
        double wideResult = a;
        System.out.println("Widening int to double: " + wideResult);

        // Narrowing - larger type to smaller type, needs explicit cast, decimal part is dropped
        double price = 9.7;
        int narrowResult = (int) price;
        System.out.println("Narrowing double to int: " + narrowResult);

        // Overflow - narrowing can lose data if the value doesn't fit the target type
        // byte max value is 127, so 130 wraps around to a negative number
        int bigNumber = 130;
        byte overflowed = (byte) bigNumber;
        System.out.println("Overflow example (130 as byte): " + overflowed);
    }
}
