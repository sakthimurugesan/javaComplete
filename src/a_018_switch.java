/**
 * a_018_switch
 switch case is used to match values and perform operations
 switch case is used only when we know what are values to compared

 it can evaluate expression if-else

 if(a+b==5) can be performed

 switch(a)
 {
 case a+10: // this is invalid
 // code
 }

 */
public class a_018_switch {

    public static void main(String[] args) {
        int a=10;
        double d=10.25D;
        float f=12.5f;
        String s="hello";
        char c='A';
        boolean bl=true;
        long l=156863L;
        short sh=10;
        byte bt=10;


        switch (a)
        {
            case 10:
                System.out.println("Number is 10 integer");
                break;
            default:
                System.out.println("Number not found");
                break;
        }


        switch (s)
        {
            case "hello":
                System.out.println("Hello found string");
                break;
            default:
                System.out.println("Hello not found");
                break;
        }

        switch (c)
        {
            case 'A':
                System.out.println("A is found char");break;
            default:
                System.out.println("A is not found");break;
        }

        switch (sh)
        {
            case 10:
                System.out.println("Number is 10 short ");
                break;
            default:
                System.out.println("Number not found");
                break;
        }

        switch (bt)
        {
            case 10:
                System.out.println("Number is 10 byte");
                break;
            default:
                System.out.println("Number not found");
                break;
        }
/*double,long,float,boolean not support switch case */
    }
}