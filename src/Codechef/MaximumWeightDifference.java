package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaximumWeightDifference {
	public static void main(String[] args) throws IOException {
		String[] str;
		int t, n, k, i, sum, suml, sumh, result;
		int[] w;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		while(t > 0) {
			str = br.readLine().split(" ");
			n = Integer.parseInt(str[0]);
			k = Integer.parseInt(str[1]);
			w = new int[n];
			str = br.readLine().split(" ");
			sum = 0;
			for(i = 0 ; i < n ; i++) {
				w[i] = Integer.parseInt(str[i]);
				sum += w[i];
			}
			Arrays.sort(w);
			suml = 0;
			sumh = 0;
			for(i = 0 ; i < k ; i++) {
				suml += w[i];
				sumh += w[n-i-1];
			}
			result = Math.max(Math.abs(2*suml - sum), Math.abs(2*sumh - sum));
			System.out.println(result);
			t--;
		}
	}
}
