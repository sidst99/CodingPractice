package AlgoDS;

public class SegmentTreeSumOfGivenRange {
	int[] arr, st;
	
	public SegmentTreeSumOfGivenRange(int[] arr) {
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
		st[si] = constructSegmentTree(ss, mid, 2*si+1) + constructSegmentTree(mid+1, se, 2*si+2);
		return st[si];
	}
	
	private int getSumUtil(int ss, int se, int si, int qs, int qe) {
		if(qs <= ss && qe >= se) {
			return st[si];
		}
		if(se < qs || ss > qe) {
			return 0;
		}
		int mid = (ss + se) / 2;
		return getSumUtil(ss, mid, 2*si+1, qs, qe) + getSumUtil(mid+1, se, 2*si+2, qs, qe);
	}
	
	public int getSum(int qs, int qe) {
		if(qs < 0 || qe > arr.length-1 || qs > qe) {
			System.out.println("Invalid Input");
			return -1;
		}
		return getSumUtil(0, arr.length-1, 0, qs, qe);
	}
	
	private void updateValueUtil(int ss, int se, int si, int i, int diff) {
		if(i < ss || i > se) {
			return;
		}
		st[si] += diff;
		if(ss != se) {
			int mid = (ss + se) / 2;
			updateValueUtil(ss, mid, 2*si+1, i, diff);
			updateValueUtil(mid+1, se, 2*si+2, i, diff);
		}
	}
	
	public void updateValue(int index, int new_value) {
		if(index < 0 || index > arr.length-1) {
			System.out.println("Invalid Input");
			return;
		}
		int diff = new_value - arr[index];
		arr[index] = new_value;
		updateValueUtil(0, arr.length-1, 0, index, diff);
	}
}