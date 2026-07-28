class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int n=height.length;
        int j=n-1;
        int max_area=Integer.MIN_VALUE;
        while(i<j){
           int area=(j-i)*Math.min(height[i],height[j]);
           if(area>max_area) max_area=area;
           if(height[i]>height[j]) j--;
           else i++;
        }
        return max_area;
    }
}