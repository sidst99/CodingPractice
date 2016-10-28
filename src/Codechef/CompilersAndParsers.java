package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompilersAndParsers {
	public static void main(String[] args) throws IOException {
		String input;
		int t, i, result, c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		while(t > 0) {
			input = br.readLine();
			result = 0;
			c = 0;
			for(i = 0 ; i < input.length() ; i++) {
				if(input.charAt(i) == '<') {
					c++;
				} else {
					c--;
					if(c < 0) {
						break;
					} else if(c == 0) {
						result = Math.max(result, i+1);
					}
				}
			}
			System.out.println(result);
			t--;
		}
	}
}
