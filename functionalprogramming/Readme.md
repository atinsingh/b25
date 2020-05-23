#Recap of 22 May

`` Instance variable are not allowed in interface``

## Functional Programming vs Object Oriented Programming
in OO programming you deal with Objects. You pass in method
return them from method. 

1. Objects 
2. Classes
3. Interface
4. Enums : They are enumerated values and created as 
```java 
    public enum ShirtSize{ 
        S,M,L;
    }
```
use them like 
```java
    ShirtSize.M;
```

5. Lambda
6. String
7. Inheritance
### Exception Handling in Java
Error- are the condition which may 
occur during your program run,
which you should not try to catch 
when  error occurs, program will 
get terminated. You can't rectify them. 

Exception are condition which may come
during program execution, whenever exception 
occurs you promgrams normal execution 
flow is intrupted, and JVM will try to 
find handler, if there is no handler, JVM 
will terminate the program.


Exception are handled using 
```java
try {
    //code which generate exception gors here
}catch(Exception ex){
}catch() {
}finally{
}
```

#### Checked Exception 
Checked exception have IOException as parent, for checked exception 
compiler will force you to handle, your code will not compile if
you do not write try/catch or handle it. 

#### Unchecked Exception 
Unchecked exceptions are the RunTimeException, compiler will not force 
you to handle them, they are mostly logical issue or user input issues.


