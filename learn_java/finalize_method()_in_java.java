----------------------------------------------------------------------------------------------------------------------------
//CASE1: JVM calls garbage collector i.e.finalize() and no exception occurs in finalize() 	
public class finalize_method {
    public static void main(String[] args) {
        finalize_method fm= new finalize_method();
        fm=null;    
        System.gc();    //JVM calls garbage collector i.e.finalize() and no exception occurs in finalize()
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
---------------------------------------------------------------------------------------------------------------------------
/*CASE2: JVM calls garbage collector i.e.finalize() and exception occurs in finalize(), JVM ignores it and 
	normal termination is followed */
	
public class finalize_method {
    public static void main(String[] args) {
        finalize_method fm= new finalize_method();
        fm=null;    
        System.gc();    //JVM calls garbage collector i.e.finalize() and exception occurs in finalize(), JVM ignores it
	                //and normal termination is followed
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
----------------------------------------------------------------------------------------------------------------------------
//CASE3: when you explicitly calls garbage collector i.e.finalize() and no exception occurs in finalize()
	
public class finalize_method {
    public static void main(String[] args) {
        finalize_method fm= new finalize_method();
      
         fm.finalize();    //when you explicitly calls garbage collector i.e.finalize() and no exception occurs in finalize()
      
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
----------------------------------------------------------------------------------------------------------------------------
/*CASE3: when you explicitly calls garbage collector i.e.finalize() and exception occurs in finalize()
	                  exception is raised and it is not ignored at all */

   public class finalize_method {
    public static void main(String[] args) {
        finalize_method fm= new finalize_method();
      
         fm.finalize();  //when you explicitly calls garbage collector i.e.finalize() and exception occurs in finalize()
	                  // exception is raised and it is not ignored at all
      
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

----------------------------------------------------------------------------------------------------------------------------
