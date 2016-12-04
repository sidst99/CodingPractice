package Codechef;

public class IOUtils {
	 public static int[] readIntArray(InputReader in, int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++)
			array[i] = in.readInt();
		return array;
	 }
	 public static void printIntArray(OutputWriter out, int[] a) {
		 for(int i = 0 ; i < a.length ; i++) {
			 out.print(a[i]+" ");
		 }
	 }
}
