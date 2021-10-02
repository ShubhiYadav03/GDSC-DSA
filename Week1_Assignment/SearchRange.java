class Solution {
    public int[] searchRange(int[] nums, int target) {
         int x=nums.length;
      
       int[] de={-1,-1};
        if(x==0){
            return de ;
        }
          int[] r=new int[2];
         
        for(int i=0;i<x;i++){
            if(nums[i]==target){
                r[0]=i;
               
                break;
            }
            
            return r;
        }
         for(int j=r[0]+1;j<x;j++){
                    if(nums[j]!=target){
r[1]=j-1;
                      return r;
                    }
                }
        return  de;
    }
}
