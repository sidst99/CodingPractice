package DPGeeks;

import Codechef.InputReader;
import Codechef.OutputWriter;

public class PalindromePartitioning {
	public static void main(String[] args) {
		int i, j, k, n;
		String str;
		int[] cuts;
		boolean[][] pal;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		
		str = in.readString();
		n = str.length();
		cuts = new int[n];
		pal = new boolean[n][n];
		
		for(i = 0 ; i < n ; i++) {
			pal[i][i] = true;
		}
		for(i = 2 ; i <= n ; i++) {
			for(j = 0 ; j < n-i+1 ; j++) {
				k = j + i - 1;
				if(i == 2) {
					if(str.charAt(j) == str.charAt(k)) {
						pal[j][k] = true;
					} else {
						pal[j][k] = false;
					}
				} else {
					if(str.charAt(j) == str.charAt(k) && pal[j+1][k-1]) {
						pal[j][k] = true;
					} else {
						pal[j][k] = false;
					}
				}
			}
		}
		for(i = 0 ; i < n ; i++) {
			if(pal[0][i] == true) {
				cuts[i] = 0;
			} else {
				cuts[i] = Integer.MAX_VALUE;
				for(j = 0 ; j < i ; j++) {
					if(pal[j+1][i]) {
						cuts[i] = Math.min(cuts[i], 1 + cuts[j]);
					}
				}

			}
		}
		out.printLine(cuts[n-1]);
		out.flush();
		out.close();
	}
}
