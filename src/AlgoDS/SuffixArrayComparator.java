package AlgoDS;

import java.util.Comparator;

public class SuffixArrayComparator implements Comparator<Suffix> {
	@Override
	public int compare(Suffix s1, Suffix s2) {
		return (s1.rank == s2.rank) ? ((s1.nextRank < s2.nextRank) ? -1 : 1) : ((s1.rank < s2.rank) ? -1 : 1);
	}
}
