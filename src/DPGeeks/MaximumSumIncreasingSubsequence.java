package DPGeeks;

import Codechef.IOUtils;
import Codechef.InputReader;
import Codechef.OutputWriter;

public class MaximumSumIncreasingSubsequence {
	public static void main(String[] args) {
		int i, j, n, max;
		int[] arr, dp;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		
		n = in.readInt();
		arr = new int[n];
		arr = IOUtils.readIntArray(in, n);
		dp = new int[n];
		dp[0] = arr[0];
		
		for(i = 1 ; i < n ; i++) {
			dp[i] = arr[i];
			for(j = 0 ; j < i ; j++) {
				if(arr[i] > arr[j]) {
					dp[i] = Math.max(dp[i], dp[j] + arr[i]);
				}
			}
		}
		max = dp[0];
		for(i = 1 ; i < n ; i++) {
			max = Math.max(max, dp[i]);
		}
		out.printLine(max);
		out.flush();
		out.close();
	}
}
