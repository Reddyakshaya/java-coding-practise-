Install jdk
  . jdk contains tools to write ,run and compile a java program 
  . to know the version should open terminal and check 
       java-version then javac-version

JVM,JRE,JDK:
  JDK - (java development kit) it is a kit which contains tools to run,write and compile a java program
  JRE -(java run time environment) it contains libraries which are used to run java
  JVM -(java virtual machine) it actually runs java bitecode
           JDK
            |
           JRE
            |
           JVM
How it runs:
  at first we compile it using main.java then javac for compilation and then it coverts to .class this .class we cant see but it coverts the code to bytecode in which the JVM can access it into machine code and produce the output.
          main.javac
              |
          main.class
              |
             JVM
              | 
            output
Main()
 public - JVM can acces using this
 static - can run without creating objects
 void - returns nothing
 main - program starts from this

Naming conventions 
    . class names
        maxValue
        studentName
    . variable names
         StudentName
         RollNumber
    . constant
         MAX_VALUE
         MIN_VALUE
    . method name
         StudentName()
         RollNumber()
 
