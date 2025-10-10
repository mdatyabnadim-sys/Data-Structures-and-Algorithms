class fibonacci {
    public int fib(int n) {
        if(n>=0&&n<=30){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
        return fib(n-1)+fib(n-2);
        }
        }
        else return -1;
    }
}