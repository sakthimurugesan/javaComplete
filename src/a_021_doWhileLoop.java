/**
 * a_021_doWhileLoop
 * do-while loop is an exit check loop it executes the body of the loop at least
 * once and it will check the condition
 * 
 * the conditon is checked at the end of the first iterations
 */
public class a_021_doWhileLoop {
    public static void main(String[] args) {
        int a=0;
        do
        {
            System.out.println("A : "+a++);
        }
        while(a<=10);

        a=12;
        do
        {
            System.out.println("A : "+a++);
        }
        while(a<=10);


    }

}