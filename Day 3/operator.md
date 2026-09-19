Java Operators
1. Arithmetic Operators

Used to perform mathematical operations.

Operators: +, -, *, /, %

Operator

	

Description




+

	

Addition




-

	

Subtraction




*

	

Multiplication




/

	

Division (returns quotient for integers)




%

	

Modulus (returns remainder)

/ does not remove the last digit; it performs division.

% returns the remainder. Example: 123 % 10 = 3 (last digit).

2. Relational Operators

Used to compare two values. The result is true or false.

Operators: >, <, >=, <=, ==, !=

Operator

	

Description




>

	

Greater than




<

	

Less than




>=

	

Greater than or equal to




<=

	

Less than or equal to




==

	

Equal to




!=

	

Not equal to

= assigns a value.

== compares two values.

3. Logical Operators

- Used to combine or reverse Boolean conditions.

| Operator | Description |
|---|---|
| && | True if both conditions are true |
| || | True if at least one condition is true |
| ! | Reverses the Boolean result |

4. Assignment Operators

Used to assign or update variable values.

Operators: =, +=, -=, *=, /=, %=

int x = 10;

x += 5;  // x = 15
x -= 3;  // x = 12
x *= 2;  // x = 24
x /= 4;  // x = 6
x %= 4;  // x = 2
5. Unary Operators

Unary operators operate on a single operand.

Operators: +, -, ++, --

Pre-increment and Pre-decrement

++x — Increases the value first, then uses it.

--x — Decreases the value first, then uses it.

Post-increment and Post-decrement

x++ — Uses the current value first, then increases it.

x-- — Uses the current value first, then decreases it.

Example
int x = 10;
int y;

y = x++;  // y = 10, x = 11
y = ++x;  // y = 12, x = 12
y = x--;  // y = 12, x = 11
y = --x;  // y = 10, x = 10
6. Ternary Operator

A shorthand for if-else.

Syntax: condition ? valueIfTrue : valueIfFalse;

Example
int age = 20;

String result = age >= 18 ? "Adult" : "Child";

System.out.println(result); // Adult
7. Operator Precedence

Operator precedence determines which operator is evaluated first.

Parentheses () can be used to control the order of evaluation.

| Priority | Operators |
|---|---|
| 1 (Highest) | () |
| 2 | Postfix: x++, x-- |
| 3 | Unary: ++x, --x, !, +, - |
| 4 | *, /, % |
| 5 | +, - |
| 6 | Relational: <, >, <=, >= |
| 7 | Equality: ==, != |
| 8 | && |
| 9 | || |
| 10 | ?: |
| 11 (Lowest) | =, +=, -=, *=, /=, %= |

Operators with higher precedence are evaluated before operators with lower precedence.

Use parentheses to make expressions clearer and control evaluation order.