# 2D Array (Two-Dimensional Array)

## 1. What is a 2D Array?

* A **2D array** stores data in rows and columns.
* Each row contains an array of elements.
* Elements are accessed using **row and column indexes**.

### Example

```text
       Column
         0   1   2
Row 0   10  20  30
Row 1   40  50  60
Row 2   70  80  90
```

## 2. Initialization of a 2D Array

### Method 1: Using `new` Keyword

* `int arr[][] = new int[2][3];`
* Creates an array with **2 rows and 3 columns**.
* Default value of `int` elements is **0**.

```java
int arr[][] = new int[2][3];
```

* Default values:

```text
0 0 0
0 0 0
```

### Method 2: Direct Initialization

* Declare and initialize the array with values.

```java
int arr[][] = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

* This array contains **3 rows and 3 columns**.

### Method 3: Assigning Values Using Indexes

* Create the array first and assign values using indexes.

```java
int arr[][] = new int[2][3];

arr[0][0] = 1;
arr[0][1] = 2;
arr[0][2] = 3;

arr[1][0] = 4;
arr[1][1] = 5;
arr[1][2] = 6;
```

## 3. Indexing in a 2D Array

* `arr[row][column]` is used to identify an element.
* Indexing starts from **0**.
* Example: `arr[1][2]` refers to row `1`, column `2`, which contains `6`.

```java
int arr[][] = {
    {1, 2, 3},
    {4, 5, 6}
};

System.out.println(arr[1][2]); // Output: 6
```

## 4. Accessing Elements in a 2D Array

* Access elements using their row and column indexes.
* Use `System.out.println()` to print an element.

```java
System.out.println(arr[1][2]); // Output: 6
```

## 5. Jagged Array (Different Column Sizes)

* In Java, each row of a 2D array can have a **different number of elements**.
* This is called a **jagged array**.

### Example

```java
int arr[][] = {
    {1, 2, 3, 4},
    {3, 5, 4, 7, 8},
    {3, 6}
};
```

* Row 0 contains **4 elements**.
* Row 1 contains **5 elements**.
* Row 2 contains **2 elements**.

