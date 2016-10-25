package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CleaningUp {
	public static void print(int[] arr) {
		int i;
		for(i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws IOException {
		String[] str;
		int t, n, m, i, j, k, l, turn;
		int[] complete, chef, assistant;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		while(t > 0) {
			str = br.readLine().split(" ");
			n = Integer.parseInt(str[0]);
			m = Integer.parseInt(str[1]);
			str = br.readLine().split(" ");
			complete = new int[m];
			chef = new int[(n-m) - (n-m)/2];
			assistant = new int[(n-m)/2];
			for(i = 0 ; i < m ; i++) {
				complete[i] = Integer.parseInt(str[i]);
			}
			Arrays.sort(complete);
			j = k = l = turn = 0;
			for(i = 1 ; i <= n ; i++) {
				if(l < m && complete[l] == i) {
					l++;
				} else {
					if(turn == 0) {
						chef[j] = i;
						j++;
						turn = 1;
					} else {
						assistant[k] = i;
						k++;
						turn = 0;
					}
				}
			}
			print(chef);
			print(assistant);
			t--;
		}
	}
}
