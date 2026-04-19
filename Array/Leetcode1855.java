class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i=0,j=0;
        int m=nums1.length; // size of nums1
        int n=nums2.length; //size of nums2
        int result=0; 
        
        while(i<m && j<n){
            if(nums1[i]>nums2[j]) i++;
            else{
              result=Math.max(result,j-i);
              j++;
            }
        }
        return result;
    }
}