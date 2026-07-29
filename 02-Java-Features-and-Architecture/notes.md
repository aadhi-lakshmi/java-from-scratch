# Java Features and Architecture

## 1. Features of Java

1. **Simple** — Syntax is close to C/C++ but removes complexity like pointers
   and manual memory management.
2. **Object-Oriented** — Everything is modeled as objects, enabling reuse
   through inheritance, encapsulation, and polymorphism.
3. **Platform Independent** — Source code compiles into bytecode (.class file),
   which any device with a JVM can run. This is Java's "Write Once, Run
   Anywhere" (WORA) principle.
4. **Robust** — Strong compile-time checking plus automatic garbage collection
   removes most memory-related bugs common in languages like C/C++.
5. **Secure** — No explicit pointers; code runs inside the JVM sandbox, and
   the bytecode is verified before execution.
6. **Multithreaded** — Built-in support for running multiple tasks
   concurrently via the `Thread` class and `Runnable` interface.
7. **Architecture-Neutral** — The bytecode format has no dependency on any
   specific CPU or OS.
8. **High Performance** — Uses a Just-In-Time (JIT) compiler to convert
   frequently used bytecode into native machine code at runtime.
9. **Distributed** — Supports networking features (RMI, sockets) to build
   distributed applications.
10. **Dynamic** — Can load classes at runtime and supports reflection.

**Important distinction (common interview trap):** Java is neither purely
compiled nor purely interpreted. Source code is *compiled* to bytecode by
`javac`, and that bytecode is then *interpreted* (or JIT-compiled) by the JVM.
It's a hybrid model.

---

## 2. Architecture — JDK vs JRE vs JVM

| | Full Form | Purpose | Contains | Compiler? |
|---|---|---|---|---|
| **JDK** | Java Development Kit | Write, compile, debug, and run Java programs | JRE + compiler (`javac`) + debugger (`jdb`) + tools (`javadoc`, `jar`) | Yes |
| **JRE** | Java Runtime Environment | Only run Java programs (no development) | JVM + core class libraries (`java.lang`, `java.util`, etc.) | No |
| **JVM** | Java Virtual Machine | Execute bytecode | Class loader, bytecode verifier, execution engine, garbage collector | No |

**Relationship:**
```
JDK ⊃ JRE ⊃ JVM
```
- JDK = JRE + development tools
- JRE = JVM + libraries needed to run programs
- If you only need to *run* Java programs → JRE is enough
- If you need to *write and compile* code → you need the JDK

---

## 3. What the JVM Actually Does

The JVM has three main jobs:

1. **Class Loader Subsystem** — loads `.class` files into memory and links them.
2. **Bytecode Verifier** — checks that the bytecode is valid and safe before
   running it. This is the source of Java's security guarantee.
3. **Execution Engine** — runs the bytecode using two mechanisms:
   - **Interpreter** — executes bytecode line by line (slower)
   - **JIT Compiler** — converts frequently used bytecode into native machine
     code for faster repeated execution

The JVM also handles **automatic garbage collection**, freeing memory for
objects that are no longer referenced — so there's no manual `free()` like
in C.

Note: the **JVM is platform-dependent** (a different JVM implementation
exists per OS), but the **bytecode it runs is platform-independent** — this
is exactly why Java achieves "write once, run anywhere."

---

## 4. Full Flow: Source Code to Output
```
HelloWorld.java
│ (javac compiler)
▼
HelloWorld.class ← bytecode, platform-independent
│ (JVM: class loader → bytecode verifier → execution engine)
▼
Machine code specific to your OS
│
▼
Output on screen
```
---

## 5. Interview Self-Test (answer out loud before checking)

- **Q: Is Java compiled or interpreted?**
  A: Both — compiled to bytecode by `javac`, then interpreted/JIT-compiled by the JVM.

- **Q: Can you run a `.class` file with only the JRE installed?**
  A: Yes. JRE is sufficient to run programs; JDK is only needed to compile them.

- **Q: Where does Java's platform independence actually come from?**
  A: The bytecode format is identical across platforms; only the JVM implementation is OS-specific.

- **Q: What are the three main components of the JVM?**
  A: Class loader, bytecode verifier, execution engine (interpreter + JIT compiler).

- **Q: Why is Java considered secure?**
  A: No raw pointers, sandboxed execution inside the JVM, and bytecode verification before running.

---
*References: GeeksforGeeks, IBM Java documentation, TutorialsPoint, Programiz*
