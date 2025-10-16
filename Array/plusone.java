class plusone {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){ // Traverse from the end to the start.
            if(digits[i]<9){
                digits[i]++;// If the digit is less than 9, just add one and return.
                return digits;
            }
            digits[i]=0;// If digit is 9, set it to 0 and continue.
        }
        // If we got here, all digits were 9, so we need an extra digit at the beginning.
        int result [] = new int[n+1];
        result[0]=1;
        for(int i=1;i<n+1;i++){
            result[i]=0;// making all other element 0 except first.
        }
        return result;
    }
}