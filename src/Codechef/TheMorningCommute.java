package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheMorningCommute {
	public static void main(String[] args) throws IOException {
		String[] str;
		int t, n, x, l, f, time, temp;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		while(t > 0) {
			n = Integer.parseInt(br.readLine());
			time = 0;
			while(n > 0) {
				str = br.readLine().split(" ");
				x = Integer.parseInt(str[0]);
				l = Integer.parseInt(str[1]);
				f = Integer.parseInt(str[2]);
				if(time > x) {
					temp = (time - x) % f;
					if(temp != 0) {
						time += f - temp;
					}
				} else {
					time = x;
				}
				time += l;
				n--;
			}
			System.out.println(time);
			t--;
		}
	}
}
