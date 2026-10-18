

import java.util.*;


public class RotationofMatrix {

    static void roation(int [][] arr){
        int m=arr.length;
        // arr[0] 1row {1,2,3,4} kitni column lele ga that it will give us length 
        int n= arr[0].length;

        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                int temp = arr[i][j];
                arr[i][j] =arr[j][i];
                arr[j][i]= temp;
            }
        }

        // swap the left and right side element 

        for(int i =0;i<m;i++){
            int li =0;
            int rg =n-1;

            while(li<rg){
              int temp = arr[i][li];
              arr[i][li] =arr[i][rg];
              arr[i][rg]=temp;

                li++;
                rg--;
            }
        }

    }
    
    public static void main(String[] args) {

      
        
        int[][] arr ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        }; 
        roation(arr);

        for(var mat:arr){
            System.out.println(Arrays.toString(mat));
        }
    }
}
