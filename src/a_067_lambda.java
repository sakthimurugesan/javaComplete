interface Display {
    void disp(String t);
    

}

/**
 * Innera_067_lambda
 * a lambda can have a local variable and it can be modified
 * but it cannot access the outer variables
 * but it can access class level variable
 * lambda can be used only with functional interface
 */
interface Innera_067_lambda {

    int add(int x, int y);
}

interface Comp
{
    int comp(String s,String s1);
}

@SuppressWarnings("unchecked")
public class a_067_lambda {
    a_067_lambda(String s)
{
    System.out.println("contructor msg");
}
    public static void display(String s)

    {
        System.out.println(new StringBuffer(s).reverse());
    }
    public static void main(String[] args) {
        Display obj = (n) -> {
            System.out.println(n);
        };
        obj.disp("Hello");
        Innera_067_lambda obj1 = (x, y) -> {
            System.out.println("Adding");
            ;
            return x + y;
        };
        Innera_067_lambda obj2 = (x, y) -> x + y;
        System.out.println(obj1.add(15, 15));
        System.out.println(obj2.add(15, 15));

        Display a=a_067_lambda::display;
            a.disp("Hello");
        a=System.out::println;
        a.disp("Hello");

        Comp b=String::compareTo;
        int c=b.comp("Hello", "Hello");
        System.out.println(c);

        a=a_067_lambda::new;
        a.disp(null);
        

    }
}
