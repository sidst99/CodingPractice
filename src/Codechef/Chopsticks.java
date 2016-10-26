package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Chopsticks {
	public static void main(String[] args) throws IOException {
		String[] str;
		int n, d, i, result;
		int[] l;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		d = Integer.parseInt(str[1]);
		l = new int[n];
		for(i = 0 ; i < n ; i++) {
			l[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(l);
		i = 0;
		result = 0;
		while(i < n-1) {
			if(l[i+1] - l[i] <= d) {
				result++;
				i += 2;
			} else {
				i++;
			}
		}
		System.out.println(result);
	}
}
