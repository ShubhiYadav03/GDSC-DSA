package com.company;

import java.util.Scanner;

public class ImmediateSmaller {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int n=in.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = in.nextInt();
        }

        System.out.println( immediateSmaller(arr,n,x));
    }
    public static int immediateSmaller(int arr[], int n, int x)
    {
        int s=-1;
        for(int i=0;i<n;i++){
            if(arr[i]<x && arr[i]>s){
                s=arr[i];

            }
        }
        return s;



        // Your code here
    }
}
