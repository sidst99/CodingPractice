package Codechef;

import java.util.Comparator;

public class FriendsHousePairComparator implements Comparator<FriendsHousePair>{
	@Override
	public int compare(FriendsHousePair p1, FriendsHousePair p2) {
		if(p1.x < p2.x) {
			return 1;
		} else if(p1.x > p2.x) {
			return -1;
		} else {
			if(p1.y > p2.y) {
				return 1;
			} else if(p1.y < p2.y) {
				return -1;
			} else {
				return 0;
			}
		}
	}
}
