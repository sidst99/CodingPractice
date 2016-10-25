package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheBallAndCups {
	public static void main(String[] args) throws IOException {
		String[] str;
		int t, n, c, q, l, r, temp;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		while(t > 0) {
			str = br.readLine().split(" ");
			n = Integer.parseInt(str[0]);
			c = Integer.parseInt(str[1]);
			q = Integer.parseInt(str[2]);
			while(q > 0) {
				str = br.readLine().split(" ");
				l = Integer.parseInt(str[0]);
				r = Integer.parseInt(str[1]);
				if(l <= c && c <= r) {
					temp = c - l;
					c = r - temp;
				}
				q--;
			}
			System.out.println(c);
			t--;
		}
	}
}
