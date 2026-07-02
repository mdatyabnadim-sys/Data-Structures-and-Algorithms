package Strings;
class Solution {
    public String sortVowels(String s) {
        char[] arr=s.toCharArray();
        char[] vow=new char[s.length()];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]== 'A' || arr[i]== 'E' || arr[i]== 'I' || arr[i]== 'O' || arr[i]== 'U' || arr[i]== 'a' || arr[i]== 'e' || arr[i]== 'i' || arr[i]== 'o' || arr[i]== 'u'){
               vow[idx++]=arr[i];
            }
        }
        Arrays.sort(vow,0,idx);
        idx=0;
         for(int i=0;i<arr.length;i++){
            if(arr[i]== 'A' || arr[i]== 'E' || arr[i]== 'I' || arr[i]== 'O' || arr[i]== 'U' || arr[i]== 'a' || arr[i]== 'e' || arr[i]== 'i' || arr[i]== 'o' || arr[i]== 'u'){
               arr[i]=vow[idx++];
            }
        }
        return new String(arr);
    }
}