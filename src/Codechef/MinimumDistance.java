package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumDistance {
	public static void main(String[] args) throws IOException {
		String[] str;
		int t, ds, dt, d;
		double min;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		while(t > 0) {
			str = br.readLine().split(" ");
			ds = Integer.parseInt(str[0]);
			dt = Integer.parseInt(str[1]);
			d = Integer.parseInt(str[2]);
			if((ds+dt) <= d) {
				min = d - ds - dt;
			} else {
				if(d < (Math.max(ds,dt) - Math.min(ds, dt))) {
					min = Math.max(ds, dt) - Math.min(ds, dt) - d;
				} else {
					min = 0;
				}
			}
			System.out.println(min);
			t--;
		}
	}
}
