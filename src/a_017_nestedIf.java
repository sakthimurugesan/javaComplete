/**
 * a_017_nestedIf
 nested-if contains if-else block inside another block
 this can be also written using logical operators using && ||
 */
public class a_017_nestedIf {

    public static void main(String[] args) {
        int a=10,b=12;
        if(a>5)
        {
            if(a==10)
            {
                System.out.println("A is greater than 5 and equal to 10");
            }
            else
            {
                System.out.println("A is greater than 5 and not equal to 10");
            }
        }
        else
        {
            System.out.println("A is not greater than 5");
        }

        if(a==10 && a>5)
        {
            System.out.println("A is greater than 5 and equal to 10");
        }
        else if(a>5 && a!=10)
        {
            System.out.println("A is greater than 5 and not equal to 10");
        }
        else
        {
            System.out.println("A is not greater than 5");
        }
    }
}