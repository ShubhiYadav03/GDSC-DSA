class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
       int[] r=new int[n];
       for(int i=0;i<n;i++){
           if(i<n-d){
           r[i]=arr[i+d];
           }else{
          r[i]=arr[i-n+d];
           }
       
       }
       for(int i=0;i<n;i++){
           arr[i]=r[i];
       }
      
       
       
        // add your code here
    }
}