package basic;

class balanceException extends ArithmeticException
{
    @Override
    public String getMessage()
    {
        return "Balance is invalid";
    }
   
}
//user defined exception
public class a_053_exception_class 
{
    public static void main(String[] args) {
        try {
            System.out.println(5/1);
            throw new balanceException();
        } catch (balanceException e) {
            System.out.println(e);
        }
    }
}
/*
    getMessage() will return the message alone
    printStack will print the function call stack
    toString() is used to return the whole error message

    to define custom exception message override the getMessage method
 */