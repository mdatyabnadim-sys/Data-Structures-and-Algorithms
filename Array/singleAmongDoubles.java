class singleAmongDoubles {
    public static int search(int n, int arr[]) {
        int lo=0,hi=n-1;
        int left_count=0,right_count=0;
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int f=mid,s=mid;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) ans=arr[mid];
            if(arr[mid]!=arr[mid-1]) s=mid+1;
            else f=mid-1;
            left_count=f-lo;
            right_count=hi-s;
            if(left_count%2==0) lo=s+1;
            else hi=f-1;
        }
        return ans;
    }
}