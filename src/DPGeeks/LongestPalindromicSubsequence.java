package DPGeeks;

import Codechef.InputReader;
import Codechef.OutputWriter;

public class LongestPalindromicSubsequence {
	public static void main(String[] args) {
		int i, j, k, n;
		String str;
		int[][] dp;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		
		str = in.readString();
		n = str.length();
		dp = new int[n][n];
		
		for(i = 0 ; i < n ; i++) {
			dp[i][i] = 1;
		}
		for(i = 2 ; i <= n ; i++) {
			for(j = 0 ; j < n-i+1 ; j++) {
				k = j+i-1;
				if(str.charAt(j) == str.charAt(k) && i == 2) {
					dp[j][k] = 2;
				} else if(str.charAt(j) == str.charAt(k)) {
					dp[j][k] = 2 + dp[j+1][k-1];
				} else {
					dp[j][k] = Math.max(dp[j+1][k], dp[j][k-1]);
				}
			}
		}
		out.printLine(dp[0][n-1]);
		out.flush();
		out.close();
	}
}
