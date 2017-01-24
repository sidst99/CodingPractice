package CodingNinjas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VegetaAndWhis {
	public static void main(String[] args) throws IOException {
		int n, p, q, i, j, min;
		int[] dp;
		String[] str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		p = Integer.parseInt(str[1]);
		q = Integer.parseInt(str[2]);
		dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		for(i = 2 ; i <= n ; i++) {
			min = dp[i-1];
			if(p != 1) {
				j = p;
				while(true) {
					if(j <= i) {
						if(dp[i-j] < min) {
							min = dp[i-j];
						}
						j = j*p;
					} else {
						break;
					}
				}
			}
			if(q != 1) {
				j = q;
				while(true) {
					if(j <= i) {
						if(dp[i-j] < min) {
							min = dp[i-j];
						}
						j = j*q;
					} else {
						break;
					}
				}
			}
			dp[i] = 1 + min;
		}
		System.out.println(dp[n]);
	}
}
