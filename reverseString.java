package Strings;
class reverseString{
    public void reversestring(char[] s) {
        int n=s.length;
        int i=0,j=n-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}