package Hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GamingArray {
	public static void main(String[] args) throws IOException {
		int g, n, i, max_count, max, a;
		String[] str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		g = Integer.parseInt(br.readLine());
		while(g > 0) {
			n = Integer.parseInt(br.readLine());
			max = Integer.MIN_VALUE;
			max_count = 0;
			str = br.readLine().split(" ");
			for(i = 0 ; i < n ; i++) {
				a = Integer.parseInt(str[i]);
				if(a > max) {
					max = a;
					max_count++;
				}
			}
			if(max_count % 2 == 0) {
				System.out.println("ANDY");
			} else {
				System.out.println("BOB");
			}
			g--;
		}
	}
}
