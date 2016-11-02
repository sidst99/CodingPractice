package Codechef;

public class LittleElephantAndDivisors {
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}
	public static void main(String[] args) {
		int t, n, i, j, gcd;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		int[] smallestPrimeFactor = new int[100001];
		smallestPrimeFactor[1] = -1;
		for(i = 2 ; i <= 100000 ; i++) {
			if(smallestPrimeFactor[i] == 0) {
				for(j = i ; j <= 100000 ; j += i) {
					if(smallestPrimeFactor[j] == 0) {
						smallestPrimeFactor[j] = i;
					}
				}
			}
		}
		t = in.readInt();
		while(t > 0) {
			n = in.readInt();
			gcd = 0;
			for(i = 0 ; i < n ; i++) {
				gcd = gcd(gcd, in.readInt());
			}
			out.printLine(smallestPrimeFactor[gcd]);
			t--;
		}
		out.flush();
		out.close();
	}
}
