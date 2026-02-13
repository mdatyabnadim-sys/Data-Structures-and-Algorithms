class highestAltitude{
    public int largestAltitude(int[] gain) {
        int running_sum=0;
        int highest=0;
        for(int i=0;i<gain.length;i++){
            running_sum+=gain[i];
            highest=Math.max(highest,running_sum);
        }
        return highest;
    }
}