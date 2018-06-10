
interface GPI
{
    // default method
    default void show()
    {
        System.out.println("Default GPI");
    }
}
 
interface PI1 extends GPI
{
    int a1=10;
    void show1();
}
 
interface PI2 extends GPI
{ 
    int a1=20;
    void show2();
}
 
// Implementation class code
class diamond_problem_solution implements PI1, PI2
{
    public void show1()
    {
        System.out.println("the value of a1 in show1() is "+PI1.a1);  
    }
    public void show2()
    {
        System.out.println("the value of a1 in show1() is "+PI2.a1);
    }
    public static void main(String args[])
    {
        diamond_problem_solution d = new diamond_problem_solution();
        d.show();
        d.show1();
        d.show2();
    }
}

/*
run:
Default GPI
the value of a1 in show1() is 10
the value of a1 in show1() is 20
BUILD SUCCESSFUL (total time: 0 seconds)
*/
