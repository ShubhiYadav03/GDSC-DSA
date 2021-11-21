class Solution
{
    public static void sort012(int nums[], int n)
    {
               int start=0,end=n-1, m=0;
        while(start<=end){
            if(nums[start]==1) start++;
            else if(nums[start]==2) {
                swap(nums,start,end);
                end--;
            } 
            else if(nums[start]==0) {
                 swap(nums,start,m);
                m++;
                start++;
            }
        }
    }
    static void swap(int[] arr,int i,int j){
    int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
     // code here 
    }
}
