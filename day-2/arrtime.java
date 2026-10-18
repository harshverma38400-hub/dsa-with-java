// palindrome in array

// import java.util.Arrays;

// class arrtime {

//     public static void main(String[] args) {

//         int arr[] = {1, 2, 3, 2, 1};

//         int[] arr1 = new int[arr.length];

//         for (int i = 0; i < arr.length; i++) {
//             arr1[i] = arr[i];
//         }
//         System.out.println(Arrays.toString(arr1));

//     }
// }

// extra

// public class arrtime {
//     public static void main(String[] args) {

//         int array[] ={1,2,3,2,1};
//         int n= array.length;
//         int flag=0;

//         for(int i=0;i<n/2;i++){
//             if(array[i]!=array[n-i-1]){
//                 flag=1;
//                 System.out.println("not palandrom");
//                 return ;
//             }
//         }
//         if (flag == 0) {
//             System.out.println("palandrom");
 
//         }
//     }
    
// }


// reversal of array


// public class arrtime {
//         public static void main(String[] args) {
    
//             int ar[] ={1,2,4,8,10,12,14};
//             int n= ar.length;

//             for (int i=0;i<n/2;i++){
//                 int temp=ar[i];
//                 ar[i]=ar[n-i-1];
//                 ar[n-i-1]=temp;
//             }

//             System.out.println("reversal an array ");
//             for(int i=0;i<n;i++){
//                 System.out.print(ar[i]+" ");
//              }
//              System.out.println(); //System.out.println(); array print hone ke baad agla output nayi line se shuru karne ke liye hai.

        
//     }}


// find a missing elemnt in array


// class arrtime{

//     public static void main(String[] args) {
//         int a []={1,2,4,6,7,5};
//         int n= a.length;
//         //sum natural no in an array 
//         int sum_of_natu_no = ((n+1)*(n+2))/2;
//         int sum =0;

//         for(int i=0;i<n;i++){
//                  //sum or current element present in array 
//              sum +=a[i];
//         }

//         int missing_no=0;
//         missing_no =sum_of_natu_no - sum;
//         System.err.println("we found it:"+ missing_no);


//     }
// }


// finding duplicate no. in array

// class arrtime{

//     public static void main(String[] args)
//     {
//     int[] arr={2,4,4,5,6,6};
//     int n = arr.length;

//     for (int i =0;i<n;i++) {
//         for(int j=i+1;j<n;j++){
//             if(arr[i] == arr[j]){
//               System.out.println("found dupilicate"+arr[i]);
//             }
//         }
//     }
// }
// }