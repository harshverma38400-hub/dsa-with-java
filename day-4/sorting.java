
// Linear Search



// import java.util.*;
// import java.io.*;
// public class sorting {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.err.println("enter the total array element ");
//         int n= sc.nextInt();

//         System.out.println("eneter the elements");
//         int arr[]=new int[n];

//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//         System.out.println("enter the target value");
//         int x=sc.nextInt();
//         int idx=-1;

//         for(int i=0;i<n;i++){
//             if(arr[i]==x){
//                   idx =i;
//                   break;
//             }
//         }

//         if (idx==-1) {
//             System.out.println("there is not any targated value");
//         } else {
//             System.out.println("u got it :"+idx);
//         }

        
//     }}


// binary search

// public class sorting {
//     public static int binarySearch(int arr[], int x) {

//         int low = 0;
//         int high = arr.length - 1;

//         while (low <= high) {

//             int mid = low + (high - low) / 2;

//             if (arr[mid] == x) {
//                 return mid;
//             }
//             else if (arr[mid] < x) {
//                 low = mid + 1;
//             }
//             else {
//                 high = mid - 1;
//             }
//         }

//         return -1;
//     }
//     public static void main(String[] args) {

//         int arr[] = {2, 4, 6, 8, 10, 12, 14};
//         int x = 14;

//         int result = binarySearch(arr, x);

//         System.out.println("Element found at index: " + result);
//     }

   
// }

// sorting the array

import java.util.*;

public class sorting {

    public static void main(String[] args) {
        Integer ar[]={2,5,7,53,4,5,32,3,8};

        Arrays.sort(ar,Collections.reverseOrder());

        System.out.println("here our array:"+Arrays.toString(ar));
    }
    
}