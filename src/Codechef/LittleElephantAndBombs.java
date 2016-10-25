package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LittleElephantAndBombs {
	public static void main(String[] args) throws IOException {
		int t, n, d, i;
		String b;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		while(t > 0) {
			n = Integer.parseInt(br.readLine());
			b = br.readLine();
			d = 0;
			if(n == 1) {
				if(b.charAt(0) == '1') {
					System.out.println(0);
				} else {
					System.out.println(1);
				}
			} else {
				if(b.charAt(0) == '1' || b.charAt(1) == '1') {
					d++;
				}
				for(i = 1 ; i < n-1 ; i++) {
					if(b.charAt(i-1) == '1' || b.charAt(i) == '1' || b.charAt(i+1) == '1') {
						d++;
					}
				}
				if(b.charAt(n-2) == '1' || b.charAt(n-1) == '1') {
					d++;
				}
				System.out.println(n-d);
			}
			t--;
		}
	}
}
