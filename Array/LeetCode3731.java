class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       ArrayList<Integer> arr=new ArrayList<>();
       Arrays.sort(nums);
        int max=nums[nums.length-1];
       int min=nums[0];
       int idx=0;
       int i=min;
       while(i<=max){
        if(i!=nums[idx]) {
        arr.add(i);
        i++;
       }
       else {
        i++;
        idx++;
       }
    }
    Collections.sort(arr);
       return arr;
    }
}