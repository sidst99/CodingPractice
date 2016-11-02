package Codechef;

public class Stone {
	public static void main(String[] args) {
		int n, k, i, j;
		long max;
		long[] a;
		InputReader in =new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		n = in.readInt();
		k = in.readInt();
		a = new long[n];
		for(i = 0 ; i < n ; i++) {
			a[i] = (long)in.readInt();
		}
		if(k == 0) {
			for(i = 0 ; i < n ; i++) {
				out.print(a[i] + " ");
			}
		} else {
			if(k % 2 == 1) {
				k = 1;
			} else {
				k = 2;
			}
			for(i = 0 ; i < k ; i++) {
				max = a[0];
				for(j = 1 ; j < n ; j++) {
					if(a[j] > max) {
						max = a[j];
					}
				}
				for(j = 0 ; j < n ; j++) {
					a[j] = max - a[j];
				}
			}
			for(i = 0 ; i < n ; i++) {
				out.print(a[i] + " ");
			}
		}
		out.flush();
		out.close();
	}
}
