package Strings;
class Solution {
    public boolean checkOnesSegment(String s) {
      int n=s.length();
      for(int i=1;i<n;i++){
        if(s.charAt(i-1)=='0' && s.charAt(i)=='1') return false;
      }
      return true;
    }
}