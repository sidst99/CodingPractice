package Codechef;

public class ChefAndGift {
	public static void main(String[] args) {
		int t, n, k, a, even, i;
		boolean flag;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		t = in.readInt();
		while(t > 0) {
			n = in.readInt();
			k = in.readInt();
			if(k == 0) {
				flag = false;
				for(i = 0 ; i < n ; i++) {
					a = in.readInt();
					if(a%2 == 1) {
						flag = true;
					}
				}
				if(flag == true) {
					out.printLine("YES");
				} else {
					out.printLine("NO");
				}
			} else {
				even = 0;
				for(i = 0 ; i < n ; i++) {
					a = in.readInt();
					if(a%2 == 0) {
						even++;
					}
				}
				if(even >= k) {
					out.printLine("YES");
				} else {
					out.printLine("NO");
				}
			}
			t--;
		}
		out.flush();
		out.close();
	}
}
