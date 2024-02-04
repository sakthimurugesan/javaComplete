package basic;

import java.util.Scanner;

/**
 * a_023_oneDimensionalArray
 */
public class a_023_oneDimensionalArray {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int arr2[]=arr;
        int arr3[]=new int[]
        {
            1,2,3,4,5,6
        };
        // if arr2 is modified arr will also be modified
        // this will not happen in variable
        // because here we are using new constructor to allocate spaces and 
        // it will assign spaces in heap memory

        // syntax for array creation

        // datatype var=new datatype[size];
        // datatype var={element_1,element_2,element_3,element_4};
        // int arr1[]=new int[]{1,2,3};

        // for printing use for-loop and for-each loop

        // use for loop to get input

        for(int i=0;i<arr.length;i++)
        arr[i]=in.nextInt();
        
        // arr.length is used to get no of elements in the array
    }
}