package DPGeeks;

import Codechef.IOUtils;
import Codechef.InputReader;
import Codechef.OutputWriter;

public class KnapsackProblem {
	public static void main(String[] args) {
		int i, j, n, w;
		int[] val, wt;
		int[][] dp;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		
		n = in.readInt();
		val = IOUtils.readIntArray(in, n);
		wt = IOUtils.readIntArray(in, n);
		w = in.readInt();
		dp = new int[n+1][w+1];
		
		for(i = 0 ; i <= n ; i++) {
			dp[i][0] = 0;
		}
		for(j = 0 ; j <= w ; j++) {
			dp[0][j] = 0;
		}
		for(i = 1 ; i <= n ; i++) {
			for(j = 1 ; j <= w ; j++) {
				if(wt[i-1] <= j) {
					dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
				} else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		out.printLine(dp[n][w]);
		out.flush();
		out.close();
	}
}
