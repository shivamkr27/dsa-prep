// class Solution {
//     public int uniquePaths(int m, int n) {
//         int totalMoves = m + n - 2;
//         int downMoves = m - 1;
        
//         double result = 1;
//         for (int i = 1; i <= downMoves; i++) {
//             result = result * (totalMoves - downMoves + i) / i;
//         }
        
//         return (int) Math.round(result);
//     }
// }
class Solution{
    public int uniquePaths(int m,int n){
        int[][] grid = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0){
                    grid[i][j]=1;
                }
                else{
                    grid[i][j]=grid[i-1][j]+grid[i][j-1];
                }
            }
            
        }
        return grid[m-1][n-1];
    }
}