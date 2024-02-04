package basic;

/**
 * a_020_whileLoop
 while loop is condition check loop
 unlike for-loop it is used to run the loop till the conditon is valid
 it checks the condition before entering into the loop
it may run infinetly if the conditons is not false 
 */
public class a_020_whileLoop {
    public static void main(String[] args) {
            int a=1;
            while(a<=10)
            {
                System.out.println("a : "+a++);
            }
            a=11;
            while(a<=10)
            {
                System.out.println("a : "+a++);
            }
            int i=0;
            while(i<10)
            {
                System.out.println("i : "+i);
                i++; // remove this line loop will run infinetly
            }
    }
    
}