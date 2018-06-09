interface zero
{
   int c=1;
   void show0();
}

interface first
{
   int a=1;
   void show1();
}

interface second extends zero
{
   int a=10;
   void show1();
}

abstract class abs
{
  private int a=50;
  abs()
  {
      
  }
   abstract void show_abstract();
   final void display()
  {
      System.out.println("inside abstract"+a);
  }
}

public class interface_abstract_classes extends abs implements first,second
{
    
   public void show()
    {
        System.out.println("hello interface first"+first.a);
    }
   
    public void show0()
    {
        System.out.println("hello interface zero"+c);
    }
    
    @Override
   public void show1()
    {
        System.out.println("hello interface second "+second.a);
    }
   
    @Override
    void show_abstract() {
        System.out.println("show_abstract_method_called");
    }
    public static void main(String[] args) {
        
    new interface_abstract_classes().show();
   // new interface_abstract_classes().c=20;
        
    int z=zero.c;
    System.out.println("z= "+z);
    
    new interface_abstract_classes().show0();
    
    new interface_abstract_classes().show1();
    
    new interface_abstract_classes().show_abstract();
    
    new interface_abstract_classes().display();
   
    }

   
}
    
/*
OUTPUT
run:
hello interface first1
z= 1
hello interface zero1
hello interface second 10
show_abstract_method_called
inside abstract50
BUILD SUCCESSFUL (total time: 0 seconds)

*/
