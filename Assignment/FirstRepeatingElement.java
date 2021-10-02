package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = in.nextInt();
        }

        System.out.println( firstRepeated(arr,n));
    }

    public static int firstRepeated(int[] arr, int n) {
        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return i+1;

                }

            }

        }
        return -1;
    }
}
