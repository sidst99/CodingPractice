package DPGeeks;

import Codechef.IOUtils;
import Codechef.InputReader;
import Codechef.OutputWriter;

public class CoinChange {
	public static void main(String[] args) {
		int i, j, n, m, x, y;
		int[] s;
		int[][] dp;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		
		n = in.readInt();
		m = in.readInt();
		s = new int[m];
		s = IOUtils.readIntArray(in, m);
		dp = new int[n+1][m];
		
		for(i = 0 ; i < m ; i++) {
			dp[0][i] = 1;
		}
		for(i = 1 ; i <= n ; i++) {
			for(j = 0 ; j < m ; j++) {
				x = (i - s[j]) >= 0 ? dp[i-s[j]][j] : 0;
				y = (j >= 1) ? dp[i][j-1] : 0;
				dp[i][j] = x + y;
			}
		}
		out.printLine(dp[n][m-1]);
		out.flush();
		out.close();
	}
}
