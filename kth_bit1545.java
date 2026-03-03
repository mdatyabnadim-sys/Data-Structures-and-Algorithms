class Solution {
    String invert(String s){
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='0') sb.setCharAt(i,'1');
            else sb.setCharAt(i,'0');
        }
        return sb.toString();
    }
    String rev(String str){
        char[] s=str.toCharArray();
      int n=s.length;
        int i=0,j=n-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        String string=new String(s);
        return string;
    }
    String str(int a){
        if(a==1) return "0";
        StringBuilder st=new StringBuilder("");
        st.append(str(a-1)).append("1").append(rev(invert(str(a-1))));
        return st.toString();

    }
    public char findKthBit(int n, int k) {
        String s=str(n);
        return s.charAt(k-1);
    }
}