class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int i=0,j=numbers.length-1; // initializing two pointers.
    int[] ans=new int[2]; // making a new array of length 2.
    while(i<j){
        if(numbers[i]+numbers[j]==target){
            ans[0]=i+1; // doing +1 here due  to 1-based indexing as said in question.
            ans[1]=j+1;
            break; // as guaranteed that no other duplet is present.
        }
        else if(numbers[i]+numbers[j]>target) j--;
        else i++;
    }
    return ans;
    }
}