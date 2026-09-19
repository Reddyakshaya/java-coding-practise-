# Java Conditional Statements

## 1. if Statement

* Used to check **one condition**.
* If the condition is **true**, the statements inside `if` are executed.
* If the condition is **false**, the `if` block is skipped.

```java
if (condition) {
    // statements
}
```

## 2. if-else Statement

* Used when there are **two possible outcomes**.
* If the condition is **true**, the `if` block is executed.
* If the condition is **false**, the `else` block is executed.

```java
if (condition) {
    // statements if true
} else {
    // statements if false
}
```

## 3. Nested if Statement

* An **if statement inside another if statement** is called a nested `if`.
* The inner condition is checked only when the outer condition is **true**.
* If a condition is false, the corresponding `else` block is executed if it exists.

```java
if (condition1) {

    if (condition2) {
        // statements
    } else {
        // statements
    }

} else {
    // statements
}
```

## 4. if-else-if Statement

* Used when there are **multiple conditions** to check.
* Conditions are checked **from top to bottom**.
* When a condition is **true**, its block is executed and the remaining conditions are skipped.
* If all conditions are false, the final `else` block is executed.

```java
if (condition1) {
    // statements
} else if (condition2) {
    // statements
} else if (condition3) {
    // statements
} else {
    // statements
}
```

* `if-else-if` is useful when checking **specific conditions**.

## 5. switch Statement

* Used to check a variable or expression against **specific values**.
* It contains `case` blocks for different possible values.
* `default` is executed when no `case` matches.

```java
switch (value) {
    case 1:
        // statements
        break;

    case 2:
        // statements
        break;

    default:
        // statements
}
```

