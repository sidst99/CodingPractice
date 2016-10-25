package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuyingSweets {
	public static void main(String[] args) throws IOException {
		String[] str;
		int t, n, x, i, min, sum, result;
		int[] a;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		while(t > 0) {
			str = br.readLine().split(" ");
			n = Integer.parseInt(str[0]);
			x = Integer.parseInt(str[1]);
			a = new int[n];
			str = br.readLine().split(" ");
			min = 100;
			sum = 0;
			for(i = 0 ; i < n ; i++) {
				a[i] = Integer.parseInt(str[i]);
				sum += a[i];
				if(a[i] < min) {
					min = a[i];
				}
			}
			result = sum / x;
			if(sum % x >= min) {
				result = -1;
			}
			System.out.println(result);
			t--;
		}
	}
}
