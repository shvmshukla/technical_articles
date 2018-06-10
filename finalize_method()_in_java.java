
public class finalize_method {
    public static void main(String[] args) {
        finalize_method fm= new finalize_method();
        fm=null;    
        System.gc();
    }
   
    @Override
   protected void finalize()
   {
       System.out.println("garbage collector called");
    
   }
}   

/*
OUTPUT
run:
garbage collector calledBUILD SUCCESSFUL (total time: 0 seconds)

*/

public class finalize_method {
    public static void main(String[] args) {
        finalize_method fm= new finalize_method();
        fm=null;    
        System.gc();
    }
   
    @Override
   protected void finalize()
   {
       System.out.println("garbage collector called");
       System.out.println(10/0);   //exception
    
   }
}

/*
OUTPUT
run:
garbage collector called
BUILD SUCCESSFUL (total time: 0 seconds)
*/

public class finalize_method {
    public static void main(String[] args) {
        finalize_method fm= new finalize_method();
      
         fm.finalize();
      
    }
   
    @Override
   protected void finalize()
   {
       System.out.println("garbage collector called");
       
    
   }
}   


/*
OUTPUT
run:
garbage collector called
BUILD SUCCESSFUL (total time: 0 seconds)
*/

public class finalize_method {
    public static void main(String[] args) {
        finalize_method fm= new finalize_method();
      
         fm.finalize();
      
    }
   
    @Override
   protected void finalize()
   {
       System.out.println("garbage collector called");
       System.out.println(10/0);
    
   }
}   

/*
run:
garbage collector called
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at finalize_method.finalize(finalize_method.java:23)
	at finalize_method.main(finalize_method.java:15)
/home/shivam/.cache/netbeans/8.2/executor-snippets/run.xml:53: Java returned: 1
BUILD FAILED (total time: 0 seconds)

*/

