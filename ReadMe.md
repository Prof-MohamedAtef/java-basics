# Java Basics: Operators and Data Types

This guide covers the Java topics discussed in this lesson:

- Types of operators in Java
- Ternary operator
- Finding the largest of three numbers using the ternary operator
- Primitive data types
- Reference data types
- Primitive vs. reference types
- Mutable vs. immutable objects
- Wrapper classes
- `String` vs. `StringBuilder`
- The difference between `final` and immutability

---

# 1. Operators in Java

Operators are special symbols used to perform operations on variables and values.

## Main Types of Operators

| Type | Operators | Example |
|---|---|---|
| Arithmetic | `+`, `-`, `*`, `/`, `%` | `a + b` |
| Relational / Comparison | `==`, `!=`, `>`, `<`, `>=`, `<=` | `a > b` |
| Logical | `&&`, `\|\|`, `!` | `a > 5 && b < 10` |
| Assignment | `=`, `+=`, `-=`, `*=`, `/=`, `%=` | `a += 5` |
| Unary | `++`, `--`, `+`, `-`, `!`, `~` | `a++` |
| Bitwise | `&`, `\|`, `^`, `~` | `a & b` |
| Shift | `<<`, `>>`, `>>>` | `a << 2` |
| Ternary / Conditional | `? :` | `a > b ? a : b` |
| Type Comparison | `instanceof` | `obj instanceof String` |

### Example

```java
int a = 10;
int b = 5;

System.out.println(a + b);  // 15
System.out.println(a > b);  // true
System.out.println(a == b); // false
```

---

# 2. Ternary Operator

The ternary operator is a shorter way of writing a simple `if-else` statement.

## Syntax

```java
condition ? valueIfTrue : valueIfFalse;
```

The `?` means:

> If the condition is true.

The `:` means:

> Otherwise.

## Example

```java
int age = 20;

String result = (age >= 18) ? "Adult" : "Minor";

System.out.println(result);
```

Output:

```text
Adult
```

The following ternary expression:

```java
String result = (age >= 18) ? "Adult" : "Minor";
```

is equivalent to:

```java
String result;

if (age >= 18) {
    result = "Adult";
} else {
    result = "Minor";
}
```

---

# 3. Finding the Largest of Two Numbers

The ternary operator can be used to find the larger of two numbers.

```java
int a = 10;
int b = 20;

int max = (a > b) ? a : b;

System.out.println(max);
```

Output:

```text
20
```

The condition is:

```java
a > b
```

If it is `true`, Java returns `a`.

Otherwise, Java returns `b`.

---

# 4. Finding the Largest of Three Numbers

Nested ternary operators can be used to find the largest of three numbers.

```java
int a = 10;
int b = 25;
int c = 15;

int largest = (a > b)
        ? (a > c ? a : c)
        : (b > c ? b : c);

System.out.println("Largest number = " + largest);
```

Output:

```text
Largest number = 25
```

## How It Works

The expression is:

```java
(a > b) ? (a > c ? a : c) : (b > c ? b : c)
```

Its logic can be represented as:

```text
Is a > b?
   |
   +-- YES --> Is a > c?
   |              |
   |              +-- YES --> a
   |              |
   |              +-- NO  --> c
   |
   +-- NO  --> Is b > c?
                  |
                  +-- YES --> b
                  |
                  +-- NO  --> c
```

For:

```text
a = 10
b = 25
c = 15
```

Java first checks:

```java
a > b
```

which means:

```text
10 > 25
```

The result is:

```text
false
```

Therefore, Java evaluates:

```java
b > c ? b : c
```

It then checks:

```text
25 > 15
```

which is:

```text
true
```

Therefore:

```text
largest = 25
```

> Nested ternary operators are useful for learning how conditional expressions work, but `if-else` is often easier to read when conditions become complicated.

---

# 5. Java Data Types

Java data types can be divided into two major categories:

```text
Java Data Types
      |
      +-- Primitive Types
      |
      +-- Reference Types
```

Primitive types store simple values.

Reference types are used to work with objects.

---

# 6. Primitive Data Types

Java has exactly **8 primitive data types**.

| Data Type | Size | Definition | Example Value | Common Use |
|---|---:|---|---|---|
| `byte` | 1 byte | `byte age = 25;` | `25` | Very small integers |
| `short` | 2 bytes | `short year = 2026;` | `2026` | Small integers |
| `int` | 4 bytes | `int salary = 5000;` | `5000` | Integers |
| `long` | 8 bytes | `long population = 8000000000L;` | `8000000000L` | Large integers |
| `float` | 4 bytes | `float price = 10.5f;` | `10.5f` | Decimal numbers |
| `double` | 8 bytes | `double salary = 12500.75;` | `12500.75` | More precise decimals |
| `char` | 2 bytes | `char grade = 'A';` | `'A'` | Single Unicode character |
| `boolean` | JVM-dependent | `boolean active = true;` | `true` | True/false values |

> Java does not define a fixed storage size for `boolean` in the same way it does for numeric primitive types.

## Examples

```java
byte age = 30;

short numberOfStudents = 1500;

int salary = 15000;

long worldPopulation = 8000000000L;

float temperature = 36.5f;

double price = 1250.75;

char grade = 'A';

boolean isActive = true;
```

---

# 7. `long` and `float` Suffixes

When working with some numeric types, suffixes are important.

## Long

A large `long` literal can use `L`:

```java
long population = 8000000000L;
```

Using uppercase `L` is recommended because lowercase `l` can look like the number `1`.

## Float

Decimal literals are `double` by default.

Therefore, a `float` usually requires `f`:

```java
float price = 25.5f;
```

Without `f`:

```java
float price = 25.5;
```

Java produces a compilation error because `25.5` is a `double`.

---

# 8. Reference Data Types

Reference variables refer to objects.

Common examples include:

| Type | Definition Example | Example | Mutable? |
|---|---|---|---|
| `String` | `String name = "Mohamed";` | `"Mohamed"` | No |
| Array | `int[] nums = {10, 20};` | `{10, 20}` | Yes |
| `ArrayList` | `ArrayList<String> names = new ArrayList<>();` | List of names | Yes |
| `StringBuilder` | `StringBuilder text = new StringBuilder("Hello");` | `"Hello"` | Yes |
| Custom Class | `Student s = new Student();` | Student object | Depends on design |
| `Integer` | `Integer age = 30;` | `30` | No |
| `Double` | `Double price = 20.5;` | `20.5` | No |
| `Boolean` | `Boolean active = true;` | `true` | No |

Examples:

```java
String name = "Ahmed";

int[] numbers = {10, 20, 30};

ArrayList<String> students = new ArrayList<>();

StringBuilder message = new StringBuilder("Hello");
```

For `ArrayList`, import:

```java
import java.util.ArrayList;
```

---

# 9. Primitive vs. Reference Types

Java provides wrapper classes corresponding to primitive types.

| Primitive Type | Wrapper Class |
|---|---|
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `char` | `Character` |
| `boolean` | `Boolean` |

For example:

```java
int x = 10;
Integer y = 10;
```

Both represent an integer value, but they are different kinds of types:

```text
int
 |
 +-- Primitive

Integer
 |
 +-- Reference type
     |
     +-- Wrapper class
```

---

# 10. Why Do We Need Wrapper Classes?

Collections such as `ArrayList` work with reference types rather than primitive types.

Therefore, this is valid:

```java
ArrayList<Integer> numbers = new ArrayList<>();

numbers.add(10);
numbers.add(20);
numbers.add(30);
```

But this is invalid:

```java
ArrayList<int> numbers;
```

Java generics require reference types.

Therefore:

```text
int      --> Integer
double   --> Double
boolean  --> Boolean
char     --> Character
```

when corresponding wrapper types are needed.

---

# 11. Mutable vs. Immutable

Mutability is mainly a property of **objects**.

## Mutable

A mutable object's internal state can be changed after the object is created.

Examples include:

- Arrays
- `ArrayList`
- `StringBuilder`
- Many custom classes

## Immutable

An immutable object's state cannot be changed after the object is created.

Examples include:

- `String`
- `Integer`
- `Double`
- `Boolean`
- Other primitive wrapper classes

---

# 12. Mutable Example: Array

Arrays are mutable.

```java
int[] numbers = {10, 20, 30};

numbers[0] = 100;
```

Before:

```text
10  20  30
```

After:

```text
100  20  30
```

The existing array object was modified.

Therefore:

```text
Array --> Mutable
```

---

# 13. Mutable Example: ArrayList

`ArrayList` is mutable.

```java
ArrayList<String> names = new ArrayList<>();

names.add("Ahmed");
names.add("Ali");

names.remove("Ahmed");
```

The same `ArrayList` can have elements added or removed.

Therefore:

```text
ArrayList --> Mutable
```

---

# 14. String Is Immutable

`String` is one of the most important immutable classes in Java.

Consider:

```java
String name = "Ahmed";

name = name + " Ali";
```

It may appear that the original String was changed.

However, Java does not modify the original `"Ahmed"` String object.

Conceptually:

```text
Before:

name
 |
 v
"Ahmed"


After:

"Ahmed"          <- original String

name
 |
 v
"Ahmed Ali"      <- new String
```

A new String is created and `name` is reassigned to reference it.

Therefore:

```text
String --> Immutable
```

---

# 15. StringBuilder Is Mutable

`StringBuilder` is useful when text needs to be modified repeatedly.

```java
StringBuilder text = new StringBuilder("Hello");

text.append(" World");

System.out.println(text);
```

Output:

```text
Hello World
```

The existing `StringBuilder` object was modified.

Therefore:

```text
String        --> Immutable

StringBuilder --> Mutable
```

---

# 16. Wrapper Classes Are Immutable

Java's primitive wrapper classes are immutable.

Examples:

```text
Byte
Short
Integer
Long
Float
Double
Character
Boolean
```

Consider:

```java
Integer number = 10;

number = 20;
```

This does **not** modify the `Integer` object representing `10`.

Instead, `number` is reassigned to represent/reference another `Integer` value.

Therefore:

```text
Integer --> Immutable
Double  --> Immutable
Boolean --> Immutable
```

---

# 17. Are Primitive Types Mutable or Immutable?

Primitive types are not objects.

Therefore, it is more accurate not to classify primitive values as mutable objects.

A primitive variable can still be reassigned.

For example:

```java
int x = 10;

x = 20;
```

The variable originally contains:

```text
x
|
10
```

After reassignment:

```text
x
|
20
```

This is **variable reassignment**, not object mutation.

Compare it with:

```java
int[] numbers = {10, 20};

numbers[0] = 100;
```

Here, the existing array object's contents are modified.

This is **mutation**.

---

# 18. `final` vs. Immutable

`final` and immutable do not mean the same thing.

## Final Primitive Variable

```java
final int age = 25;
```

You cannot reassign it:

```java
age = 30; // Compilation error
```

So `final` prevents the variable from being reassigned.

---

# 19. Final Reference Variable

Consider:

```java
final int[] numbers = {10, 20, 30};
```

You cannot make `numbers` refer to another array:

```java
numbers = new int[]{1, 2, 3}; // Compilation error
```

However, you can still modify the existing array:

```java
numbers[0] = 500;
```

This is valid because the array itself is mutable.

Therefore:

```text
final reference
      |
      +-- Cannot reference another object
      |
      +-- Object itself may still be mutable
```

The important rule is:

> **`final` variable does not necessarily mean immutable object.**

---

# 20. Complete Java Data Type Classification

A simplified classification is:

```text
                       Java Data Types
                             |
                +------------+------------+
                |                         |
           Primitive                   Reference
                |                         |
        +-------+-------+          +------+---------+
        |               |          |                |
     Numeric         boolean     Classes           Arrays
        |                          |
   +----+-----+                    +-- String
   |          |                    +-- Integer
Integer   Floating                 +-- ArrayList
 Types     Point                   +-- StringBuilder
   |          |                    +-- Custom Classes
   |          |
   |          +-- float
   |          +-- double
   |
   +-- byte
   +-- short
   +-- int
   +-- long
   +-- char
```

---

# 21. The 8 Primitive Types to Memorize

```text
byte
short
int
long
float
double
char
boolean
```

A useful grouping is:

```text
Integer numbers:
byte
short
int
long

Floating-point numbers:
float
double

Character:
char

Logical:
boolean
```

---

# 22. Mutable and Immutable Summary

| Type | Primitive / Reference | Mutable? |
|---|---|---|
| `byte` | Primitive | Not an object |
| `short` | Primitive | Not an object |
| `int` | Primitive | Not an object |
| `long` | Primitive | Not an object |
| `float` | Primitive | Not an object |
| `double` | Primitive | Not an object |
| `char` | Primitive | Not an object |
| `boolean` | Primitive | Not an object |
| `String` | Reference | Immutable |
| `Integer` | Reference | Immutable |
| `Double` | Reference | Immutable |
| `Boolean` | Reference | Immutable |
| Array | Reference | Mutable |
| `ArrayList` | Reference | Mutable |
| `StringBuilder` | Reference | Mutable |
| Custom class | Reference | Depends on its design |

---

# 23. Important Concepts to Remember

### Primitive vs. Reference

This tells us **what kind of data type** we are working with.

```text
int     --> Primitive

String  --> Reference
```

### Mutable vs. Immutable

This tells us whether an **object's state can change** after creation.

```text
String        --> Immutable

ArrayList     --> Mutable

StringBuilder --> Mutable
```

### Reassignment vs. Mutation

These are different concepts.

Reassignment:

```java
int x = 10;
x = 20;
```

Mutation:

```java
int[] numbers = {10, 20};
numbers[0] = 100;
```

### `final` vs. Immutable

These are also different concepts.

```java
final int[] numbers = {10, 20};

numbers[0] = 100; // Allowed
```

The reference is `final`, but the array object is still mutable.

---

# 24. Quick Revision

## Operators

```text
Arithmetic
Relational
Logical
Assignment
Unary
Bitwise
Shift
Ternary
instanceof
```

## Ternary Syntax

```java
condition ? valueIfTrue : valueIfFalse;
```

## Largest of Three Numbers

```java
int largest = (a > b)
        ? (a > c ? a : c)
        : (b > c ? b : c);
```

## Primitive Types

```text
byte
short
int
long
float
double
char
boolean
```

## Common Immutable Types

```text
String
Integer
Double
Boolean
Character
```

## Common Mutable Types

```text
Array
ArrayList
StringBuilder
```

---

# 25. Complete Example Program

```java
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Primitive data types

        byte age = 30;
        short students = 1500;
        int salary = 15000;
        long population = 8000000000L;

        float temperature = 36.5f;
        double price = 1250.75;

        char grade = 'A';
        boolean active = true;


        // Ternary operator

        String ageResult = (age >= 18)
                ? "Adult"
                : "Minor";

        System.out.println(ageResult);


        // Largest of three numbers

        int a = 10;
        int b = 25;
        int c = 15;

        int largest = (a > b)
                ? (a > c ? a : c)
                : (b > c ? b : c);

        System.out.println("Largest = " + largest);


        // Immutable String

        String name = "Ahmed";

        name = name + " Ali";

        System.out.println(name);


        // Mutable StringBuilder

        StringBuilder message =
                new StringBuilder("Hello");

        message.append(" World");

        System.out.println(message);


        // Mutable Array

        int[] numbers = {10, 20, 30};

        numbers[0] = 100;

        System.out.println(numbers[0]);


        // Mutable ArrayList

        ArrayList<String> names =
                new ArrayList<>();

        names.add("Ahmed");
        names.add("Ali");

        System.out.println(names);


        // final reference to mutable object

        final int[] values = {1, 2, 3};

        values[0] = 500; // Allowed

        System.out.println(values[0]);
    }
}
```

---

# Conclusion

The most important concepts from this lesson are:

**Java has 8 primitive data types:**

```text
byte, short, int, long, float, double, char, boolean
```

**Reference types include objects such as:**

```text
String
Array
ArrayList
StringBuilder
Integer
Custom classes
```

**Primitive vs. Reference** describes the kind of data type.

**Mutable vs. Immutable** describes whether an object's state can change.

And finally:

```text
String        --> Immutable
StringBuilder --> Mutable
Array         --> Mutable
ArrayList     --> Mutable
Wrapper Types --> Immutable
```

These concepts are fundamental for understanding Java, Object-Oriented Programming, Collections, and memory management.