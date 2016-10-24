package AlgoDS;

import java.util.Arrays;

public class SuffixArray {
	String txt;
	Integer[] suffixArray;
	
	public SuffixArray(String txt) {
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
	
	private void buildSuffixArray() {
		int i, j, length;
		length = txt.length();
		Suffix[] suffixes = new Suffix[length];
		for(i = 0 ; i < length ; i++) {
			suffixes[i] = new Suffix();
			suffixes[i].index = i;
			suffixes[i].rank = txt.charAt(i) - 'a';
			suffixes[i].nextRank = (i+1 < length) ? (txt.charAt(i+1) - 'a') : (-1);
		}
		SuffixArrayComparator comparator = new SuffixArrayComparator();
		Arrays.sort(suffixes, comparator);
		int[] index = new int[length];
		for(j = 4 ; j < (2*length) ; j++) {
			int rank = 0;
			int prevRank = suffixes[0].rank;
			suffixes[0].rank = 0;
			index[suffixes[0].index] = 0;
			for(i = 1 ; i < length ; i++) {
				if((suffixes[i].rank == prevRank) && (suffixes[i].nextRank == suffixes[i-1].nextRank)) {	
					prevRank = suffixes[i].rank;
					suffixes[i].rank = rank; 
				} else {
					prevRank = suffixes[i].rank;
					suffixes[i].rank = ++rank;
				}
				index[suffixes[i].index] = i;
			}
			for(i = 0 ; i < length ; i++) {
				int nextIndex = suffixes[i].index + j/2;
				suffixes[i].nextRank = (nextIndex < length) ? suffixes[index[nextIndex]].rank : -1;
			}
			Arrays.sort(suffixes, comparator);
		}
		suffixArray = new Integer[length];
		for(i = 0 ; i < length ; i++) {
			suffixArray[i] = suffixes[i].index;
		}
	}
}
