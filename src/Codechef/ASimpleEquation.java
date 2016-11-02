package Codechef;

public class ASimpleEquation {
	public static long combination(int n) {
		if(n < 3)
			return 0;
		return (long)n*(n-1)*(n-2)/6;
	}
	public static void main(String[] args) {
		int t, n, a, b, c;
		long result;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		t = in.readInt();
		while(t > 0) {
			n = in.readInt();
			a = in.readInt();
			b = in.readInt();
			c = in.readInt();
			result = combination(n+3) - combination(n-a+2) - combination(n-b+2) 
					- combination(n-c+2) + combination(n-a-b+1) + combination(n-b-c+1) 
					+ combination(n-a-c+1) - combination(n-a-b-c);
			out.printLine(result);
			t--;
		}
		out.flush();
		out.close();
	}
}
