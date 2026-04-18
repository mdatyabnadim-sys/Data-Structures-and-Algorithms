package Sorting;
class Solution {
    static int count;
    static int inversionCount(int arr[]) {
        count=0;
        mergesort(arr);
        return count;
    }
    public static void mergesort(int[] arr){
        int n=arr.length;
        if(n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        int idx=0;
        for(int i=0;i<n/2;i++) a[i]=arr[idx++];
        for(int i=0;i<n-n/2;i++) b[i]=arr[idx++];
        mergesort(a);
        mergesort(b);
        merge(a,b,arr);
    }
    public static void merge(int[] a,int[] b,int[] arr){
        int i=0;
        int j=0;
        int idx=0;
        while(i<a.length && j<b.length){
             if(a[i]<=b[j]) arr[idx++]=a[i++];
             else { // a[i]>b[j]
                 arr[idx++]=b[j++];
                 count+=a.length-i;
             }
        }
        while(i<a.length) arr[idx++]=a[i++];
        while(j<b.length) arr[idx++]=b[j++];
    }
    }