package Codechef;

import java.math.BigInteger;
import java.util.Arrays;

public class AmIAFibonacciNumber {
	public static BigInteger[] fibonacciNumbers() {
		int i;
		BigInteger[] fib = new BigInteger[4000];
		fib[0] = new BigInteger("0");
		fib[1] = new BigInteger("1");
		for(i = 2 ; i < fib.length ; i++) {
			fib[i] = new BigInteger("0");
			fib[i] = fib[i].add(fib[i-1]).add(fib[i-2]);
		}
		return fib;
	}
	public static void main(String[] args) {
		int t, i;
		BigInteger a;
		InputReader in = new InputReader(System.in);
		OutputWriter out= new OutputWriter(System.out);
		BigInteger[] fib = fibonacciNumbers();
		t = in.readInt();
		while(t > 0) {
			a = new BigInteger(in.readString());
			i = Arrays.binarySearch(fib, a);
			if(i < 0) {
				out.printLine("NO");
			} else {
				out.printLine("YES");
			}
			t--;
		}
		out.flush();
		out.close();
	}
}
