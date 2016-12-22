package AlgoDS;

public class SegmentTreeRangeMinimumQueryUse {
	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 7, 9, 11};
		SegmentTreeRangeMinimumQuery ob = new SegmentTreeRangeMinimumQuery(arr);
		System.out.println(ob.getMinimum(1, 5));
	}
}