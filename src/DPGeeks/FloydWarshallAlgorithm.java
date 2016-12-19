package DPGeeks;

import Codechef.IOUtils;
import Codechef.InputReader;
import Codechef.OutputWriter;

public class FloydWarshallAlgorithm {
	public static void main(String[] args) {
		int i, j, k, n;
		int[][] v, dist;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		
		n = in.readInt();
		v = new int[n][n];
		for(i = 0 ; i < n ; i++) {
			v[i] = IOUtils.readIntArray(in, n);
		}
		dist = new int[n][n];
		for(i = 0 ; i < n ; i++) {
			for(j = 0 ; j < n ; j++) {
				dist[i][j] = v[i][j];
			}
		}
		for(i = 0 ; i < n ; i++) {
			for(j = 0 ; j < n ; j++) {
				for(k = 0 ; k < n ; k++) {
					if(dist[j][i] + dist[i][k] < dist[j][k]) {
						dist[j][k] = dist[j][i] + dist[i][k];
					}
				}
			}
		}
		for(i = 0 ; i < n ; i++) {
			for(j = 0 ; j < n ; j++) {
				out.print(dist[i][j]+" ");
			}
			out.printLine();
		}
		out.flush();
		out.close();
	}
}
