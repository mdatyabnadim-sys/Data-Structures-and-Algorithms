class spiral{
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int tne=m*n,minr=0,minc=0,maxr=m-1,maxc=n-1,count=0;
        List<Integer> ans = new ArrayList<>();
        while(count<tne){
            for(int i=minc;i<=maxc&&count<tne;i++){
                ans.add(matrix[minr][i]);
                count++;
            }
            minr++;
             for(int i=minr;i<=maxr&&count<tne;i++){
                ans.add(matrix[i][maxc]);
                count++;
            }
            maxc--;
             for(int i=maxc;i>=minc&&count<tne;i--){
                ans.add(matrix[maxr][i]);
                count++;
            }
            maxr--;
             for(int i=maxr;i>=minr&&count<tne;i--){
                ans.add(matrix[i][minc]);
                count++;
            }
            minc++;
        }
        return ans;
    }
}