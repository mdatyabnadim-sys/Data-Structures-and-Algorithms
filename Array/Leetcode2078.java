class Leetcode2078 {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int i=0,j=n-1;
        int ans1=0;
        int ans2=0;
        while(i<j){
            int dist=Math.abs(i-j);
            if(colors[i]!=colors[j]) {
                ans1=dist;
                break;
            }
            j--;
        }
        j=n-1;
         while(i<j){
            int dist=Math.abs(i-j);
            if(colors[i]!=colors[j]){
               ans2=dist;
               break;
            } 
            i++;
        }
        return Math.max(ans1,ans2);
    }
}