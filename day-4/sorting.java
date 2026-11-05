
// Linear Search

import java.util.*;
import java.io.*;
public class sorting {

    public static void main(String[] args) {
          
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the total no. of array");
           int n=sc.nextInt();

       System.out.println("enter the value");
           int []arr = new int[n];

           for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
           }
              
           System.out.println("enter the target value");
           int x =sc.nextInt();
            int idx =-1;
           for(int i=0;i<n;i++){
            if(arr[i]== x){
                idx=i;
                break;
            }
           }

           if (idx == -1) {
            System.out.println("the element not found");
           }
           else{
            System.out.println("element found:"+idx);
           }
    }

}
