package AlgoDS;

public class SegmentTreeSumOfGivenRangeUse {
	public static void main(String[] args) {
		int[] arr =  {1,3,5,7,9,11};
		SegmentTreeSumOfGivenRange ob = new SegmentTreeSumOfGivenRange(arr);
		System.out.println(ob.getSum(1,3));
		ob.updateValue(1, 10);
		System.out.println(ob.getSum(1, 3));
	}
}