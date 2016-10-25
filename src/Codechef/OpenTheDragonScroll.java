package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OpenTheDragonScroll {
	public static void main(String[] args) throws IOException {
		String[] str;
		int t, n, a, b, onesA, onesB, onesRes, result;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		while(t > 0) {
			str = br.readLine().split(" ");
			n = Integer.parseInt(str[0]);
			a = Integer.parseInt(str[1]);
			b = Integer.parseInt(str[2]);
			onesA = 0;
			while(a > 0) {
				if(a % 2 == 1) {
					onesA++;
				}
				a = a / 2;
			}
			onesB = 0;
			while(b > 0) {
				if(b % 2 == 1) {
					onesB++;
				}
				b = b / 2;
			}
			onesRes = Math.min(onesA, n - onesB) + Math.min(onesB, n - onesA);
			result = (int)Math.pow(2, n) - (int)Math.pow(2, n - onesRes);
			System.out.println(result);
			t--;
		}
	}
}
