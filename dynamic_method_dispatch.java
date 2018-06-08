
Method overriding is one of the ways in which Java supports Runtime Polymorphism. 
Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time, 
rather than compile time.

1) when an overridden method is called through a superclass reference, Java determines which version(superclass/subclasses)
of that method is to be executed based upon the type of the object being referred to at the time the call occurs. 
Thus, this determination is made at run time.

2) At run-time, it depends on the type of the object being referred to (not the type of the reference variable) that 
determines which version of an overridden method will be executed

3) A superclass reference variable can refer to a subclass object. This is also known as upcasting. 
Java uses this fact to resolve calls to overridden methods at run time.
-----------------------------------------------------------------------------------------------------------------------------
class A
{
    void m1()
    {
        System.out.println("Inside A's m1 method");
    }
}
 
class B extends A
{
    // overriding m1()
    void m1()
    {
        System.out.println("Inside B's m1 method");
    }
}
 
class C extends A
{
    // overriding m1()
    void m1()
    {
        System.out.println("Inside C's m1 method");
    }
}
 
// Driver class
class Dispatch
{
    public static void main(String args[])
    {
        // object of type A
        A a = new A();
 
        // object of type B
        B b = new B();
 
        // object of type C
        C c = new C();
 
        // obtain a reference of type A
        A ref;
         
        // ref refers to an A object
        ref = a;
 
        // calling A's version of m1()
        ref.m1();
 
        // now ref refers to a B object
        ref = b;
 
        // calling B's version of m1()
        ref.m1();
 
        // now ref refers to a C object
        ref = c;
 
        // calling C's version of m1()
        ref.m1();
    }
}
/*
run:
Inside A's m1 method
Inside B's m1 method
Inside C's m1 method
BUILD SUCCESSFUL (total time: 1 second)
*/
----------------------------------------------------------------------------------------------------------------------------

/*
super class ka reference derieved class ke reference ko hold kr sakta h but vice versa results in error.(dats y run time 
polymorphism(or dynamic method dispatch does not occurs with variables))
*/
// Java program to illustrate the fact that
// runtime polymorphism cannot be achieved
// by data members
 
class A
{
    int x = 10;
}
 
// class B
class B extends A
{
    int x = 20;
}
 
// Driver class
public class Test
{
    public static void main(String args[])
    {
        A a = new B(); // object of type B
 
        // Data member of class A will be accessed
        System.out.println(a.x);
    }
}

Run on IDE
Output:

10

Explanation : In above program, both the class A(super class) and B(sub class) have a common variable ‘x’. Now we make 
object of class B, referred by ‘a’ which is of type of class A. Since variables are not overridden, so the statement “a.x” 
will always refer to data member of super class.



