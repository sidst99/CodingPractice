package Hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExpectedTreeLeaves {
    public static void main(String[] args) throws IOException {
    	int i, n;
    	long result;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        result = n;
        for(i = 3 ; i <= n ; i++) {
        	result = (result * i) % 1000000007;
        }
        System.out.println(result);
    }
}