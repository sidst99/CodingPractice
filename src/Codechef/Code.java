package Codechef;

public class Code {
	public static void main(String[] args) {
		int t, n ,k, answer, i;
		int[] a;
		String operator;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		t = in.readInt();
		while(t > 0) {
			n = in.readInt();
			k = in.readInt();
			answer = in.readInt();
			a = IOUtils.readIntArray(in, n);
			operator = in.readString();
			if(k != 0) {
				if(operator.equals("XOR")) {
					if(k % 2 == 1) {
						for(i = 0 ; i < n ; i++) {
							answer = answer ^ a[i];
						}
					}
				} else if(operator.equals("OR")) {
					for(i = 0 ; i < n ; i++) {
						answer = answer | a[i];
					}
				} else if(operator.equals("AND")) {
					for(i = 0 ; i < n ; i++) {
						answer = answer & a[i];
					}
				}
			}
			out.printLine(answer);
			t--;
		}
		out.flush();
		out.close();
	}
}
