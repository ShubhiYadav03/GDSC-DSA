class Solution {
    public int removeDuplicates(int[] nums) {
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

