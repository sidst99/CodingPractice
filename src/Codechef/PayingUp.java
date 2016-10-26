package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayingUp {
	public static boolean isSubsetSum(int[] arr, int sum) {
		int i, j;
		boolean[][] dp = new boolean[arr.length + 1][sum + 1];
		for(i = 0 ; i <= arr.length ; i++) {
			dp[i][0] = true;
		}
		for(j = 1 ; j <= sum ; j++) {
			dp[0][j] = false;
		}
		for(i = 1 ; i <= arr.length ; i++) {
			for(j = 1 ; j <= sum ; j++) {
				if(dp[i-1][j] == true) {
					dp[i][j] = true;
				} else {
					if(arr[i-1] > j) {
						dp[i][j] = false;
					} else {
						dp[i][j] = dp[i-1][j-arr[i-1]];
					}
				}
			}
		}
		return dp[arr.length][sum];
	}
	public static boolean isSubsetSumRec(int[] arr, int i, int sum) {
		if(i >= arr.length) {
			return false;
		}
		if(sum == arr[i]) {
			return true;
		}
		return isSubsetSumRec(arr, i+1, sum - arr[i]) || isSubsetSumRec(arr, i+1, sum);
	}
	public static void main(String[] args) throws IOException {
		String[] str;
		int t, n, m, i;
		int[] b;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		while(t > 0) {
			str = br.readLine().split(" ");
			n = Integer.parseInt(str[0]);
			m = Integer.parseInt(str[1]);
			b = new int[n];
			for(i = 0 ; i < n ; i++) {
				b[i] = Integer.parseInt(br.readLine());
			}
			if(isSubsetSum(b, m)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			t--;
		}
	}
}
