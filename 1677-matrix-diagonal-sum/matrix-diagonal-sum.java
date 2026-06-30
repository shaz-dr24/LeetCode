class Solution {
    public int diagonalSum(int[][] mat) {
        int total=primaryDiagonal(mat);
        for(int i=0;i<mat.length;i++){
            total=total+mat[i][mat.length-1-i];
        }
        if(mat.length % 2 == 1) {
            total =total- mat[mat.length / 2][mat.length / 2];
        }

        return total;
    }
      
        public int primaryDiagonal(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j){
                    sum=sum+mat[i][j];
                }
            }
        }
        return sum;
    }

}
