package CodingNinjas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KrillinsLastWish {
	public static void main(String[] args) throws IOException {
		int n, q, i, j, x, y, k, max, c;
		int[] arr, count;
		boolean[] prime;
		String[] str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		q = Integer.parseInt(str[1]);
		str = br.readLine().split(" ");
		arr = new int[n];
		max = Integer.MIN_VALUE;
		for(i = 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(str[i]);
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		prime = new boolean[max+1];
		for(i = 2 ; i <= max ; i++) {
			prime[i] = true;
		}
		for(i = 2 ; i*i <= max ; i++) {
			if(prime[i] == true) {
				for(j = i*2 ; j <= max ; j += i) {
					prime[j] = false;
				}
			}
		}
		count = new int[n];
		for(i = 0 ; i < n ; i++) {
			for(j = 2 ; j <= arr[i] ; j++) {
				if(prime[j] == true && arr[i] % j == 0) {
					count[i]++;
				}
			}
		}
		while(q > 0) {
			str = br.readLine().split(" ");
			x = Integer.parseInt(str[0]);
			y = Integer.parseInt(str[1]);
			k = Integer.parseInt(str[2]);
			c = 0;
			for(i = x-1 ; i < y ; i++) {
				if(count[i] >= k) {
					c++;
				}
			}
			System.out.println(c);
			q--;
		}
	}
}
