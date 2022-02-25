/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lo = 1, hi = n;
        int mid = lo + (hi - lo)/2;
        
        while(lo<=hi){
            mid = lo + (hi - lo) / 2;
            if(isBadVersion(mid) && !isBadVersion(mid-1)){
                return mid;
            }else if(isBadVersion(mid) && isBadVersion(mid-1)){
                hi = mid;
            }else{
                lo = mid+1;
            }
        }
        return -1;
    }
}