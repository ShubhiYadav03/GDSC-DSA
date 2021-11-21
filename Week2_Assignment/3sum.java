class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
              if(i>0&&nums[i]==nums[i-1]) continue;
        
                 int a=-1*nums[i];
                 int start=i+1, end =nums.length-1;
                while(start<end){
              List<Integer> l=new ArrayList<>();
            if(nums[start]+nums[end]==a){
             l.add(nums[i]);
             l.add(nums[start]);
             l.add(nums[end]);
             list.add(l);
                start++;
                while(nums[start]==nums[start-1]&&start<end) start++;
            }
            if(nums[start]+nums[end]>a)  end--;
            else start++;
        
                
                  }
              }
         return list;
        }
       }
