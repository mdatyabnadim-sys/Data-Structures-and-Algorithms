class peakindex{
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int low=1;// as n>=3 therefore it is not possible that peak will be in 0th index that is why we are considering search space from 1
        int high=n-2;//we are not checking the last index because arr is guaranteed to be a mountain array, so last elemenet can never be the target.
        int idx=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                idx=mid;
                break;
            }
            else if(arr[mid]>=arr[mid-1] && arr[mid]<=arr[mid+1]) low=mid+1;
            else high=mid-1;
        }
        return idx;
    }
}