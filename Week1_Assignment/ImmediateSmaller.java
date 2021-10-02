
class Solution
{
    // Complete the function
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
