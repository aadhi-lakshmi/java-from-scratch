# Variables & Data Types

## 1. What is a Variable?

A named memory location used to store a value that can change during
program execution.

```java
int age = 20;   // type   name   value
```

## 2. Primitive Data Types (8 total)

| Type | Size | Range (approx) | Default | Example |
|---|---|---|---|---|
| `byte` | 1 byte | -128 to 127 | 0 | `byte b = 10;` |
| `short` | 2 bytes | -32,768 to 32,767 | 0 | `short s = 1000;` |
| `int` | 4 bytes | -2.1B to 2.1B | 0 | `int a = 50000;` |
| `long` | 8 bytes | very large | 0L | `long l = 100000L;` |
| `float` | 4 bytes | ~6-7 decimal digits precision | 0.0f | `float f = 3.14f;` |
| `double` | 8 bytes | ~15 decimal digits precision | 0.0 | `double d = 3.14159;` |
| `char` | 2 bytes | single Unicode character | '\u0000' | `char c = 'A';` |
| `boolean` | 1 bit (JVM-dependent) | true / false | false | `boolean flag = true;` |

**Note:** `long` values need an `L` suffix, `float` values need an `f` suffix
— otherwise Java assumes `int` and `double` by default and may throw a
compile error.

## 3. Non-Primitive (Reference) Types

Unlike primitives, these store a **reference** to an object, not the value
directly. Examples: `String`, arrays, classes, interfaces.

```java
String name = "Aadhi";   // reference type, not primitive
int[] numbers = {1, 2, 3};
```

**Key difference:** primitives have a fixed default value and store actual
data; reference types default to `null` and store a memory address pointing
to the actual object.

## 4. Type Casting

**Widening (implicit)** — smaller type to larger type, done automatically:
```java
int a = 10;
double d = a;   // int -> double, no data loss, no cast needed
```

**Narrowing (explicit)** — larger type to smaller type, must cast manually,
risk of data loss:
```java
double d = 9.7;
int a = (int) d;   // a = 9 (decimal part dropped, not rounded)
```

## 5. Variable Naming Rules

- Must start with a letter, `_`, or `$` — not a digit
- Case-sensitive (`age` and `Age` are different variables)
- Cannot use Java reserved keywords (`class`, `int`, `public`, etc.)
- Convention: `camelCase` for variables (`firstName`, `totalAmount`)

## 6. Self-Test

- **Q: Difference between `float` and `double`?**
  A: `double` has roughly double the precision and is the default for
  decimal literals in Java; `float` needs an explicit `f` suffix and is
  used when memory is more constrained than precision.

- **Q: What happens when you narrow-cast a double to an int?**
  A: The decimal part is truncated (dropped), not rounded — `(int) 9.9`
  gives `9`, not `10`.

- **Q: What's the default value of an uninitialized `int` field vs `boolean`?**
  A: `int` defaults to `0`, `boolean` defaults to `false` — but this only
  applies to instance/class fields, not local variables (local variables
  must be explicitly initialized before use).
