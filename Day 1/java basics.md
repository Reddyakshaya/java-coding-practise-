# Java Basics

## 1. Install JDK

* **JDK (Java Development Kit)** contains the tools required to **write, compile, and run** Java programs.
* To check the Java version, open the terminal and use:

```bash
java -version
javac -version
```

## 2. JVM, JRE, and JDK

### JDK — Java Development Kit

* Contains tools required to **develop, compile, and run** Java programs.
* Includes the **JRE** and development tools.

### JRE — Java Runtime Environment

* Provides the libraries and environment required to **run Java programs**.
* Contains the **JVM** and Java libraries.

### JVM — Java Virtual Machine

* Runs the **Java bytecode** stored in `.class` files.
* Converts bytecode into instructions that the computer can execute.

### Relationship

```text
JDK
 |
 └── JRE
      |
      └── JVM
```

## 3. How a Java Program Runs

* Java source code is written in a `.java` file.
* The `javac` compiler converts the `.java` file into a `.class` file.
* The `.class` file contains **bytecode**.
* The **JVM** runs the bytecode and produces the output.

### Process

```text
Main.java
    |
    | javac
    ↓
Main.class
    |
    | JVM
    ↓
Output
```

### Commands

* Compile the Java program:

```bash
javac Main.java
```

* Run the compiled program:

```bash
java Main
```

## 4. `main()` Method

* `main()` is the **starting point** of a Java application.

```java
public static void main(String[] args) {
    // program code
}
```

* **public** → Allows the JVM to access the method.
* **static** → Allows the method to run without creating an object.
* **void** → The method does not return a value.
* **main** → The JVM looks for this method to start the program.
* **String[] args** → Stores command-line arguments.

## 5. Java Naming Conventions

### Class Names

* Use **PascalCase**.
* The first letter of each word is uppercase.

```java
MaxValue
StudentName
```

### Variable Names

* Use **camelCase**.
* The first word starts with lowercase and the next words start with uppercase.

```java
studentName
rollNumber
```

### Constants

* Use **UPPER_CASE** with underscores between words.

```java
MAX_VALUE
MIN_VALUE
```

### Method Names

* Use **camelCase**.
* Method names normally start with a lowercase letter.

```java
studentName()
rollNumber()
```
