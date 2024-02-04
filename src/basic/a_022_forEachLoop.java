package basic;

/**
 * a_022_forEachLoop
 for-each loop is used to access the array elements directly without using index

 it will start from the begin and iterate till the end

 we cannot set starting and ending point in this loop

 but we can break the loop

 for(data_type var:array_name)
 {
    //code
 }
 */
public class a_022_forEachLoop {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,0};

        for(int a:arr)
        System.out.println(a);
        
    }
}