package DPGeeks;

import Codechef.IOUtils;
import Codechef.InputReader;
import Codechef.OutputWriter;

public class PartitionProblem {
	public static void main(String[] args) {
		int i, j, n, sum;
		int[] arr;
		boolean[][] dp;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		
		n = in.readInt();
		arr = new int[n];
		arr = IOUtils.readIntArray(in, n);
		
		sum = 0;
		for(i = 0 ; i < n ; i++) {
			sum += arr[i];
		}
		if(sum % 2 == 1) {
			out.printLine("false");
			out.flush();
			out.close();
			System.exit(0);
		}
		
		dp = new boolean[n + 1][sum/2 + 1];
		for(i = 0 ; i <= n ; i++) {
			dp[i][0] = true;
		}
		for(j = 1 ; j <= sum/2 ; j++) {
			dp[0][j] = false;
		}
		for(i = 1 ; i <= n ; i++) {
			for(j = 1 ; j <= sum/2 ; j++) {
				if(arr[i-1] > j) {
					dp[i][j] = false;
				} else {
					dp[i][j] = dp[i-1][j - arr[i-1]] || dp[i-1][j];
				}
			}
		}
		out.printLine(dp[n][sum/2]);
		out.flush();
		out.close();
	}
}
