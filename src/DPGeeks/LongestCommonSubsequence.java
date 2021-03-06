package DPGeeks;

import Codechef.InputReader;
import Codechef.OutputWriter;

public class LongestCommonSubsequence {
	public static void main(String[] args) {
		int i, j, len1, len2;
		String str1, str2;
		int[][] dp;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		
		str1 = in.readString();
		str2 = in.readString();
		len1 = str1.length();
		len2 = str2.length();
		dp = new int[len1+1][len2+1];
		
		for(i = 0 ; i <= len1 ; i++) {
			dp[i][0] = 0;
		}
		for(j = 0 ; j <= len2 ; j++) {
			dp[0][j] = 0;
		}
		for(i = 1 ; i <= len1 ; i++) {
			for(j = 1 ; j <= len2 ; j++) {
				if(str1.charAt(i-1) == str2.charAt(j-1)) {
					dp[i][j] = 1 + dp[i-1][j-1];
				} else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		out.printLine(dp[len1][len2]);
		out.flush();
		out.close();
	}
}
