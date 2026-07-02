class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int i=0;
        int j=0;
        int countT=0;
        int countF=0;
        int ans=0;
        while(j<answerKey.length()){
           if(answerKey.charAt(j)=='T') countT++;
           else countF++;
           while(Math.min(countT,countF)>k){
            if(answerKey.charAt(i)=='T') countT--;
            else countF--;
            i++;
           }
           ans=Math.max(ans,countT+countF);
           j++;
        }
        return ans;
    }
}