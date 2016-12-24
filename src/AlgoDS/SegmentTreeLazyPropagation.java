package AlgoDS;

public class SegmentTreeLazyPropagation {
	int[] arr, st, lazy;
	
	public SegmentTreeLazyPropagation(int[] arr) {
		this.arr = arr;
		int x = (int)Math.ceil(Math.log(arr.length) / Math.log(2));
		st = new int[2*(int)Math.pow(2, x) - 1];
		lazy = new int[2*(int)Math.pow(2, x) - 1];
		constructSegmentTree(0, arr.length-1, 0);
	}
	
	private void constructSegmentTree(int ss, int se, int si) {
		if(ss > se) {
			return;
		}
		if(ss == se) {
			st[si] = arr[ss];
			return;
		}
		int mid = (ss + se) / 2;
		constructSegmentTree(ss, mid, 2*si+1);
		constructSegmentTree(mid+1, se, 2*si+2);
		st[si] = st[2*si+1] + st[2*si+2];
	}
	
	private void updateRangeUtil(int ss, int se, int si, int us, int ue, int diff) {
		if(lazy[si] != 0) {
			st[si] += (se-ss+1)*lazy[si];
			if(ss != se) {
				lazy[2*si+1] += lazy[si];
				lazy[2*si+2] += lazy[si];
			}
			lazy[si] = 0;
		}
		if(ss > se || ss > ue || se < us) {
			return;
		}
		if(ss >= us && se <= ue) {
			st[si] += (se-ss+1)*diff;
			if(ss != se) {
				lazy[2*si+1] += diff;
				lazy[2*si+2] += diff;
			}
			return;
		}
		int mid = (ss + se) / 2;
		updateRangeUtil(ss, mid, 2*si+1, us, ue, diff);
		updateRangeUtil(mid+1, se, 2*si+2, us, ue, diff);
		st[si] = st[2*si+1] + st[2*si+2];
	}
	
	public void updateRange(int us, int ue, int diff) {
		updateRangeUtil(0, arr.length-1, 0, us, ue, diff);
	}
	
	private int getSumUtil(int ss, int se, int si, int qs, int qe) {
		if(lazy[si] != 0) {
			st[si] += (se-ss+1)*lazy[si];
			if(ss != se) {
				lazy[2*si+1] += lazy[si];
				lazy[2*si+2] += lazy[si];
			}
			lazy[si] = 0;
		}
		if(ss > qe || se < qs || ss > se) {
			return 0;
		}
		if(ss >= qs && se <= qe) {
			return st[si];
		}
		int mid = (ss + se) / 2;
		return getSumUtil(ss, mid, 2*si+1, qs, qe) + getSumUtil(mid+1, se, 2*si+2, qs, qe);
	}
	
	public int getSum(int qs, int qe) {
		return getSumUtil(0, arr.length-1, 0, qs, qe);
	}
}
