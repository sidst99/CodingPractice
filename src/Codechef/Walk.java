package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Walk {
	public static void main(String[] args) throws IOException {
		String[] str;
		int t, n, i, w, result;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		while(t > 0) {
			result = 0;
			n = Integer.parseInt(br.readLine());
			str = br.readLine().split(" ");
			for(i = 0 ; i < n ; i++) {
				w = Integer.parseInt(str[i]);
				w += i;
				if(w > result) {
					result = w;
				}
			}
			System.out.println(result);
			t--;
		}
	}
}
