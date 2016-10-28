package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LittleChefAndNumbers {
	public static void main(String[] args) throws IOException {
		String[] str;
		int t, n, i, a, c, twos;
		long result;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine().trim());
		while(t > 0) {
			c = 0;
			twos = 0;
			n = Integer.parseInt(br.readLine().trim());
			str = br.readLine().trim().split(" ");
			for(i = 0 ; i < n ; i++) {
				a = Integer.parseInt(str[i]);
				if(a > 2) {
					c++;
				} else if(a == 2) {
					twos++;
				}
			}
			result = (long)c*(c-1)/2 + (long)twos*c;
			System.out.println(result);
			t--;
		}
	}
}
