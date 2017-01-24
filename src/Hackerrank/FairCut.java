package Hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FairCut {
	public static void main(String[] args) throws IOException {
		int n, k, i, x;
		long ans, l, h, c1, c2, l1, l2, h1, h2;
		int[] arr;
		String[] str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		k = Integer.parseInt(str[1]);
		arr = new int[n];
		str = br.readLine().split(" ");
		for(i = 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(arr);
		x = (n - k) / 2;
		l = 0;
		for(i = 0 ; i < x ; i++) {
			l += arr[i];
		}
		h = 0;
		for(i = n-x ; i < n ; i++) {
			h += arr[i];
		}
		if((n-k)%2 == 0) {
			ans = 0;
			for(i = x ; i < n-x ; i++) {
				ans += (long)x*arr[i] - l;
				ans += h - (long)x*arr[i];
			}
		} else {
			c1 = 0;
			l1 = l;
			h1 = h + arr[n-x-1];
			for(i = x ; i < n-x-1 ; i++) {
				System.out.println(arr[i]);
				c1 += (long)x*arr[i] - l1;
				c1 += h1 - (long)(x+1)*arr[i];
			}
			c2 = 0;
			l2 = l + arr[x];
			h2 = h;
			for(i = x+1 ; i < n-x ; i++) {
				System.out.println(arr[i]);
				c2 += (long)(x+1)*arr[i] - l2;
				c2 += h2 - (long)x*arr[i];
			}
			ans = Math.min(c1, c2);
		}
		System.out.println(ans);
	}
}
