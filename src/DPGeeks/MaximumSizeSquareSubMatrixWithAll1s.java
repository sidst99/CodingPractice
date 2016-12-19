package DPGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumSizeSquareSubMatrixWithAll1s {
	public static void main(String[] args) throws IOException {
		int m, n, i, j, max, max_i, max_j;
		int[][] mat, dp;
		String[] str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		m = Integer.parseInt(br.readLine());
		n = Integer.parseInt(br.readLine());
		mat = new int[m][n];
		dp = new int[m][n];
		for(i = 0 ; i < m ; i++) {
			str = br.readLine().split(" ");
			for(j = 0 ; j < n ; j++) {
				mat[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		for(i = 0 ; i < m ; i++) {
			dp[i][0] = mat[i][0];
		}
		for(j = 0 ; j < n ; j++) {
			dp[0][j] = mat[0][j];
		}
		for(i = 1 ; i < m ; i++) {
			for(j = 1 ; j < n ; j++) {
				dp[i][j] = Integer.MAX_VALUE;
				if(mat[i][j] == 1) {
					dp[i][j] = Math.min(dp[i][j], dp[i-1][j-1]);
					dp[i][j] = Math.min(dp[i][j], dp[i-1][j]);
					dp[i][j] = Math.min(dp[i][j], dp[i][j-1]);
					dp[i][j] += 1;
				} else {
					dp[i][j] = 0;
				}
			}
		}
		max = Integer.MIN_VALUE;
		max_i = -1;
		max_j = -1;
		for(i = 0 ; i < m ; i++) {
			for(j = 0 ; j < n ; j++) {
				if(dp[i][j] > max) {
					max = dp[i][j];
					max_i = i;
					max_j = j;
				}
			}
		}
		for(i = max_i ; i > max_i - max ; i--) {
			for(j = max_j ; j > max_j - max ; j--) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
