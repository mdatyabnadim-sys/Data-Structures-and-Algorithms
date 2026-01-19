import java.util.*;
class distinct_averages{
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums); //Sorting the array using the inbuild java function
        Set<Double> set = new HashSet<>(); //creating a hashset
        for (int i = 0; i < nums.length/ 2; i++) { 
            double avg = (nums[i] + nums[nums.length - (i + 1)]) / 2.0; // array is sorted, so smallest element is in front and the largest is in rear position
            set.add(avg); //adding the average every time in the Hashset
        }
        return set.size(); // since in a hashset, no elements repeats so the size will contain only distinct averages.
    }
}