#call by value

public class call_by_value_in_java {
    
    public static void swap(int x,int y)
    {
        int temp;
        temp=x;
        x=y;
        y=temp;
    }
    
    public static void main(String[] args) {
      int a=10;
      int b=20;
        System.out.println("before swap being called values are:");
        System.out.println("a= "+a+"   b= "+b);
        
        swap(a,b); //sends copy of values ... hence original values will remain unchanged
        
        System.out.println("After swap being called values are:");
        System.out.println("a= "+a+"   b= "+b);
    }
}

/*
run:
before swap being called values are:
a= 10   b= 20
After swap being called values are:
a= 10   b= 20
BUILD SUCCESSFUL (total time: 0 seconds)
*/
----------------------------------------------------------------------------------------------------------------------------

#call_by_refernce (in java there is no call by reference, see here)

public class call_by_reference_in_java {
    int z;
    call_by_reference_in_java(int value)
    {
      z=value;
    }
   
    public static void swap(call_by_reference_in_java x,call_by_reference_in_java y)
    {
        call_by_reference_in_java temp;
        
        temp=x;
        x=y;
        y=temp;
    }
    
    public static void main(String[] args) {
      
      call_by_reference_in_java a= new call_by_reference_in_java(10);
      call_by_reference_in_java b= new call_by_reference_in_java(20);
      System.out.println("before swap being called values are:");  
      System.out.println("a= "+a.z+"   b= "+b.z);
        
      swap(a,b);   // references ki actual values as call by value pass ki gyi h so x and y swap honge 
                              //but they will not change a and b itself  
      
      System.out.println("after swap being called values are:");
      System.out.println("a= "+a.z+"   b= "+b.z);
    }
}

/*
run:
before swap being called values are:
a= 10   b= 20
after swap being called values are:
a= 10   b= 20
BUILD SUCCESSFUL (total time: 0 seconds)

*/
---------------------------------------------------------------------------------------------------------------------------

#call_by_reference (call by reference can be done by following manner)

public class call_by_reference_in_java {
    int z;
    call_by_reference_in_java(int value)
    {
      z=value;
    }
   
    public static void swap(call_by_reference_in_java x,call_by_reference_in_java y)
    {
        //call_by_reference_in_java temp;
        int temp;
        temp=x.z;
        x.z=y.z;
        y.z=temp;
    }
    
    public static void main(String[] args) {
      
      call_by_reference_in_java a= new call_by_reference_in_java(10);
      call_by_reference_in_java b= new call_by_reference_in_java(20);
      System.out.println("before swap being called values are:");  
      System.out.println("a= "+a.z+"   b= "+b.z);
        
      swap(a,b);   //  swapping of values done by entering to their places(refernce se unke ghar ka address nikala aur 
                                                                           //unke ghar me ghuske change kr diya) 
      
      System.out.println("after swap being called values are:");
      System.out.println("a= "+a.z+"   b= "+b.z);
    }
}

/*
run:
before swap being called values are:
a= 10   b= 20
after swap being called values are:
a= 20   b= 10
BUILD SUCCESSFUL (total time: 0 seconds)

*/
----------------------------------------------------------------------------------------------------------------------------



/*
Solution is to use Wrapper Class If we create a wrapper class that contains references of Car, we can swap cars by 
swapping references of wrapper class.
*/

// A Java program to demonstrate that we can use wrapper
// classes to swap to objects
 
// A car with model and no.
class Car
{
    int model, no;
 
    // Constructor
    Car(int model, int no)
    {
        this.model = model;
        this.no = no;
    }
 
    // Utility method to print object details
    void print()
    {
        System.out.println("no = " + no + 
                           ", model = " + model);
    }
} 

// A Wrapper over class that is used for swapping
class CarWrapper
{
   Car c;
 
   // Constructor
   CarWrapper(Car c)   {this.c = c;}
}
 
// A Class that use Car and swaps objects of Car
// using CarWrapper
class Main
{
    // This method swaps car objects in wrappers
    // cw1 and cw2
    public static void swap(CarWrapper cw1, 
                            CarWrapper cw2)
    {
        Car temp = cw1.c;
        cw1.c = cw2.c;
        cw2.c = temp;
    }
 
    // Driver method
    public static void main(String[] args)
    {
        Car c1 = new Car(101, 1);
        Car c2 = new Car(202, 2);
        CarWrapper cw1 = new CarWrapper(c1);
        CarWrapper cw2 = new CarWrapper(c2);
        swap(cw1, cw2);
        cw1.c.print();
        cw2.c.print();
    }
}
/*
Run on IDE
Output:

no = 2, model = 202
no = 1, model = 101
*/
//https://www.geeksforgeeks.org/swap-exchange-objects-java/
----------------------------------------------------------------------------------------------------------------------------
