/**
 * a_071_generic
 */
class a_071_generic_1<T> {
    T var;

    a_071_generic_1(T t) {
        this.var = t;
    }

    public void dis() {
        System.out.println(var);
    }
}

public class a_071_generic {

    static <T extends Object> void disp(T lis[]) {
        for (T t : lis) {
            System.out.println(t);
        }
    }

    // this accept only numbers
    static <T extends Number> void disp1(T lis[]) {
        for (T t : lis) {
            System.out.println(t);
        }
    }

    static void disp2(a_071_generic_1 obj) {
        System.out.println(obj.var);
    }
    static void disp3(a_071_generic_1<? extends Number> obj) { 
        System.out.println(obj.var);
        // can accept only object that has generic of numbers
    }

    public static void main(String[] args) {
        disp(new Integer[] { 1, 2, 3, 4 });
        disp1(new Integer[] { 1, 2, 3, 4 });
        disp1(new Float[] { 1.f, 2.f, 3.f, 4.f });
        disp1(new Double[] { 1.d, 2.d, 3.d, 4.d });
        // disp1(new String[]{"Sakthi","Murugesan"});
        a_071_generic_1<Integer> obj = new a_071_generic_1(15);
        a_071_generic_1<String> obj2 = new a_071_generic_1("Sakthi");
        disp2(obj2);
        disp2(obj);
        // disp3(obj2); 
        // above line will error
        disp3(obj);

    }
}