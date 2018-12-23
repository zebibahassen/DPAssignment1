//Java try block is used to enclose the code that might throw an exception.
//It must be used within the method.
//Java try block must be followed by either catch or finally block or both..
//Java catch block is used to handle the Exception.
//It must be used after the try block only.
//You can use multiple catch block with a single try.
//Java finally block is a block that is used to execute  
//important code such as closingconnection, stream etc.
//Java finally block is always executed whether exception is handled or not.
//Java finally block follows try or catch block.

// Java program to demonstrate 
// control flow of try-catch-finally clause
// when exception occur in try block
// and handled in catch block
class TryCatchFinallyExample
{
    public static void main (String[] args) 
    {
         
        // array of size 4.
        int[] arr = new int[4];
         
        try
        {
            int i = arr[4];
                 
            // this statement will never execute
            // as exception is raised by above statement
            System.out.println("Inside try block");
        }
         
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Exception caught in catch block");
        }
         
        finally
        {
            System.out.println("finally block executed");
        }
         
        // rest program will be executed
        System.out.println("Outside try-catch-finally clause");
    }
}