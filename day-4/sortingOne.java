// import java.util.*;

// public class sortingOne {

//     public static void bubblesort(int ar[]) {

//         for(int i = 0; i < ar.length - 1; i++) {

//             boolean swapped = false;

//             for(int j = 0; j < ar.length - i - 1; j++) {

//                 if(ar[j] > ar[j+1]) {

//                     int temp = ar[j];
//                     ar[j] = ar[j+1];
//                     ar[j+1] = temp;

//                     swapped = true;
//                 }
//             }

//             if(!swapped) {
//                 break;
//             }
//         }
//     }

//     public static void main(String[] args) {

//         int[] ar = {12, 35, 56, 13, 34, 15};

//         bubblesort(ar);

//         System.out.println("Here we got bubble sort: " + Arrays.toString(ar));
//     }
// }



// insertion sort 


import java.util.*;
import java.io.*;
public class sortingOne {

    public  static void insertion(int ar[]){

        for(int i=1;i<ar.length;i++){
            int j=i;
        while(j>0 && ar[j]<ar[j-1]){

            // swapping

            int temp = ar[j];
            ar[j]=ar[j-1];
            ar[j-1]=temp;
            j--;
        }
        }

    }
    public static void main(String[] args) {
         
        int []ar={11,34,56,23,12,9,12};

        insertion(ar);

        System.out.println(Arrays.toString(ar));
        
     

    }
}