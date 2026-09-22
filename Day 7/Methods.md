# Java Methods

## 1. Method

* A **method** is a block of code that performs a particular task.
* Methods help us:

  * **Reuse code**
  * **Reuse functionality**
  * **Avoid repeating code**
  * **Debug errors easily**
  * Make code easier to understand

---

## 2. Parameters and Arguments

* **Parameters** are variables defined in a method.
* **Arguments** are the actual values passed to the method.

### Example

```java
static void add(int a, int b) {
    System.out.println(a + b);
}
```

* `int a` and `int b` → **Parameters**
* `2` and `3` → **Arguments**

```java
add(2, 3);
```

---

## 3. Method Overloading

* **Method overloading** means having multiple methods with the **same method name** but different parameters.
* Methods can be overloaded by:

  * Different **number of parameters**
  * Different **data types**
  * Different combinations of parameter types

### Example

```java
static void add(int a, int b) {
    System.out.println(a + b);
}

static void add(int a, int b, int c) {
    System.out.println(a + b + c);
}

static void add(double a, double b) {
    System.out.println(a + b);
}
```

* All three methods have the same name: `add`
* But their parameters are different, so they are **valid method overloads**.

---

## 4. Return Type

* A **return type** specifies the type of value a method returns.
* If a method returns an `int`, its return type must be `int`.
* Use the **`return`** keyword to send a value back.

### Example

```java
static int add(int a, int b) {
    return a + b;
}

public static void main(String[] args) {
    int result = add(10, 20);
    System.out.println(result);
}
```

* `int` → **Return type**
* `return a + b;` → Returns the calculated value.
* `result` stores the returned value.

---

## 5. Void Type

* **`void`** means the method does not return a value.
* It can perform a task, such as printing output.

### Example

```java
static void add(int a, int b) {
    System.out.println(a + b);
}

public static void main(String[] args) {
    add(10, 20);
}
```

* The method prints the result.
* It does **not return** the result to the calling code.

### Cannot Store a Void Result

```java
static void add(int a, int b) {
    System.out.println(a + b);
}

public static void main(String[] args) {
    int result = add(10, 20);  // Error
}
```

* A `void` method cannot be stored in an `int` variable.
* To use the result again, the method should **return a value**.

---

## 6. Scope

* **Scope** defines where a variable can be accessed in the program.
* A local variable can only be accessed inside the **`{ }` block** where it is declared.

### Example

```java
public static void main(String[] args) {
    int result = 30;
    System.out.println(result);
}
```

* `result` can be used inside the `main()` method.
* Trying to use it outside its scope causes an **error**.

---

## 7. Static

* **`static`** means the method belongs to the **class**, rather than an object.
* A static method can be called using the **class name** without creating an object.

### Example

```java
class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = Calculator.add(10, 20);
        int answer = result * 2;

        System.out.println(answer);
    }
}
```

### Important Points

* `static` methods can be called using the **class name**.
* No object is required to call a static method.
* `Calculator.add(10, 20)` calls the `add()` method using the class name.
