package CodingNinjas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CanTheyFuse {
	public static void main(String[] args) throws IOException {
		int k, i, c;
		String t, g;
		int[] ft, fg;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		k = Integer.parseInt(br.readLine());
		t = br.readLine();
		g = br.readLine();
		ft = new int[26];
		fg = new int[26];
		for(i = 0 ; i < t.length() ; i++) {
			ft[(int)t.charAt(i) - 97]++;
		}
		for(i = 0 ; i < g.length() ; i++) {
			fg[(int)g.charAt(i) - 97]++;
		}
		c = 0;
		for(i = 0 ; i < 26 ; i++) {
			c += Math.min(ft[i], fg[i]);
		}
		if(c >= k) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
