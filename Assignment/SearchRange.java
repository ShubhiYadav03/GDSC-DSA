package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SearchRange
{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int t=in.nextInt();
        int[] arr=new int[7];
        for (int i=0;i<7;i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(searchRange(arr,t)));
    }

 static int[] searchRange(int[] nums, int target) {
        int x=nums.length;

        int[] de={-1,-1};
        if(x==0){
            return de ;
        }


        for(int i=0;i<x;i++){
            if(nums[i]==target){
                de[0]=i;

                break;
            }


        }
        for(int j=de[0]+1;j<x;j++){
            if(nums[j]!=target){
                de[1]=j-1;
                return de;
            }
        }
        return  de;
    }
}
