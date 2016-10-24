package AlgoDS;

import java.util.Comparator;

public class SuffixArrayNaiveComparator implements Comparator<Integer> {
	String txt;
	
	public SuffixArrayNaiveComparator(String txt) {
		this.txt = txt;
	}
	
	@Override
	public int compare(Integer o1, Integer o2) {
		int i, j, length;
		i = o1;
		j = o2;
		length = txt.length();
		while(i < length && j < length) {
			if(txt.charAt(i) < txt.charAt(j)) {
				return -1;
			} else if(txt.charAt(i) > txt.charAt(j)) {
				return 1;
			}
			i++;
			j++;
		}
		if(i == length && j == length) {
			return 0;
		} else if(i == length) {
			return -1;
		} else {
			return 1;
		}
	}
}
