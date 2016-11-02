package Codechef;

public class JohnnyAndTheBeanstalk {
	public static void main(String[] args) {
		int t, k, i, a, stems;
		boolean flag;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		t = in.readInt();
		while(t > 0) {
			k = in.readInt();
			stems = 1;
			flag = false;
			for(i = 0 ; i < k ; i++) {
				a = in.readInt();
				if(a == stems) {
					if(i == k-1) {
						flag = true;
					}
					break;
				} else if(a > stems) {
					break;
				} else {
					stems = (stems - a) * 2;
				}
			}
			for(i = i+1 ; i < k ; i++) {
				a = in.readInt();
			}
			if(flag == true) {
				out.printLine("Yes");
			} else {
				out.printLine("No");
			}
			t--;
		}
		out.flush();
		out.close();
	}
}
