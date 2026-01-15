import java.util.Scanner;
class Largest_number_at_least_twice_of_others{
    public int dominantIndex(int[] nums) {
        boolean a=false; // maintaining a flag variable
        int max=Integer.MIN_VALUE;
        int idx=-1; //maintaining the index
        for(int i=0;i<nums.length;i++) {
            if(max<nums[i]){ //finding the maximum element
                max=nums[i];
                idx=i;
            }
        }
        for(int i=0;i<nums.length;i++){ // checking the condition of question
            if(max>=2*nums[i] || nums[i]==max) a=true; // || nums[i]==max , coz when max=nums[i] then obviously the condition "max>=2*nums[i]" will be false
            else a=false;
            if(a==false) break; // max should be grater than twice of every element, so if by chance if the condition is false for any element then we should simply exit
        }
        if(a==true) return idx; // when the max is greater than twice of every other element of the array
        return -1; // when the condition stated in question is false for max
    }

}
