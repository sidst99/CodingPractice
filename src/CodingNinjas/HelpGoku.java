package CodingNinjas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelpGoku {
	public static void main(String[] args) throws IOException {
		final int mod = 1000000007;
		int n, i, j, l, x;
		long s, S;
		int[] arr, t;
		String[] str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		str = br.readLine().split(" ");
		s = 0;
		for(i = 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(str[i]);
			s += arr[i];
		}
		l = Math.min(mod, (int)s+1);
		t = new int[l];
		t[0] = 0;
		t[1] = 1;
		t[2] = 2;
		for(i = 3 ; i < l ; i++) {
			t[i] = (int)(((long)t[i-1]*2 + (long)t[i-3]*3) % mod);
		}
		S = 0;
		for(i = 0 ; i < n ; i++) {
			x = 0;
			for(j = i ; j < n ; j++) {
				x = (x + arr[j]) % mod;
				S = (S + t[x]) % mod;
			}
		}
		System.out.println(S);
	}
}
