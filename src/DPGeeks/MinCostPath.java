package DPGeeks;

import Codechef.IOUtils;
import Codechef.InputReader;
import Codechef.OutputWriter;

public class MinCostPath {
	public static void main(String[] args) {
		int i, j, m, n, min;
		int[][] cost, dp;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		
		m = in.readInt();
		n = in.readInt();
		cost = new int[m][n];
		dp = new int[m][n];
		
		for(i = 0 ; i < m ; i++) {
			cost[i] = IOUtils.readIntArray(in, n);
		}
		dp[0][0] = cost[0][0];
		for(i = 1 ; i < m ; i++) {
			dp[i][0] = dp[i-1][0] + cost[i][0];
		}
		for(j = 1 ; j < n ; j++) {
			dp[0][j] = dp[0][j-1] + cost[0][j];
		}
		for(i = 1 ; i < m ; i++) {
			for(j = 1 ; j < n ; j++) {
				min = Math.min(dp[i-1][j], dp[i][j-1]);
				min = Math.min(min, dp[i-1][j-1]);
				dp[i][j] = min + cost[i][j];
			}
		}
		out.printLine(dp[m-1][n-1]);
		out.flush();
		out.close();
	}
}
