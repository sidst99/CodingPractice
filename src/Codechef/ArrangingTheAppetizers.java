package Codechef;

public class ArrangingTheAppetizers {
	public static void scramble(String a, char[] b, int x, int n, int d, int i) {
		if(n == 1) {
			b[d] = a.charAt(x);
		} else {
			scramble(a, b, x, n/2, d, i*2);
			scramble(a, b, x+n/2, n/2, d+i, i*2);
		}
	}
	public static void main(String[] args) {
		int t, k, n, i;
		String msg;
		char[] newMsg;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		t = in.readInt();
		while(t > 0) {
			k = in.readInt();
			msg = in.readString();
			n = (int)Math.pow(2, k);
			newMsg = new char[n];
			scramble(msg, newMsg, 0, n, 0, 1);
			for(i = 0 ; i < n ; i++) {
				out.print(newMsg[i]);
			}
			out.printLine();
			t--;
		}
		out.flush();
		out.close();
	}
}
