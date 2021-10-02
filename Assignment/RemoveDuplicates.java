package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int[] arr= {0,0,1,1,1,2,2,3,3,4};
        int[] expectedNums= {0,1,2,3,4};
        int k = removeDuplicatesArray(arr); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert arr[i] == expectedNums[i];
        }

    }

    public static int removeDuplicatesArray(int[] nums) {
        int x=nums.length;
        int l=1;
        for(int i=1;i<x;i++){
            if(nums[i]!=nums[i-1]){
                nums[l]=nums[i];
                l++;
            }

        }
        return l;

    }
}
