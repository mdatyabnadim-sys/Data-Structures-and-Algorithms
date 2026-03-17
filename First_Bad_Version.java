package Searching;
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class First_Bad_Version extends VersionControl {
    public int firstBadVersion(int n) {
        int lo=1;
        int hi=n;
        int result=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isBadVersion(mid)){
                result=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        return result;
    }
}