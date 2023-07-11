package dsa;

public class UniquePathObstacles {
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int [m][n];
        for(int i = m-1; i>=0 ; i--){
            for(int j = n-1 ; j>=0 ; j--){
                if(i == m-1 && j == n-1){
                    if(obstacleGrid[i][j] == 1) dp[i][j] = 0;
                    else dp[i][j] = 1;
                }
                else if(i == m-1 || j== n-1){
                    if(obstacleGrid[i][j] == 1) dp[i][j] = 0;
                    else if(i == m-1) dp[i][j] = dp[i][j+1];
                    else if(j == n-1) dp[i][j] = dp[i+1][j];
                }
                else{
                    if (obstacleGrid[i][j] == 1) dp[i][j] = 0;
                    else dp[i][j] = dp[i][j+1] + dp[i+1][j];
                }
            }
        }
        return dp[0][0];
    }
	public static void main (String args[]) {
		int [][]obstacleGrid = { { 0, 0, 0 },
                				{ 0, 1, 0 },
                				{ 0, 0, 0 } };
		System.out.println(uniquePathsWithObstacles(obstacleGrid));
	}

}
