// DataTypesDemo.java
// Topic: Variables & Data Types
// Demonstrates all 8 primitive data types in Java with example values.

public class DataTypesDemo
{
    public static void main(String[] args)
    {
        byte b = 10;              // 1 byte, range -128 to 127
        short s = 1000;           // 2 bytes, range -32,768 to 32,767
        int i = 50000;            // 4 bytes, most commonly used integer type
        long l = 100000L;         // 8 bytes, needs 'L' suffix
        float f = 3.14f;          // 4 bytes, needs 'f' suffix
        double d = 3.14159;       // 8 bytes, default type for decimals
        char c = 'A';             // 2 bytes, single character, single quotes
        boolean flag = true;      // true or false only

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);
    }
}
