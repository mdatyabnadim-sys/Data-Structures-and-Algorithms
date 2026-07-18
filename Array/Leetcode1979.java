class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           if(nums[i]>max) max=nums[i];
           if(nums[i]<min) min=nums[i];
        }
        return gcd(min,max);
    }
     int gcd(int a,int b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}