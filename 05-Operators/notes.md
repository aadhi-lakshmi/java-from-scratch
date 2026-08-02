# Operators in Java

## 1. What is an Operator?

A symbol that performs an operation on one or more values (operands) and
produces a result.

```java
int sum = 5 + 3;   // '+' is the operator, 5 and 3 are operands, 8 is the result
```

## 2. Types of Operators (Overview)

| Type | Purpose |
|---|---|
| Arithmetic | Perform math operations |
| Relational | Compare two values, always return boolean |
| Logical | Combine multiple boolean conditions |
| Assignment | Store or update a value in a variable |
| Increment/Decrement | Increase or decrease a value by 1 |
| Bitwise | Operate directly on individual bits |

---

## 3. Arithmetic Operators

| Operator | Meaning | Example |
|---|---|---|
| `+` | Addition | `5 + 2 = 7` |
| `-` | Subtraction | `5 - 2 = 3` |
| `*` | Multiplication | `5 * 2 = 10` |
| `/` | Division | `5 / 2 = 2` (int division truncates) |
| `%` | Modulus (remainder) | `5 % 2 = 1` |

**Watch out:** `int / int` always gives an `int` result — `5 / 2` gives `2`,
not `2.5`. To get a decimal result, at least one operand must be a
`double`/`float`: `5 / 2.0 = 2.5`.

---

## 4. Relational Operators

Compare two values, always return `boolean`.

| Operator | Meaning |
|---|---|
| `==` | equal to |
| `!=` | not equal to |
| `>` | greater than |
| `<` | less than |
| `>=` | greater than or equal to |
| `<=` | less than or equal to |

---

## 5. Logical Operators

| Operator | Meaning | Example |
|---|---|---|
| `&&` | AND — true only if both are true | `(a > 0 && b > 0)` |
| `||` | OR — true if at least one is true | `(a > 0 || b > 0)` |
| `!` | NOT — reverses a boolean | `!(a > 0)` |

**Short-circuit behavior:** in `a && b`, if `a` is false, `b` is never
checked (result is already false). In `a || b`, if `a` is true, `b` is
never checked. Matters when the second condition has a side effect.

---

## 6. Assignment Operators

| Operator | Same as |
|---|---|
| `=` | assign |
| `+=` | `a = a + b` |
| `-=` | `a = a - b` |
| `*=` | `a = a * b` |
| `/=` | `a = a / b` |
| `%=` | `a = a % b` |

---

## 7. Increment / Decrement

| Operator | Meaning |
|---|---|
| `++` | increment by 1 |
| `--` | decrement by 1 |

**Pre vs post matters:**

```java
int a = 5;
int x = a++;   // x = 5, then a becomes 6 (post: use old value first)
int b = 5;
int y = ++b;   // b becomes 6 first, then y = 6 (pre: increment first)
```

---

## 8. Bitwise Operators

| Operator | Meaning |
|---|---|
| `&` | bitwise AND |
| `\|` | bitwise OR |
| `^` | bitwise XOR |
| `~` | bitwise NOT |
| `<<` | left shift |
| `>>` | right shift |

Already used in the XOR swap method (`Swap.java`, Method 3).

---

## 9. Self-Test

- **Q: What is an operator?**
  A: A symbol that performs an operation on one or more operands and
  produces a result.

- **Q: What does `5 / 2` return in Java, and why?**
  A: `2` — integer division truncates the decimal part since both operands
  are `int`.

- **Q: Difference between `a++` and `++a`?**
  A: `a++` returns the current value then increments; `++a` increments
  first then returns the new value.

- **Q: What is short-circuit evaluation in `&&` and `||`?**
  A: The second operand is skipped if the result is already determined by
  the first — `&&` skips if the first is false, `||` skips if the first
  is true.

