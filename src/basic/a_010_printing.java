package basic;

/**
 * a_010_printing
 */

 /*
  System.out.println() is used to print in new line
  System.out.print() is used to print in same line untill we print a "\n"
  */
public class a_010_printing {

    public static void main(String[] args) {
        int a=12,b=13,c=15;
        System.out.println(a+b+"\tSum");
        System.out.println((a+b)+"\tSum");
        System.out.println("Sum\t"+a+b);
        System.out.println("Sum\t"+(a+b));
    }
}