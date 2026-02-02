class RotateArray{
    int[] rev(int arr[],int a,int b){  //method to reverse an array from index a to b
        while(a<b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
        return arr;
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        rev(nums,0,n-1); // reversing the whole array
        rev(nums,0,k-1); // reversing the first k elements of the reversed array
        rev(nums,k,n-1); //reversing from (k+1)th to last element of the array formed after 2nd call of rev
    }
}