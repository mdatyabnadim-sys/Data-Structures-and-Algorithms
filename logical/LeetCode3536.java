class Solution {
    public int maxProduct(int n) {
        int max=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;
        while(n!=0){
            int digit=n%10;
            if(digit>=max) {
                sec_max=max;
                max=digit;
        }
        if(digit< max && digit> sec_max) sec_max=digit;
        n/=10;
    }
    if(sec_max==Integer.MIN_VALUE) sec_max=max;
    return max*sec_max;
   }
}