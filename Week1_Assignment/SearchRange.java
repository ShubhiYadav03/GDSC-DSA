class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0){
            return new int[]{-1,-1};
        }
        int[] res=new int[2];
        int start=0, end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]>=target) end=mid-1;
            else start=mid+1;
        }
        if(start>nums.length-1||nums[start]!=target)
            return new int[]{-1,-1};

        res[0]=start;

        int start2=0, end2=nums.length-1;
        while(start2<=end2){
            int mid=start2+(end2-start2)/2;

            if(nums[mid]<=target) start2=mid+1;
            else  end2=mid-1;
        }
        res[1]=end2;
        return res;
    }
}
