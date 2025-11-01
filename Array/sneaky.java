import java.util.*;
class sneaky{
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int i=0,a=0;
        int arr[]=new int[2];
        while(i<=nums.length-2){
            if(nums[i]==nums[i+1]){
              arr[a]=nums[i];
              a++;
              if(a==2) break;
              i+=2;
            }
            else{
                i++;
                continue;
            }
        }
        return arr;
        }
    }
