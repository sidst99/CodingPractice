package Codechef;

import java.util.Arrays;

public class AndrewAndTheMeatballs {
	public static void main(String[] args) {
		int t, n, result, i;
		long m, count;
		long[] p;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		t = in.readInt();
		while(t > 0) {
			n = in.readInt();
			m = Long.parseLong(in.readString());
			p = new long[n];
			for(i = 0 ; i < n ; i++) {
				p[i] = Long.parseLong(in.readString());
			}
			Arrays.sort(p);
			result = 0;
			count = 0;
			for(i = n-1 ; i >= 0 ; i--) {
				count += p[i];
				result++;
				if(count >= m) {
					out.printLine(result);
					break;
				}
			}
			if(i == -1) {
				out.printLine(-1);
			}
			t--;
		}
		out.flush();
		out.close();
	}
}
