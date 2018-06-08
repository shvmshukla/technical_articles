//Predict the output of following Java program.

// filename Main.java
class Grandparent {
    public void Print() {
        System.out.println("Grandparent's Print()");
    }
}
  
class Parent extends Grandparent {
    public void Print() {       
        System.out.println("Parent's Print()");
    }
}
  
class Child extends Parent {
    public void Print() {
        super.super.Print();  // Trying to access Grandparent's Print()
        System.out.println("Child's Print()");
    }
}
  
public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.Print();
    }
}
/*
Run on IDE
Output: Compiler Error

There is error in line “super.super.print();”. In Java, a class cannot directly access the grandparent’s members.
It is allowed in C++ though. In C++, we can use scope resolution operator (::) to access any ancestor’s member in
inheritance hierarchy. In Java,we can access grandparent’s members only through the parent class.
For example, the following program compiles and runs fine.
*/

// filename Main.java
class Grandparent {
    public void Print() {
        System.out.println("Grandparent's Print()");
    }
}
  
class Parent extends Grandparent {
    public void Print() {
        super.Print();
        System.out.println("Parent's Print()");
    }
}
  
class Child extends Parent {
    public void Print() {
        super.Print();
        System.out.println("Child's Print()");
    }
}
  
public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.Print();
    }
}
/*
Run on IDE
Output:

Grandparent's Print()
Parent's Print()
Child's Print()
*/
