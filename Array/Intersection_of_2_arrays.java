import java.util.*;
class Intersection_of_2_arrays{
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n=Math.min(n1,n2);
        int arr[]=new int[n];
        int i=0,j=0,idx=0;
        while(i<n1){
        if(nums1[i]==nums2[j]){
              boolean found = false;
                for (int k = 0; k < idx; k++) {
                    if (arr[k] == nums1[i]) {
                        found = true;
                        break;
                    }
                }
                if(!found){
                    arr[idx]=nums1[i];
                     idx++;
                }
            j=0;
            i++;
        }
              else j++;
        if(j==n2){
            j=0;
            i++;
           }
        }
        return Arrays.copyOf(arr,idx);
    }
}