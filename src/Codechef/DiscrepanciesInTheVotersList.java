package Codechef;

public class DiscrepanciesInTheVotersList {
	public static void main(String[] args) {
		int n1, n2, n3, i, j ,k, m, min, x;
		int[] l1, l2, l3, result;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		n1 = in.readInt();
		n2 = in.readInt();
		n3 = in.readInt();
		m = n1 + n2 + n3;
		l1 = new int[n1];
		l2 = new int[n2];
		l3 = new int[n3];
		result = new int[n1 + n2 + n3];
		for(i = 0 ; i < n1 ; i++) {
			l1[i] = in.readInt();
		}
		for(j = 0 ; j < n2 ; j++) {
			l2[j] = in.readInt();
		}
		for(k = 0 ; k < n3 ; k++) {
			l3[k] = in.readInt();
		}
		i = j = k = x = 0;
		while(i < n1 && j < n2 && k < n3) {
			min = Math.min(Math.min(l1[i], l2[j]), l3[k]);
			if(min == l1[i] && min == l2[j] && min == l3[k]) {
				result[x] = min;
				i++;
				j++;
				k++;
				x++;
			} else if(min == l1[i] && min == l2[j]) {
				result[x] = min;
				i++;
				j++;
				x++;
			} else if(min == l2[j] && min == l3[k]) {
				result[x] = min;
				j++;
				k++;
				x++;
			} else if(min == l1[i] && min == l3[k]) {
				result[x] = min;
				i++;
				k++;
				x++;
			} else if(min == l1[i]) {
				i++;
			} else if(min == l2[j]) {
				j++;
			} else if(min == l3[k]) {
				k++;
			}
		}
		if(i == n1) {
			while(j < n2 && k < n3) {
				if(l2[j] == l3[k]) {
					result[x] = l2[j];
					j++;
					k++;
					x++;
				} else if(l2[j] < l3[k]) {
					j++;
				} else {
					k++;
				}
			}
		}
		if(j == n2) {
			while(i < n1 && k < n3) {
				if(l1[i] == l3[k]) {
					result[x] = l1[i];
					i++;
					k++;
					x++;
				} else if(l1[i] < l3[k]) {
					i++;
				} else {
					k++;
				}
			}
		}
		if(k == n3) {
			while(i < n1 && j < n2) {
				if(l1[i] == l2[j]) {
					result[x] = l1[i];
					i++;
					j++;
					x++;
				} else if(l1[i] < l2[j]) {
					i++;
				} else {
					j++;
				}
			}
		}
		m = x;
		out.printLine(m);
		for(x = 0 ; x < m ; x++) {
			out.printLine(result[x]);
		}
		out.flush();
		out.close();
	}
}
