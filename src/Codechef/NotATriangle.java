package Codechef;

import java.util.Arrays;

public class NotATriangle {
	public static void main(String[] args) {
		int n, result, i, left, right;
		int[] l;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		while(true) {
			n = in.readInt();
			if(n == 0) {
				break;
			}
			l = IOUtils.readIntArray(in, n);
			Arrays.sort(l);
			result = 0;
			for(i = 2 ; i < n  ; i++) {
				left = 0;
				right = i-1;
				while(left < right) {
					if(l[left] + l[right] < l[i]) {
						result += (right - left);
						left++;
					} else {
						right--;
					}
				}
			}
			out.printLine(result);
		}
		out.flush();
		out.close();
	}
}
