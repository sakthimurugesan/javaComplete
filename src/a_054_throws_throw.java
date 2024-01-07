public class a_054_throws_throw {

    public int calcCost(int days) throws ArithmeticException
    {
        if(days==0)
        return 10000/days;
        throw new ArithmeticException("Days cannot be zero");
    }
    public void totalCost()
    {
        try
        {
            int cost=new a_054_throws_throw().calcCost(5);
            System.out.println(cost+cost*0.1);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
       new a_054_throws_throw().totalCost();
    }
}
/*
 throw is used to handle exception in same function
 throws is used to handle exception in outside function

 throws is used when a function returns a value with that value we need to process the further data  we can use throws
 
 if we mention throw inside calculating function and if it throws an error it will also throw an error in main function

 */