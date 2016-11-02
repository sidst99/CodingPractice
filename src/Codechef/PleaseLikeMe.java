package Codechef;

public class PleaseLikeMe {
	public static void main(String[] args) {
		int t, l, d, s, c, day;
		long likes;
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		t = in.readInt();
		while(t > 0) {
			l = in.readInt();
			d = in.readInt();
			s = in.readInt();
			c = in.readInt();
			day = 1;
			likes = s;
			while(day < d) {
				if(likes >= l) {
					break;
				}
				likes = likes * (c + 1); 
				day++;
			}
			if(likes >= l) {
				out.printLine("ALIVE AND KICKING");
			} else {
				out.printLine("DEAD AND ROTTING");
			}
			t--;
		}
		out.flush();
		out.close();
	}
}
