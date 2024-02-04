package basic;

/**
 * a_009_wideningNarrowing
 */

 /*
  
    widening is the process of converting lower data type to higher data type
    narrowing is the process of converting higher data type to lower data type

    widening
    int -> long
    float -> double

    narrowing

    long -> int
    double -> float

    while narrowing we will lose data and precision

  */
public class a_009_wideningNarrowing {

    public static void main(String[] args) {
        
        long l=99999999999999999L;
        int i=(int)(l);
        double d=123456789.12345d;
        float f=(float)(d);
        System.out.println("long l=99999999999999999L;");
        System.out.println("l\t=>"+l);
        System.out.println("int i=(int)(l);");
        System.out.println("i\t=>"+i);
        System.out.println("double d=123456789.12345d;");
        System.out.println("d\t=>"+d);
        System.out.println("float f=(float)(d);");
        System.out.println("f\t=>"+f);
      

    }
}