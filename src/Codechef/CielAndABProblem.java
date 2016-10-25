package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CielAndABProblem {
	public static void main(String[] args) throws IOException {
		String[] str;
		int a, b, result;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine().split(" ");
		a = Integer.parseInt(str[0]);
		b = Integer.parseInt(str[1]);
		result = a - b;
		if((result % 10) != 0) {
			result -= 1;
		} else {
			result += 1;
		}
		if(result == 0) {
			result = 2;
		}
		System.out.println(result);
	}
}
