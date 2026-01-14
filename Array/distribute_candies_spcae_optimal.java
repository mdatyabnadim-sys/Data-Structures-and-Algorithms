import java.util.*;
class distribute_candies_space_optimal{
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int count=0;
        for(int i=0;i<candyType.length-1;i++){
            if(candyType[i]!=candyType[i+1]) count++;
        }
        return Math.min(candyType.length/2,count+1);
    }
}