package DPGeeks;

import Codechef.IOUtils;
import Codechef.InputReader;
import Codechef.OutputWriter;

public class LongestBitonicSubsequence {
	public static void main(String[] args) {
		int i, j, n, max;
		int[] arr, lis, lds;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		
		n = in.readInt();
		arr = new int[n];
		arr = IOUtils.readIntArray(in, n);
		lis = new int[n];
		lds = new int[n];
		lis[0] = 1;
		lds[n-1] = 1;
		
		for(i = 1 ; i < n ; i++) {
			lis[i] = 1;
			for(j = 0 ; j < i ; j++) {
				if(arr[i] > arr[j]) {
					lis[i] = Math.max(lis[i], 1 + lis[j]);
				}
			}
		}
		for(i = n-2 ; i >= 0 ; i--) {
			lds[i] = 1;
			for(j = n-1 ; j > i ; j--) {
				if(arr[i] > arr[j]) {
					lds[i] = Math.max(lds[i], 1 + lds[j]);
				}
			}
		}
		max = Integer.MIN_VALUE;
		for(i = 0 ; i < n ; i++) {
			max = Math.max(max, lis[i] + lds[i] - 1);
		}
		out.printLine(max);
		out.flush();
		out.close();
	}
}
