class rotatematrix {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        //step 1--> we are transposing the matrix
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //step 2--> reversing each row
        for(int i=0;i<n;i++){
            int j=0,k=n-1;
            while(j<k){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=temp;
                j++;
                k--;
            }
        }
    }
}
