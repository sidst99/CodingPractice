package AlgoDS;

public class SegmentTreeRangeMinimumQuery {
	int[] arr, st;
	
	public SegmentTreeRangeMinimumQuery(int[] arr) {
		this.arr = arr;
		int x = (int)Math.ceil(Math.log(arr.length) / Math.log(2));
		st = new int[2*(int)Math.pow(2, x)-1];
		constructSegmentTree(0, arr.length-1, 0);
	}
	
	private int constructSegmentTree(int ss, int se, int si) {
		if(ss == se) {
			st[si] = arr[ss];
			return arr[ss];
		}
		int mid = (ss + se) / 2;
		st[si] = Math.min(constructSegmentTree(ss, mid, 2*si+1), constructSegmentTree(mid+1, se, 2*si+2));
		return st[si];
	}
	
	private int getMinimumUtil(int ss, int se, int si, int qs, int qe) {
		if(qs <= ss && qe >= se) {
			return st[si];
		}
		if(se < qs || ss > qe) {
			return Integer.MAX_VALUE;
		}
		int mid = (ss + se) / 2;
		return Math.min(getMinimumUtil(ss, mid, 2*si+1, qs, qe), getMinimumUtil(mid+1, se, 2*si+2, qs, qe));
	}
	
	public int getMinimum(int qs, int qe) {
		if(qs < 0 || qe > arr.length-1 || qs > qe) {
			System.out.println("Invalid Input");
			return -1;
		}
		return getMinimumUtil(0, arr.length-1, 0, qs, qe);
	}
}