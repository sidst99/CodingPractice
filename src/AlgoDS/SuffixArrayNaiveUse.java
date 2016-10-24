package AlgoDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuffixArrayNaiveUse {
	public static void main(String[] args) throws IOException {
		String txt;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a string : ");
		txt = br.readLine();
		SuffixArrayNaive sArrayObj = new SuffixArrayNaive(txt);
		sArrayObj.printSuffixArray();
	}
}
