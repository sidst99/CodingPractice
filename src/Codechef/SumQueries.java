package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumQueries {
	public static void main(String[] args) throws IOException {
		String[] str;
		int m;
		long n, q, result;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine().split(" ");
		n = Long.parseLong(str[0]);
		m = Integer.parseInt(str[1]);
		while(m > 0) {
			q = Long.parseLong(br.readLine());
			if(q <= n+1) {
				result = 0;
			} else if(q <= 2*n+1) {
				result = q - n - 1;
			} else if(q <= 3*n){
				result = 3*n - q + 1;
			} else {
				result = 0;
			}
			System.out.println(result);
			m--;
		}
	}
}
