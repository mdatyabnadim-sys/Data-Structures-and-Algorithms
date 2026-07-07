class Solution {
    public long sumAndMultiply(int n) {
       long x=0;
       long temp=(long) n;
       // making the numbers in reverse, skipping zeroes.
       while(temp!=0){
       if((temp%10)!=0) x=(x*10)+(temp%10);
          temp/=10;
       }
       
       //finding sum
       long sum=0;
       long t=x;
       while(t!=0){
        sum+=(t%10);
        t/=10;
       }
       
       //reversing the number
       long ans=0;
       while(x!=0){
          ans=(ans*10)+(x%10);
          x/=10;
       }
       return sum*ans;
    }
}