package basic;

/**
 * a_069_generic
 */
@SuppressWarnings("unchecked")
class a_069_generic_1<T>
{
    T obj;
    T[] arr;
    a_069_generic_1(T obj)
    {
        this.obj=obj;
    }
    a_069_generic_1()
    {
        
    }
    public void getObj()
    {
        System.out.println(this.obj);
    }
    public void setArr(T[] arr)
    {
        this.arr=(arr);
    }
    public void disArr()

    {
        for(T i:arr)
        System.out.println(i);
    }
}
@SuppressWarnings("unchecked")
public class a_069_generic {

    public static void main(String[] args) {
        int a=5;
        a_069_generic_1<Integer> obj = new a_069_generic_1<>(a); // Specify the type parameter Integer
        obj.getObj();
        Integer[] s = new Integer[]{1, 2, 3, 4, 5}; // Use Integer[] instead of int[]
        obj.setArr(s);
        // if you are passing any variable always pass it as a wrapper class obj
        obj.disArr();

        // when no parmeter is passed when creating object it will take it as object class
        a_069_generic_1 obj1=new a_069_generic_1();
        obj1.obj="String";
        String arr1[]={
            "Sakthi",
            "Murugesan"
        };
        obj1.setArr(arr1);
        obj1.disArr();

        // when 
    }
}
