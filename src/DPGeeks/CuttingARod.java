package DPGeeks;

import Codechef.IOUtils;
import Codechef.InputReader;
import Codechef.OutputWriter;

public class CuttingARod {
	public static void main(String[] args) {
		int i, j, n;
		int[] prices;
		int[] dp;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		
		n = in.readInt();
		prices = new int[n];
		prices = IOUtils.readIntArray(in, n);
		dp = new int[n+1];
		dp[0] = 0;
		
		for(i = 1 ; i <= n ; i++) {
			dp[i] = Integer.MIN_VALUE;
			for(j = 1 ; j <= i ; j++) {
				dp[i] = Math.max(dp[i], prices[j-1] + dp[i-j]);
			}
		}
		out.printLine(dp[n]);
		out.flush();
		out.close();
	}
}
