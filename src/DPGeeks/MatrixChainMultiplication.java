package DPGeeks;

import Codechef.IOUtils;
import Codechef.InputReader;
import Codechef.OutputWriter;

public class MatrixChainMultiplication {
	public static void main(String[] args) {
		int i, j, k, l, n, temp;
		int[] p;
		int[][] dp;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		
		n = in.readInt();
		p = new int[n+1];
		p = IOUtils.readIntArray(in, n+1);
		dp = new int[n][n];
		
		for(i = 0 ; i < n ; i++) {
			dp[i][i] = 0;
		}
		for(i = 2 ; i <= n ; i++) {
			for(j = 0 ; j < n-i+1 ; j++) {
				k = j + i - 1;
				dp[j][k] = Integer.MAX_VALUE;
				for(l = j ; l < k ; l++) {
					temp = dp[j][l] + dp[l+1][k] + p[j]*p[l+1]*p[k+1];
					if(temp < dp[j][k]) {
						dp[j][k] = temp;
					}
				}
			}
		}
		out.printLine(dp[0][n-1]);
		out.flush();
		out.close();
	}
}
