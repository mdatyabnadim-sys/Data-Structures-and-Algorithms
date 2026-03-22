class Solution {
    int[][] rotate(int[][] arr){

    //transposing the matrix.
      int n=arr.length;
      for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            int temp=arr[i][j]; // swapping arr[i][j] with arr[j][i]
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
      }

    //now reversing each row of the matrix
    for(int i=0;i<n;i++){
    int first=0,last=n-1;
        while(first<last){
            int temp=arr[i][first];
                arr[i][first]=arr[i][last];
                arr[i][last]=temp;
                first++;
                last--;
            }
        }   
       return arr;
    }

    public boolean findRotation(int[][] mat, int[][] target) {
     int n=mat.length;
     for(int c=1;c<=4;c++){
        boolean equal=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[i][j]) {
                    equal=false;
                    break;
                }
            }
        }
        if(equal) return true;
        rotate(mat);
     }
     return false;
    }
}