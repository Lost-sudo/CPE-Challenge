package Sample1.UniquePathsWithObstacle;

public class Main {
    public static int uniquePathsWithObstacle(int[][] grid) {
        int rows = grid.length;
        int cols =  grid[0].length;

        if (grid[0][0] == 1 || grid[rows-1][cols-1] == 1) return 0;

        int[][] dp = new int[rows][cols];

        dp[0][0] = 1;

        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                if (grid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    if (i > 0) dp[i][j] += dp[i-1][j];
                    if (j > 0) dp[i][j] += dp[i][j-1];
                }
            }
        }

        return dp[rows-1][cols-1];
    }

    public static void main(String[] args) {
        int[][] grid1 = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        int[][] grid2 = {
                {0,1},
                {0,0},
        };

        System.out.println(uniquePathsWithObstacle(grid1));
        System.out.println(uniquePathsWithObstacle(grid2));
    }
}
