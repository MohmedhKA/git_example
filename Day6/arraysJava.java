package Day6;

import java.util.Arrays;

public class arraysJava {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,78,9,5,0};
        int arr1[] = new int[9];
        //clone
        arr1 = arr.clone();
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        //Arrays.copyOf()
        int arr2[] = new int[9];
        arr2 = Arrays.copyOf(arr, 3);
        for(int i:arr2){
            System.out.print(i+" ");
        }
        System.out.println();

        //System.arraycopy()
        int arr3[] = new int[9];
        System.arraycopy(arr2, 0, arr3, 0, 3);
        for(int i:arr3){
            System.out.print(i+" ");
        }
        System.out.println();

    }
    
}
