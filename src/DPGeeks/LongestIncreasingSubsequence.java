package DPGeeks;

import Codechef.InputReader;
import Codechef.OutputWriter;
import Codechef.IOUtils;

public class LongestIncreasingSubsequence {
	public static void main(String[] args) {
		int i, j, n, max;
		int[] arr, dp;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		
		n = in.readInt();
		arr = IOUtils.readIntArray(in, n);
		dp = new int[n];
		dp[0] = 1;
		
		for(i = 1 ; i < n ; i++) {
			max = Integer.MIN_VALUE;
			for(j = 0 ; j < i ; j++) {
				if(arr[i] > arr[j]) {
					if(dp[j] > max) {
						max = dp[j];
					}
				}
			}
			dp[i] = 1 + max;
		}
		out.printLine(dp[n-1]);
		out.flush();
		out.close();
	}
}
