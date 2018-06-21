// filename: Main.java
class Test {
    static int i;
    int j;
    static {
        i = 10;
        System.out.println("static block called ");
    }
    Test(){
        System.out.println("Constructor called");
    }
}
 
class Main {
    public static void main(String args[]) {
 
       // Although we have two objects, static block is executed only once.
       Test t1 = new Test();
       Test t2 = new Test();
    }
}

/*
Output:
static block called
Constructor called
Constructor called
*/
/*
What if we want to execute some code for every object?
We will use Initializer Block in Java  as follows:-

Initializer block contains the code that is always executed whenever an instance is created. It is used to
declare/initialize the common part of various constructors of a class. For example,
*/
import java.io.*;
public class GFG
{
    // Initializer block starts..
    {
        // This code is executed before every constructor.
        System.out.println("Common part of constructors invoked !!");
    }
    // Initializer block ends
 
    public GFG()
    {
        System.out.println("Default Constructor invoked");
    }
    public GFG(int x)
    {
        System.out.println("Parametrized constructor invoked");
    }
    public static void main(String arr[])
    {
        GFG obj1, obj2;
        obj1 = new GFG();
        obj2 = new GFG(0);
    }
}
/*
Run on IDE
Output:

Common part of constructors invoked!!
Default Constructor invoked
Common part of constructors invoked!!
Parametrized constructor invoked 
*/
