// PrimitiveVsReference.java
// Topic: Variables & Data Types
// Shows the difference in default values between a primitive type
// and a reference type when declared as instance fields.

public class PrimitiveVsReference
{
    static int primitiveDefault;      // instance field, primitives default to 0
    static String referenceDefault;   // instance field, reference types default to null

    public static void main(String[] args)
    {
        System.out.println("Primitive default (int): " + primitiveDefault);
        System.out.println("Reference default (String): " + referenceDefault);
    }
}
