package basic;

public class a_055_finally {

    public int costCalc(int days) {
        int cost = 0;
        try {
            cost = 1000 / days;
        } catch (ArithmeticException e) {
            System.out.print(e);
        } finally {
            return cost;
        }
    }

    public static void main(String[] args) {
        /*
         * finally is used to execute at the end of the try and catch exceptions
         * finally will definitely occur after try and catch block
         * if the program doesn't throw any error it will execute try and finally
         * if the program throw any error it will execute try ,catch,finally
         * 
         * if the function has any return type and the value must be returned inside the
         * finally block
         */
        int t=new a_055_finally().costCalc(10);
    }
}