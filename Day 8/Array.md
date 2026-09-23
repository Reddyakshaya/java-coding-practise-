# Day 8 — Arrays in Java

## 1. Array

* An **array** is a collection of multiple values of the **same data type**, stored under a single variable name.
* Array indexing starts from **0**.

```java
int[] numbers = {1, 2, 3, 4, 5};
```

## 2. Array Declaration and Initialization

* **Method 1: Declaration**

  ```java
  int[] numbers;
  ```

* **Method 2: Declaration with memory allocation**

  ```java
  int[] numbers = new int[5];
  ```

* **Method 3: Declaration and initialization**

  ```java
  int[] numbers = {1, 2, 3, 4, 5};
  ```

## 3. Array Length

* Use **`arrayName.length`** to get the number of elements in an array.
* Array length is a property, so no parentheses are required.

```java
public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(numbers.length);
    }
}
```

* **Output:** `5`

## 4. Updating an Array

* We can update an array element using its **index**.
* Array indexes start from `0`.

```java
public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        numbers[3] = 100;

        System.out.println(numbers[3]);
    }
}
```

* **Output:** `100`

## 5. Traversing an Array Using a `for` Loop

* **Traversing** means accessing each array element one by one.
* Use a `for` loop with the array index.

```java
int[] numbers = {10, 20, 30, 40, 50};

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

## 6. Traversing an Array Using an Enhanced `for` Loop

* An **enhanced `for` loop** accesses each element without using an index.
* It is useful when we only need to read array elements.

```java
int[] numbers = {10, 20, 30, 40, 50};

for (int number : numbers) {
    System.out.println(number);
}
```

## 7. Searching an Array

* **Searching** means checking whether a specific element exists in an array.
* Use a `for` loop and an `if` condition to compare each element with the target value.
* Use `break` to stop the loop when the element is found.

```java
public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int search = 30;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element is found");
        } else {
            System.out.println("Element is not found");
        }
    }
}
```

* **Output:** `Element is found`
