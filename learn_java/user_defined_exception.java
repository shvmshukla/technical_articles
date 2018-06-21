class MyException extends Exception
{
    //store account information
    private static int accno[] = {1001, 1002, 1003, 1004};
 
    private static String name[] =
                 {"Nish", "Shubh", "Sush", "Abhi", "Akash"};
 
    private static double bal[] =
         {10000.00, 12000.00, 5600.0, 999.00, 1100.55};
 
    // default constructor
    MyException() {    }
 
    // parametrized constructor
    MyException(String str) { super(str); }
 
    // write main()
    public static void main(String[] args)
    {
        try  {
            // display the heading for the table
            System.out.println("ACCNO" + "\t" + "CUSTOMER" +
                                           "\t" + "BALANCE");
 
            // display the actual account information
            for (int i = 0; i < 5 ; i++)
            {
                System.out.println(accno[i] + "\t" + name[i] +
                                               "\t" + bal[i]);
 
                // display own exception if balance < 1000
                if (bal[i] < 1000)
                {
                    MyException me =
                       new MyException("Balance is less than 1000");
                    throw me;
                }
            }
        } //end of try
 
        catch (MyException e) {
            e.printStackTrace();
        }
    }
}

/*
OUTPUT
run:
ACCNO	CUSTOMER	BALANCE
1001	Nish	10000.0
1002	Shubh	12000.0
1003	Sush	5600.0
1004	Abhi	999.0
MyException: Balance is less than 1000
	at MyException.main(MyException.java:45)
BUILD SUCCESSFUL (total time: 0 seconds)

*/

