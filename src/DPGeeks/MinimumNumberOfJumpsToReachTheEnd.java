package DPGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumNumberOfJumpsToReachTheEnd {
	public static void main(String[] args) throws IOException {
		int n, i, j, min;
		int[] arr, dp;
		String[] str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		dp = new int[n];
		str = br.readLine().split(" ");
		for(i = 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		dp[n-1] = 0;
		for(i = n-2 ; i >= 0 ; i--) {
			if(arr[i] == 0) {
				dp[i] = Integer.MAX_VALUE;
			} else if(arr[i] >= n-i-1) {
				dp[i] = 1;
			} else {
				min = Integer.MAX_VALUE;
				for(j = i+1 ; j < n  && j <= arr[i]+i; j++) {
					if(min > dp[j]) {
						min = dp[j];
					}
				}
				if(min != Integer.MAX_VALUE) {
					dp[i] = 1 + min;
				} else {
					dp[i] = min;
				}
			}
		}
		System.out.println(dp[0]);
	}
}
