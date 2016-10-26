package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RowAndColumnOperations {
	public static void main(String[] args) throws IOException {
		String[] str;
		int n, q, maxR, maxC, i;
		int[] row, col;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		q = Integer.parseInt(str[1]);
		row = new int[n];
		col = new int[n];
		while(q > 0) {
			str = br.readLine().split(" ");
			if(str[0].charAt(0) == 'R') {
				row[Integer.parseInt(str[1]) - 1] += Integer.parseInt(str[2]);
			} else {
				col[Integer.parseInt(str[1]) - 1] += Integer.parseInt(str[2]);
			}
			q--;
		}
		maxR = 0;
		maxC = 0;
		for(i = 0 ; i < n ; i++) {
			if(row[i] > maxR) {
				maxR = row[i];
			}
			if(col[i] > maxC) {
				maxC = col[i];
			}
		}
		System.out.println(maxR + maxC);
	}
}
