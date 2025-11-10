class HappyNo{
    private int SumOfSquares(int n){
        int sum=0;
      while(n>0){
        int d=n%10;
        sum+=d*d;
        n/=10;
      }
      return sum;
    }
    public boolean isHappy(int n){
       int i=0;
       while(i<7){
        if(SumOfSquares(n)==1) return true;
        n=SumOfSquares(n);
        i++;
       }
       return false;
    }
}