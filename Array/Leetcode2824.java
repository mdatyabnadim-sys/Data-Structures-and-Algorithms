class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n=nums.size();
        Collections.sort(nums);
        int i=0;
        int j=n-1;
        int count=0;
        while(i<j){
            if(nums.get(i)+nums.get(j)<target) {
                count += j-i;
                i++;
            }
            else if(nums.get(i)+nums.get(j)>=target) j--;
        }
        return count;
    }
}