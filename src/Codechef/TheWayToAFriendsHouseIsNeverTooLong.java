package Codechef;

import java.util.Arrays;

public class TheWayToAFriendsHouseIsNeverTooLong {
	public static double distance(FriendsHousePair p1, FriendsHousePair p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}
	public static void main(String[] args) {
		int t, n, i;
		double sum;
		FriendsHousePair[] points;
		InputReader in = new InputReader(System.in);
		t = in.readInt();
		while(t > 0) {
			n = in.readInt();
			points = new FriendsHousePair[n];
			for(i = 0 ; i < n ; i++) {
				points[i] = new FriendsHousePair();
				points[i].x = in.readInt();
				points[i].y = in.readInt();
			}
			FriendsHousePairComparator comparator = new FriendsHousePairComparator();
			Arrays.sort(points, comparator);
			sum = 0;
			for(i = 0 ; i < n-1 ; i++) {
				sum += distance(points[i], points[i+1]);
			}
			System.out.printf("%.2f\n", sum);
			t--;
		}
	}
}
