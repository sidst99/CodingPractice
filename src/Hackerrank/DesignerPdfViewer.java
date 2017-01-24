package Hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DesignerPdfViewer {
	public static void main(String[] args) throws IOException {
		int i, ans, max, l;
		int[] h = new int[26];
		String s;
		String[] str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine().split(" ");
		for(i = 0 ; i < 26 ; i++) {
			h[i] = Integer.parseInt(str[i]);
		}
		s = br.readLine();
		l = s.length();
		max = Integer.MIN_VALUE;
		for(i = 0 ; i < l ; i++) {
			if(h[(int)s.charAt(i)-97] > max) {
				max = h[(int)s.charAt(i)-97];
			}
		}
		ans = max*l;
		System.out.println(ans);
	}
}
