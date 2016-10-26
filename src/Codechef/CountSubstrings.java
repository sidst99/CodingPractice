package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountSubstrings {
	public static void main(String[] args) throws IOException {
		int t, n, i, count;
		long result;
		String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		while(t > 0) {
			n = Integer.parseInt(br.readLine());
			s = br.readLine();
			count = 0;
			result = 0;
			for(i = 0 ; i < n ; i++) {
				if(s.charAt(i) == '1') {
					count++;
					result += count;
				}
			}
			System.out.println(result);
			t--;
		}
	}
}
