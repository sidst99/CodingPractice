package DPGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumLengthChainOfPairs {
	public static void main(String args[]) throws IOException {
		int n, i, j, max;
		int[][] pair;
		int[] dp;
		String[] str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		pair = new int[n][2];
		dp = new int[n];
		for(i = 0 ; i < n ; i++) {
			str = br.readLine().split(" ");
			pair[i][0] = Integer.parseInt(str[0]);
			pair[i][1] = Integer.parseInt(str[1]);
		}
		
		// assume that the pair array is sorted according to the first(smaller) element
		
		dp[0] = 1;
		for(i = 1 ; i < n ; i++) {
			dp[i] = 1;
			for(j = 0 ; j < i ; j++) {
				if(pair[j][1] < pair[i][0] && (1 + dp[j] > dp[i])) {
					dp[i] = 1 + dp[j];
				}
			}
		}
		max = Integer.MIN_VALUE;
		for(i = 0 ; i < n ; i++) {
			if(dp[i] > max) {
				max = dp[i];
			}
		}
		System.out.println(max);
	}
}
