package CodingNinjas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckReverseString {
	public static void main(String[] args) throws IOException {
		String s1, s2;
		int len, i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s1 = br.readLine();
		s2 = br.readLine();
		if(s1.length() != s2.length()) {
			System.out.println("false");
		} else {
			len = s1.length();
			for(i = 0 ; i < len ; i++) {
				if(s1.charAt(i) != s2.charAt(len-i-1)) {
					System.out.println("false");
					System.exit(0);
				}
			}
			System.out.println("true");
		}
	}
}
