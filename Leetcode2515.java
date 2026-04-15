class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                int dist=Math.abs(i-startIndex);
                int circular_dist=n-dist;
                ans=Math.min(ans,Math.min(dist,circular_dist));
            }
        }
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
}