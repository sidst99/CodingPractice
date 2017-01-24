package CodingNinjas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertDecimalToInt {
	public static int gcd(int a, int b) {
		if(a%b == 0) {
			return b;
		}
		return gcd(b, a%b);
	}
	
	public static void main(String[] args) throws IOException {
		String s;
		int i, num, den, x, l, g;
		boolean flag;
		char ch;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = br.readLine();
		num = 0;
		flag = false;
		l = 0;
		for(i = 0 ; i < s.length() ; i++) {
			if(flag == true) {
				l++;
			}
			ch = s.charAt(i);
			if(ch == '.') {
				flag = true;
				continue;
			}
			x = (int)ch - 48;
			num = num*10 + x;
		}
		den = (int)Math.pow(10, l);
		g = gcd(num, den);
		System.out.println(den / g);
	}
}
