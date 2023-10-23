/**
 * a_016_if_Elseif_Else
 if else-if else

 it works similar to if else but we can add extra condition using else-if

 if the first conditon is true it will execute if block
 then it will check the else-if block
 if all the conditions are false it will execute else block

 */
public class a_016_if_Elseif_Else {
    public static void main(String[] args) {
        int a=10,b=12,c=13;
        if(a>b && a>c)
        {
            // true block
            System.out.println("A=10 is greater than B=12 and C=13");
        }
        else if(b>c)
        {   // else-if block
            System.out.println("B=12 is greater than A=10 and C=13");
        }
        else
        {
            // else block
            System.out.println("C=13 is greater than A=10 and B=12");
        }
    }
    
}