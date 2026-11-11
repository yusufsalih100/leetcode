class Solution {
    public void rotate(int[][] matrix) {
        int a,b;
        a=0;
        b=matrix.length-1;
        while (a<b) {
            for (int i=a; i<b; i++) {
                int r1=matrix[a][i];
                int r2=matrix[i][b];
                int r3=matrix[b][b+a-i];
                int r4=matrix[b+a-i][a];
                matrix[i][b]=r1;
                matrix[b][b+a-i]=r2;
                matrix[b+a-i][a]=r3;
                matrix[a][i]=r4;
            }
            a+=1;
            b-=1;
        }
    }
}