package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LackOfLogic {
	public static void main(String[] args) throws IOException {
		int t, i, ch;
		char result;
		String ques;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		while(t > 0) {
			ques = br.readLine();
			boolean[] a = new boolean[26];
			for(i = 0 ; i < ques.length() ; i++) {
				ch = (int)ques.charAt(i);
				if(65 <= ch && ch <= 90) {
					a[ch-65] = true;
				} else if(97 <= ch && ch <= 122) {
					a[ch-97] = true;
				}
			}
			result = '~';
			for(i = 0 ; i < 26 ; i++) {
				if(a[i] == false) {
					result = (char)(65+i);
					break;
				}
			}
			System.out.println(result);
			t--;
		}
	}
}
