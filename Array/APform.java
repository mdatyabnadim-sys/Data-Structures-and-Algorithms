class APform{
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int k=arr[1]-arr[0];
        if(arr.length==2) return true;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]!=k) return false;
        }
        return true;
    }
}