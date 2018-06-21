class Parent
{
    int value = 1000;
    Parent()
    {
        System.out.println("Parent Constructor");
    }
}
 
class Child extends Parent
{
    int value = 10;
    Child()
    {
        System.out.println("Child Constructor");
    }
}
 
// Driver class
class Test
{
    public static void main(String[] args)
    {
        Child obj=new Child();
        System.out.println("Reference of Child Type :"
                           + obj.value);
 
        // Note that doing "Parent par = new Child()"
        // would produce same result
        Parent par = obj;
 
        // Par holding obj will access the value
        // variable of parent class
        System.out.println("Reference of Parent Type : "
                           + par.value);
    }
}

/*
Parent Constructor
Child Constructor
Reference of Child Type : 10
Reference of Parent Type : 1000
*/

/*
concept
If a parent reference variable is holding the reference of the child class and we have the “value” variable in both the 
parent and child class, it will refer to the parent class “value” variable, whether it is holding child class object 
reference. The reference holding the child class object reference will not be able to access the members 
(functions or variables) of the child class. It is because compiler uses special run-time polymorphism mechanism only for methods.
*/
