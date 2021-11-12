class Solution {
    public void reverseString(char[] s) {
        int start=0,end=s.length-1;
        while(start<=end){
            swap(s,start,end);
            start++;
            end--;
        }
    }
    public void swap(char[] s,int i,int j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    } 
}
