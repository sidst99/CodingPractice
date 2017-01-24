package Hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JohnsSubwayCommute {
	public static void main(String[] args) throws IOException {
		int i, len, ans = -1;
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		len = str.length();
		if(str.charAt(len-1) == 'E') {
			ans = len-1;
		} else if(str.charAt(0) == 'E') {
			ans = 0;
		} else {
			for(i = 1 ; i < len-2 ; i++) {
				if(str.charAt(i) == 'E' && str.charAt(i+1) == 'E') {
					ans = i+1;
					break;
				}
			}
			if(i == len-2) {
				for(i = len-2 ; i > 0 ; i++) {
					if(str.charAt(i) == 'E') {
						ans = i;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
