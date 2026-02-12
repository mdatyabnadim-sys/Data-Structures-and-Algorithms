class Sqrt_Binarysearch {
    public int mySqrt(int x) {
        if (x == 0)
            return 0;
        int lo = 1, hi = x;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid == x / mid)
                return mid; // condition is same as mid*mid==x
            else if (mid > x / mid)
                hi = mid - 1; // the condition is same as mid*mid>x
            else
                lo = mid + 1;// when mid*mid<x
        }
        return hi;
    }
}