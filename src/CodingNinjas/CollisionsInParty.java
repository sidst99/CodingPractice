package CodingNinjas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CollisionsInParty {
	public static void main(String[] args) throws IOException {
		int n, m, i, j, ans;
		String s;
		int[] count;
		String[] str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		count = new int[m];
		Arrays.fill(count, 0);
		for(i = 0 ; i < n ; i++) {
			s = br.readLine();
			for(j = 0 ; j < m ; j++) {
				if(s.charAt(j) == '1') {
					count[j]++;
				}
			}
		}
		ans = 0;
		for(i = 0 ; i < m ; i++) {
			if(count[i] > 1) {
				ans += count[i]*(count[i]-1)/2;
			} 
		}
		System.out.println(ans);
	}
}
