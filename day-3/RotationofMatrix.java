

// import java.util.*;


// public class RotationofMatrix {

//     static void roation(int [][] arr){
//         int m=arr.length;
//         // arr[0] 1row {1,2,3,4} kitni column lele ga that it will give us length 
//         int n= arr[0].length;

//         for(int i=0;i<m;i++){
//             for(int j=i;j<n;j++){
//                 int temp = arr[i][j];
//                 arr[i][j] =arr[j][i];
//                 arr[j][i]= temp;
//             }
//         }

//         // swap the left and right side element 

//         for(int i =0;i<m;i++){
//             int li =0;
//             int rg =n-1;

//             while(li<rg){
//               int temp = arr[i][li];
//               arr[i][li] =arr[i][rg];
//               arr[i][rg]=temp;

//                 li++;
//                 rg--;
//             }
//         }

//     }
    
//     public static void main(String[] args) {

//       //function ke andar jab tu array ke elements change karta hai, toh original array ke elements bhi change ho jaate hain
//       //main() ka arr aur roation() ka arr same array ko refer kar rahe hain.
        
//         int[][] arr ={
//             {1,2,3,4},
//             {5,6,7,8},
//             {9,10,11,12},
//             {13,14,15,16}
//         }; 
//         roation(arr);

//         for(var mat:arr){
//             System.out.println(Arrays.toString(mat));
//         }
//     }
// }


//prefix Sub Broot Approach


// import java.util.*;
// import java.io.*;

// class RotationofMatrix{


//     static int findsumMatrix(int[][] arr, int r1, int c1, int r2, int c2){
//        int sum =0;
//        for(int i=r1;i<=r2;i++){
//         for(int j=c1;j<=c2;j++){
//             sum+=arr[i][j];

//         }
//        }  
//        return sum;
//     }
//       public static void main(String []args){

//         Scanner sc = new Scanner(System.in);

//         System.err.println("enter no of rows");
//         int m = sc.nextInt();

//         System.err.println("enter no of column");
//         int n = sc.nextInt();
              
//         System.err.println("enter the matrix element");
//            int arr[][]=new int[m][n];
//          for(int i =0; i<m;i++){
//             for(int j =0; j<n;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//          }
        
//          int r1,c1,r2,c2;

//          System.err.println("enter u r1");
//          r1 =sc.nextInt();
//          System.err.println("enter u c1");
//          c1 =sc.nextInt();
//          System.err.println("enter u r2");
//          r2 =sc.nextInt();
//          System.err.println("enter u c2");
//          c2 =sc.nextInt();

//         int  result = findsumMatrix(arr,r1,c1,r2,c2);

//         System.err.println("here is result"+result);
// }}






