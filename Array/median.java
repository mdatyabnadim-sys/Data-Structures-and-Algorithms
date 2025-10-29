class median{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;// stores the length of nums1 and nums2 respectively.
        int arr[]=new int [m+n];// merged array.
        for(int i=0;i<m;i++){
            arr[i]=nums1[i];// filling the first m elements in arr.
        }
        for(int i=0;i<n;i++){
            arr[m+i]=nums2[i];// filling the last n elements in arr.
        }
        Arrays.sort(arr);// sorting the array in order to find median.
        int s=arr.length;
        double median;
        if(s%2==0) median=(arr[s/2]+arr[s/2-1])/2.0;//dividing by 2.0 so that median comes in decimal not integer.
        else median=arr[s/2];// technically it should be (s+1)/2 but since dividing 2 integers will also be an integer, therefore it will work if we give s/2.
        return median;
    }
}