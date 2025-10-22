class powerof3 {
    public boolean isPowerOfThree(int n) {
        int i=0;
        boolean flag=false;
        while(n<Math.pow(2,31)){
            if(Math.pow(3,i)==n){
              flag=true;
                break;
            }
            if(n<=0) return false;
            if(Math.pow(3,i)>n) {
                break;
            }
               i++;
        }
        if(flag==true) return true;
        else return false;
     
    } 
}
