import java.util.*;
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                al.add(mat[i][j]);
            }
        }
        if(mat.length*mat[0].length!=r*c){
            return mat;
        }
        int[][]res=new int[r][c];
        int k=0;
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                res[i][j]=al.get(k);
                k=k+1;
            }
        }
        return res;
    }
}