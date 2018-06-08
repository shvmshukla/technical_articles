class Base
{
    public int f(int i)
    {
        System.out.print("f (int): ");
        return i+3;
    }
}
class Derived extends Base
{
    public double f(double i)
    {
        System.out.print("f (double) : ");
        return i + 3.3;
    }
}
class myprogram3
{
    public static void main(String args[])
    {
        Derived obj = new Derived();
        System.out.println(obj.f(3));
        System.out.println(obj.f(3.3));
    }
}

/*
f (int): 6
f (double): 6.6
*/
/*
 Java compiler determines correct version of the overloaded method to be executed at compile time based upon the
 type of argument used to call the method and parameters of the overloaded methods of both these classes receive the
 values of arguments used in call and executes the overloaded method.
 
 i.e. "java facilitates oveload resolution"
*/
