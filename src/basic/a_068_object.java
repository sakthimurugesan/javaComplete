package basic;

public class a_068_object {
    public static void main(String[] args) {
        /*
         * object class is the base class for all the class in java
         * so we can store all data type as object
         * and we can type cast and use it
         */
        Object arr[]=new Object[3];
        arr[0]="Sakthi";
        arr[1]=15.3;
        arr[2]=1;
        for (Object object : arr) {
            System.out.println(object);
        }
    }
}
