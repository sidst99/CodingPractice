package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGameRevisited {
	public static void main(String[] args) throws IOException {
		int t, n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		while(t > 0) {
			n = Integer.parseInt(br.readLine());
			if(n % 4 == 1) {
				System.out.println("ALICE");
			} else {
				System.out.println("BOB");
			}
			t--;
		}
	}
}
