package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int d= in.nextInt();
        int n=in.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = in.nextInt();
        }
        rotateArr(arr,d,n);
        System.out.println(Arrays.toString(arr));
    }

    static void rotateArr(int[] arr, int d, int n)
    {
        int[] r=new int[n];
        for(int i=0;i<n;i++){
            if(i<n-d) r[i] = arr[i + d];
            else{
                r[i]=arr[i-n+d];
            }
            // System.out.print(r[i]+" ");
        }
        System.arraycopy(r, 0, arr, 0, n);



        // add your code here
    }

}
