package Hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AriasLoops {
	public static int makePower(int n, int p, int mod) {
		int x;
		long y;
		if(p == 0) {
			return 1;
		}
		if(p == 1) {
			return n;
		}
		if(p % 2 == 0) {
			x = makePower(n, p/2, mod);
			y = (long)x*x;
			return (int)(y%mod);
		} else {
			x = makePower(n, p-1, mod);
			y = (long)x*n;
			return (int)(y%mod);
		}
	}
	public static void main(String[] args) throws IOException {
		final int mod = 1000000007;
		int n, k, i, b, d;
		long a, ans, c;
		String[] str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		k = Integer.parseInt(str[1]);
		a = (long)(k-1)*(k-2)/2;
		if((long)n - a <= 0) {
			ans = 0;
		} else {
			b = n - (int)a;
			if(b < k) {
				ans = 0;
			} else {
				if(k > b-k) {
					k = b - k;
				}
				ans = 1;
				for(i = 0 ; i < k ; i++) {
					ans = (ans*(b - i)) % mod;
				}
				c = 1;
				for(i = 0 ; i < k ; i++) {
					c = (c*(i+1)) % mod;
				}
				d = makePower((int)c, mod-2, mod);
				ans = (ans * d) % mod;
			}
		}
		System.out.println(ans);
	}
}
