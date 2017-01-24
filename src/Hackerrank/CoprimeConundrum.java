package Hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoprimeConundrum {
	public static void main(String[] args) throws IOException {
		int n, i, j, c;
		long ans;
		boolean[] prime;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		prime = new boolean[n+1];
		for(i = 2 ; i <= n ; i++) {
			prime[i] = true;
		}
		for(i = 2 ; i*i <= n ; i++) {
			if(prime[i] == true) {
				for(j = i*2 ; j <= n ; j += i) {
					prime[j] = false;
				}
			}
		}
		ans = 0;
		for(i = 6 ; i <= n ; i++) {
			c = 0;
			for(j = 2 ; j < i ; j++) {
				if(prime[j] == true && i % j == 0) {
					c++;
				}
			}
			if(c > 1) {
				ans += (int)Math.pow(2, c-1) - 1;
			}
		}
		System.out.println(ans);
	}
}
