class Solution {
    public int sum(int n){
        return (n*(n+1))/2;
    }
    public int minimumPushes(String word) {
        int n=word.length();
        if(n<=8) return n;
        int count=0;
        return 8*sum(n/8) + (n%8)*(n/8+1);
    }
}