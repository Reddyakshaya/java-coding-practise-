# Java Loops and Control Statements

## For Loop

* Use a **for loop** when you know how many times the loop should run.
* It contains three parts:

  * **Declaration/Initialization**
  * **Condition**
  * **Iteration**

```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

## While Loop

* A **while loop** checks the condition first, then executes the statements.
* If the iteration/update is missing, it can cause an **infinite loop**.

### Example

```java
int x = 1;

while (x <= 10) {
    System.out.println(x);
    x++;
}
```

## Do-While Loop

* A **do-while loop** executes the statement **at least once** before checking the condition.
* The condition is checked **after** the loop body.

### Example

```java
int x = 1;

do {
    System.out.println(x);
    x++;
} while (x < 10);
```

## Break

* **`break`** stops the loop immediately when the specified condition is met.
* The loop does not continue after `break`.

### Example

```java
for (int i = 1; i < 10; i++) {
    if (i == 3) {
        break;
    }

    System.out.println(i);
}
```

### Output

```text
1
2
```

## Continue

* **`continue`** skips the current iteration.
* The loop then continues with the **next iteration**.

### Example

```java
for (int i = 1; i <= 10; i++) {
    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```

### Output

```text
1
2
4
5
6
7
8
9
10
```

## Nested Loops

* A **nested loop** is a loop inside another loop.
* The inner loop runs completely for each iteration of the outer loop.

### Example

```java
for (int i = 1; i <= 10; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.println(j);
    }
}
```
