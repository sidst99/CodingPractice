package CodingNinjas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountInversions {
	public static int merge(int[] arr, int si, int mid, int ei) {
		int i, j, k, l1, l2, c;
		int[] left, right;
		l1 = mid - si + 1;
		l2 = ei - mid;
		left = new int[l1];
		right = new int[l2];
		for(i = 0 ; i < l1 ; i++) {
			left[i] = arr[si+i];
		}
		for(j = 0 ; j < l2 ; j++) {
			right[j] = arr[mid+1+j];
		}
		i = 0;
		j = 0;
		k = si;
		c = 0;
		while(i < l1 && j < l2) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
				c += l1-i;
			}
			k++;
		}
		while(i < l1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j < l2) {
			arr[k] = right[j];
			j++;
			k++;
		}
		return c;
	}
	
	public static int countInv(int[] arr, int si, int ei) {
		if(si >= ei) {
			return 0;
		}
		int lc, rc, mc, mid;
		mid = (si + ei)/2;
		lc = countInv(arr, si, mid);
		rc = countInv(arr, mid+1, ei);
		mc = merge(arr, si, mid, ei);
		return (lc + rc + mc);
	}
	
	public static void main(String[] args) throws IOException {
		int n, i;
		int[] arr;
		String[] str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		str = br.readLine().split(" ");
		for(i = 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		System.out.println(countInv(arr, 0, n-1));
	}
}
