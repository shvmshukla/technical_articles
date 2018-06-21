//throw is used to explicitly throw an exception 

public class throws_exception {
   
    public static void main(String[] args) throws ArithmeticException,NullPointerException 
    {
        int a=11;
        if(a>10)
         throw(new ArithmeticException("divide by zero"));
        else
            System.out.println("no problem");  
    }
}
