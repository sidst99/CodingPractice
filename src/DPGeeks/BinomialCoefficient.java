package DPGeeks;

import Codechef.InputReader;
import Codechef.OutputWriter;

public class BinomialCoefficient {
	public static void main(String[] args) {
		int i, j, n, k;
		int[] dp;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		
		n = in.readInt();
		k = in.readInt();
		dp = new int[k+1];
		
		dp[0] = 1;
		for(i = 1 ; i <= n ; i++) {
			for(j = Math.min(i, k) ; j > 0 ; j--) {
				dp[j] = dp[j] + dp[j-1];
			}
		}
		out.printLine(dp[k]);
		out.flush();
		out.close();
	}
}
