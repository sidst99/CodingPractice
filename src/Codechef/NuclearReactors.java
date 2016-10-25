package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NuclearReactors {
	public static void main(String[] args) throws IOException {
		String[] str;
		int a, n ,k, c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine().split(" ");
		a = Integer.parseInt(str[0]);
		n = Integer.parseInt(str[1]);
		k = Integer.parseInt(str[2]);
		c = 0;
		while(a > 0 && c < k) {
			System.out.print(a%(n+1)+ " ");
			a = a/(n+1);
			c++;
		}
		while(c < k) {
			System.out.print(0+" ");
			c++;
		}
	}
}
