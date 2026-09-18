# Java Study Notes

## Data Types

* Java has **8 primitive data types**:

  * **byte** → stores very small integer values.
  * **short** → stores small integer values.
  * **int** → commonly used for integer values.
  * **long** → used for larger integer values; add **`L`** or **`l`** at the end.

```java
long number = 321456L;
```

* **float** → stores decimal values with less precision; add **`f`** at the end.

```java
float number = 3.14f;
```

* **double** → stores decimal values with more precision than `float`.

```java
double number = 31.14;
```

* **char** → stores a **single character**, using single quotes.

```java
char letter = 'a';
```

* **boolean** → stores only **`true`** or **`false`**.

```java
boolean status = true;
```

## Variables

* A **variable** is a named memory location used to store a value.
* The value of a variable can be changed.

```java
int x = 10;
x = 30;
```

## Constants

* A **constant** is a value that cannot be changed after it is assigned.
* Use the **`final`** keyword to create a constant.

```java
final int MAX_MARKS = 100;
```

* The value cannot be changed later.

```java
MAX_MARKS = 120; // Error
```

## Type Casting

* **Type casting** is used to convert one data type into another.

```java
int x = 10;
double y = x;
```

### Widening Casting

* Converting a **smaller data type to a larger data type**.
* Java usually performs this conversion automatically.

```java
int x = 10;
double y = x;
```

* Example: **`int → double`**

### Narrowing Casting

* Converting a **larger data type to a smaller data type**.
* Explicit casting is required using `(dataType)`.

```java
double value = 31.14;
int x = (int) value;

System.out.println(x);
```

* The decimal part is removed, so `31.14` becomes `31`.

```java
float number = 3.14f;
int x = (int) number;
```

## Scanner

* **Scanner** is used to take input from the user while the program is running.
* First, import the `Scanner` class.

```java
import java.util.Scanner;
```

* Create a `Scanner` object:

```java
Scanner sc = new Scanner(System.in);
```

### Taking Integer Input

```java
int number = sc.nextInt();
```

### Taking Double Input

```java
double value = sc.nextDouble();
```

* Similarly:

  * **long** → `sc.nextLong()`
  * **float** → `sc.nextFloat()`

### Taking String Input

* For strings, commonly use **`next()`** and **`nextLine()`**.

#### `next()`

* Reads only the **first word** and stops at a space.

```java
String name = sc.next();
```

* Input:

```text
Veerendra Reddy
```

* Output:

```text
Veerendra
```

#### `nextLine()`

* Reads the **complete line**, including spaces.

```java
String name = sc.nextLine();
```

* Input:

```text
Veerendra Reddy
```

* Output:

```text
Veerendra Reddy
```

### `nextInt()` + `nextLine()` Issue

* After `nextInt()`, the **newline (`Enter`) remains in the input buffer**.
* Calling `nextLine()` immediately may read that leftover newline.

```java
int age = sc.nextInt();
sc.nextLine(); // consumes the leftover newline

String name = sc.nextLine();
```

* Remember: **`next()` = one word**, **`nextLine()` = complete line**.
