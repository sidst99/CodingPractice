package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefAndSubarray {
	public static void main(String[] args) throws IOException {
		String[] str;
		int n, i, count, result;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		str = br.readLine().split(" ");
		count = 0;
		result = 0;
		for(i = 0 ; i < n ; i++) {
			if(str[i].equals("0")) {
				if(count > result) {
					result = count;
				}
				count = 0;
			} else {
				count++;
			}
		}
		if(count > result) {
			result = count;
		}
		System.out.println(result);
	}
}
