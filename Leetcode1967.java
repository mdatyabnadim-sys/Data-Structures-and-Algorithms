class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        int n=patterns.length;
        for(String pattern: patterns){
            if(word.contains(pattern)) count++; // checks whether the pattern is a substring of word or not.
        }
        return count;
    }
}