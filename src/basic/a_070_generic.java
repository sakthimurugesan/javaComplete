package basic;

class a_070_generic_1<T,K>
{
    T[] age;
    K[] name;
    public void setAge(T[] age)
    {
        this.age=age;
    }
    public void setName(K[] name)
    {
        this.name=name;
    }
    public void getName()
    {
         for (K t : name) {
            System.out.println(t);
        }
    }
    public void getAge()
    {
       
        for (T t : age) {
            System.out.println(t);
        }
    }
 }
 class a_070_generic_2<t>
 {
   public t val;

 }
 class a_070_generic_3 extends a_070_generic_2<String>
 {
    int age;
    
 /*
  * if the children class extends generic class we must mention datatype of parent class
    
  */
 }
 class a_070_generic_4<T> extends a_070_generic_2<String> // subclass types
 {
   public T t;
 }

class a_070_generic_5<T extends Number> // bound limits
// we can also use super instead of extends 
{
    public T obj;
}

public class a_070_generic 
{
    public static void main(String[] args) 
    {
        // we can pass multiple data types to it
        a_070_generic_1<Integer,String> obj=new a_070_generic_1();
        Integer a[]=new Integer[]{1,2,3,4,5,6,7};
        Double b[]=new Double[]{1.d,2.d,3.d,4.d,5.d,6.d,7.d};
        String c[]=new String[]{
            "Sakthi",
            "Murugesan",
            "Gayathri"
        };
        obj.setAge(a);
        obj.setName(c);

        obj.getAge();
        obj.getName();

        a_070_generic_1<Double,String> obj1=new a_070_generic_1();
        obj1.setAge(b);
        obj1.setName(c);

         obj1.getAge();
        obj1.getName();

        a_070_generic_3 obj2=new a_070_generic_3();
        obj2.age=15;
        obj2.val="Sakthi"; 

        /*
         * we can also mention a generic child class
         */
        a_070_generic_4<Integer> obj3=new a_070_generic_4();
        obj3.t=15;

        a_070_generic_5<Integer> obj4 =new a_070_generic_5();   // you can't create object other than number

        obj4.obj=15;

        // a_070_generic_5<String> obj5=new a_070_generic_5();
        // above line will show u an error
    }
}
