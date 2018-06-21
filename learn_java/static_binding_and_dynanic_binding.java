https://www.geeksforgeeks.org/static-vs-dynamic-binding-in-java/
https://www.geeksforgeeks.org/can-we-overload-or-override-static-methods-in-java/

1) For class (or static) methods, the method according to the type of reference is called, not according to the abject being
referred, which means method call is decided at compile time.

2) For instance (or non-static) methods, the method is called according to the type of object being referred, 
not according to the type of reference, which means method calls is decided at run time.

----------------------------------------------------------------------------------------------------------------------------

#static_binding (done at compile time and better in permormance)

public class NewClass
{
    public static class superclass
    {
        static void print()
        {
            System.out.println("print in superclass.");
        }
    }
    public static class subclass extends superclass
    {
        static void print()
        {
            System.out.println("print in subclass.");
        }
    }
 
    public static void main(String[] args)
    {
        superclass A = new superclass();
        superclass B = new subclass();
        A.print();
        B.print();
    }
}
/*
print in superclass.
print in superclass.
*/

----------------------------------------------------------------------------------------------------------------------------
#Dynamic binding

public class NewClass
{
    public static class superclass
    {
        void print()
        {
            System.out.println("print in superclass.");
        }
    }
 
    public static class subclass extends superclass
    {
        @Override
        void print()
        {
            System.out.println("print in subclass.");
        }
    }
 
    public static void main(String[] args)
    {
        superclass A = new superclass();
        superclass B = new subclass();
        A.print();
        B.print();
    }
}

/*
Output:

print in superclass.
print in subclass.

*/
----------------------------------------------------------------------------------------------------------------------------

3) An instance method cannot override a static method, and a static method cannot hide an instance method. 
For example, the following program has two compiler errors.


// Superclass
class Base {
     
    // Static method in base class which will be hidden in subclass 
    public static void display() {
        System.out.println("Static or class method from Base");
    }
     
     // Non-static method which will be overridden in derived class 
     public void print()  {
         System.out.println("Non-static or Instance method from Base");
    }
}
 
// Subclass
class Derived extends Base {
     
    // Static is removed here (Causes Compiler Error) 
    public void display() {
        System.out.println("Non-static method from Derived");
    }
     
    // Static is added here (Causes Compiler Error) 
    public static void print() {
        System.out.println("Static method from Derived");
   }
}
