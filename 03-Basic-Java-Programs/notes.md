# Basic Structure of a Java Program

## 1. Skeleton
```
public class ClassName
{
public static void main(String[] args)
{
// code goes here
}
}
```
Note: class name must exactly match the filename (`Sum.java` → `public class Sum`).

## 2. Breaking Down Each Part

| Part | Meaning |
|---|---|
| `public class ClassName` | Declares a class |
| `public` | Accessible from anywhere |
| `static` | Belongs to the class, not an object — lets JVM call `main` directly |
| `void` | `main` returns nothing |
| `main(String[] args)` | Entry point of the program |
| `{ }` | Marks start/end of a block |
| `;` | Ends every statement |

## 3. Variables

```java
int a = 10;
double d = 3.14;
char c = 'A';        // single quotes
boolean flag = true;
String s = "Hello";  // double quotes
```

## 4. Input/Output

```java
System.out.println("text");   // prints + new line
System.out.print("text");     // prints, same line

import java.util.Scanner;     // goes at top of file
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
```

## 5. Formatted Output — printf

`printf` prints using format specifiers, giving control over how values are
displayed (decimal places, type, etc.) — something `println` can't do.

| Specifier | Used for | Example |
|---|---|---|
| `%d` | integer | `printf("%d", 25)` → `25` |
| `%f` | float/double | `printf("%f", 3.14)` → `3.140000` |
| `%s` | String | `printf("%s", "Hello")` → `Hello` |
| `%c` | character | `printf("%c", 'A')` → `A` |
| `%n` | new line (preferred over `\n`) | |

**Controlling decimal places:**
```java
double pi = 3.14159265;
System.out.printf("%.2f%n", pi);   // 3.14
System.out.printf("%.4f%n", pi);   // 3.1416
```

**Multiple values in one line:**
```java
int a = 5, b = 10;
System.out.printf("a = %d, b = %d%n", a, b);
```

**print vs println vs printf:**

| Method | Behavior |
|---|---|
| `print` | prints, no line break |
| `println` | prints, adds line break |
| `printf` | prints with formatting control, no automatic line break (use `%n`) |
