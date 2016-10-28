package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrokenTelephone {
	public static void main(String[] args) throws IOException {
		String[] str;
		int t, n, i, result;
		int[] a;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		while(t > 0) {
			n = Integer.parseInt(br.readLine());
			a = new  int[n];
			str = br.readLine().split(" ");
			for(i = 0 ; i < n ; i++) {
				a[i] = Integer.parseInt(str[i]);
			}
			result = 0;
			if(a[0] != a[1]) {
				result++;
			}
			for(i = 1 ; i < n-1 ; i++) {
				if((a[i-1] != a[i]) || (a[i] != a[i+1])) {
					result++;
				}
			}
			if(a[n-2] != a[n-1]) {
				result++;
			}
			System.out.println(result);
			t--;
		}
	}
}
