class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int time=0;
        int n=garbage.length;
        int G_idx=0;
        int M_idx=0;
        int P_idx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<garbage[i].length();j++){
                if(garbage[i].charAt(j)=='M') M_idx=i;
                else if(garbage[i].charAt(j)=='P') P_idx=i;
                else G_idx=i;
                time++;
            }
        }
        for(int i=1;i<travel.length;i++){
            travel[i] += travel[i-1];
        }
        if(M_idx!=0) time +=travel[M_idx-1];
        if(G_idx!=0) time +=travel[G_idx-1];
        if(P_idx!=0) time +=travel[P_idx-1];
        return time;
    }
}