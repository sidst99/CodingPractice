package DPGeeks;

import Codechef.InputReader;
import Codechef.OutputWriter;

public class EggDroppingPuzzle {
	public static void main(String[] args) {
		int i, j, n, k, x, temp;
		int[][] dp;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		
		n = in.readInt();
		k = in.readInt();
		dp = new int[n+1][k+1];
		
		for(i = 1 ; i <= n ; i++) {
			dp[i][0] = 0;
			dp[i][1] = 1;
		}
		for(j = 1 ; j <= k ; j++) {
			dp[1][j] = j;
		}
		for(i = 2 ; i <= n ; i++) {
			for(j = 2 ; j <= k ; j++) {
				dp[i][j] = Integer.MAX_VALUE;
				for(x = 1 ; x <= j ; x++) {
					temp = 1 + Math.max(dp[i-1][x-1], dp[i][j-x]);
					if(temp < dp[i][j]) {
						dp[i][j] = temp;
					}
				}
			}
		}
		out.printLine(dp[n][k]);
		out.flush();
		out.close();
	}
}