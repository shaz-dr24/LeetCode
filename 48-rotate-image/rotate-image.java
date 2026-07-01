class Solution {
    public void rotate(int[][] matrix) {
        int transpose[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                transpose[j][i]=matrix[i][j];
            }
        }

        for(int i=0;i<transpose.length;i++){
            int left=0;
            int right=transpose.length-1;
            while(left<right){
                int temp;
                temp=transpose[i][left];
                transpose[i][left]=transpose[i][right];
                transpose[i][right]=temp;
                left++;
                right--;
            }
        }


        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=transpose[i][j];
            }
        }
    }
}