public class a_064_Math 
{
    public static void main(String[] args) 
    {
        /*
        Math class extends strict math class
        all the function of math class will call from strictmath
         */

         System.out.println(Math.ceilDiv(125,6));
         System.out.println(Math.floorDiv(123,6));

         /*
          * decreament,add,multiply,div-exact will prevent overflow of datas
          */
          System.out.println(Math.nextAfter(1.1f, 1.2f));
          System.out.println(Math.nextDown(1.1));
        //   Math.random() is uswd for generatng random value
        
    }
}
