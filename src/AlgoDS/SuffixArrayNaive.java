package AlgoDS;

import java.util.Arrays;

public class SuffixArrayNaive {
	private String txt;
	private Integer[] suffixArray;
	
	SuffixArrayNaive(String txt) {
		this.txt = txt;
		buildSuffixArray();
	}
	
	public String getText() {
		return txt;
	}
	
	public Integer[] getSuffixArray() {
		return suffixArray;
	}
	
	public void printSuffixArray() {
		for(Integer i : suffixArray) {
			System.out.println(i);
		}
	}
	
	public void buildSuffixArray() {
		int i, length;
		length = txt.length();
		suffixArray = new Integer[length];
		for(i = 0 ; i < length ; i++) {
			suffixArray[i] = i;
		}
		SuffixArrayNaiveComparator comparator = new SuffixArrayNaiveComparator(txt);
		Arrays.sort(suffixArray, comparator);
	}
}
