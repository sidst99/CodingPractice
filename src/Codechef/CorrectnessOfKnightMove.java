package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CorrectnessOfKnightMove {
	public static void main(String[] args) throws IOException{
		int t;
		String input;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		while(t > 0) {
			input = br.readLine();
			if(input.length() != 5) {
				System.out.println("Error");
			} else {
				if(input.charAt(2) != '-') {
					System.out.println("Error");
				} else {
					if(input.charAt(0) < 'a' || input.charAt(0) > 'h' || 
							input.charAt(3) < 'a' || input.charAt(3) > 'h' || 
							input.charAt(1) < '1' || input.charAt(1) > '8' || 
							input.charAt(4) < '1' || input.charAt(4) > '8') {
						System.out.println("Error");
					} else {
						if((Math.abs(input.charAt(1) - input.charAt(4)) == 2 && 
								Math.abs(input.charAt(0) - input.charAt(3)) == 1) || 
								(Math.abs(input.charAt(1) - input.charAt(4)) == 1 && 
								Math.abs(input.charAt(0) - input.charAt(3)) == 2)) {
							System.out.println("Yes");
						} else {
							System.out.println("No");
						}
					}
				}
			}
			t--;
		}
	}
}
