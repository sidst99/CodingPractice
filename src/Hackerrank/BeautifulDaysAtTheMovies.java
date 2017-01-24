package Hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeautifulDaysAtTheMovies {
	public static int reverse(int x) {
		int y, r;
		y = 0;
		while(x != 0) {
			r = x % 10;
			x = x / 10;
			y = y * 10 + r;
		}
		return y;
	}
	public static void main(String[] args) throws IOException {
		int i, j, k, a, ans, b, diff;
		String[] str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine().split(" ");
		i = Integer.parseInt(str[0]);
		j = Integer.parseInt(str[1]);
		k = Integer.parseInt(str[2]);
		ans = 0;
		for(a = i ; a <= j ; a++) {
			b = reverse(a);
			diff = Math.abs(a-b);
			if(diff % k == 0) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
