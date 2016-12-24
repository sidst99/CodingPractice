package AlgoDS;

public class SegmentTreeLazyPropagationUse {
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9, 11};
		SegmentTreeLazyPropagation ob = new SegmentTreeLazyPropagation(arr);
		System.out.println(ob.getSum(1, 3));
		ob.updateRange(1, 5, 10);
		System.out.println(ob.getSum(1, 3));
	}
}
