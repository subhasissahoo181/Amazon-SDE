class Solution {
    public void setZeroes(int[][] matrix) {
        int col0=1;
        int i,j;
        int cols=matrix[0].length, rows=matrix.length;
        //first loop for 0
        for(i=0; i<rows; i++){
            if(matrix[i][0] == 0){
                col0=0;
            }
            for(j=1; j<cols; j++){
                if(matrix[i][j] ==0){
                    matrix[i][0]=matrix[0][j] = 0;
                }

            }
        }
        //reverse for loop
        for(i=rows-1; i>=0; i--){
            for(j=cols-1; j>=1; j--){
                if(matrix[i][0]==0 ||matrix[0][j]==0){
                    matrix[i][j] =0;
                }
                
            }
            if(col0 ==0){
                    matrix[i][0]=0;
                }
        }

    }
}