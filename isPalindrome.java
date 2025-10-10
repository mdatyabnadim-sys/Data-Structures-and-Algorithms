class isPalindrome{
    public static boolean isPalindrom(int x) {
        int rev=0;
        int original=x;
        if(x>=0){
        while(x!=0){
            rev*=10;
            rev=rev+(x%10);
            x=x/10;
        }
        if(original == rev){
            return true;
        }
        else{
            return false;
        }
        }
        else{
            return false;
        }
        
    }
}

    

