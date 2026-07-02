class Solution { 
    int count(int digit , int num){
        int count=0;
       while(num!=0){
         if(num%10==digit) count++;
         num/=10;
       }
       return count;
    }
    public int countDigitOccurrences(int[] nums, int digit) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum += count(digit,nums[i]);
        }
        return sum;
    }
}