package Hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CatsAndAMouse {
	public static void main(String[] args) throws IOException {
		int t, x, y, z, d1, d2;
		String[] str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		while(t > 0) {
			str = br.readLine().split(" ");
			x = Integer.parseInt(str[0]);
			y = Integer.parseInt(str[1]);
			z = Integer.parseInt(str[2]);
			d1 = Math.abs(x - z);
			d2 = Math.abs(y - z);
			if(d1 < d2) {
				System.out.println("Cat A");
			} else if(d2 < d1) {
				System.out.println("Cat B");
			} else {
				System.out.println("Mouse C");
			}
			t--;
		}
	}
}
