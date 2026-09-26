# String in Java

* **String** is used to store a sequence of characters.
* Example:

```java
String str = "Java";
```

## `length()`

* Used to find the **length of a String**.
* String length starts counting from **1**, while indexes start from **0**.

```java
String str = "Hello";

System.out.println(str.length());
```

* Output:

```text
5
```

## `charAt()`

* Used to get the **character at a specific index**.
* Indexing starts from **0**.

```java
String str = "Java";

System.out.println(str.charAt(3));
```

* Output:

```text
a
```

## `substring()`

* Used to get a **part of a String**.
* It takes **start index** and **end index**.
* The **end index is not included**.

```java
String str = "i eat food";

System.out.println(str.substring(2, 8));
```

* Output:

```text
eat fo
```

## `equals()`

* Used to check whether **two Strings have the same content**.
* It is **case-sensitive**.
* Use `equals()` for String content comparison instead of `==`.

```java
String a = "java";
String b = "Java";
String c = "java";

System.out.println(a.equals(b)); // false
System.out.println(a.equals(c)); // true
```

* `"java"` and `"Java"` are different because **uppercase and lowercase letters are different**.

## `contains()`

* Used to check whether a **part of a String is present**.
* It returns `true` or `false`.

```java
String str = "i learn java";

System.out.println(str.contains("java"));
```

* Output:

```text
true
```

## `indexOf()`

* Used to find the **index of a character or String**.
* It returns the index of the first occurrence.

```java
String str = "java";

System.out.println(str.indexOf('a'));
```

* Output:

```text
1
```

## `toUpperCase()`

* Converts all letters in a String to **uppercase**.

```java
String str = "programming";

System.out.println(str.toUpperCase());
```

* Output:

```text
PROGRAMMING
```

## `toLowerCase()`

* Converts all letters in a String to **lowercase**.

```java
String str = "PROGRAMMING";

System.out.println(str.toLowerCase());
```

* Output:

```text
programming
```

## Quick Revision

| Method          | Purpose                           |
| --------------- | --------------------------------- |
| `length()`      | Finds String length               |
| `charAt()`      | Gets character at an index        |
| `substring()`   | Gets part of a String             |
| `equals()`      | Compares String content           |
| `contains()`    | Checks whether text is present    |
| `indexOf()`     | Finds index of a character/String |
| `toUpperCase()` | Converts to uppercase             |
| `toLowerCase()` | Converts to lowercase             |
