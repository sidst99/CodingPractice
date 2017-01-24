package Hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AliceAndBobsSillyGame {
	public static void main(String[] args) throws IOException {
		int i, p, g, n;
		boolean[] prime = new boolean[100001];
		int[] freq = new int[100001];
    	for(i = 0 ; i < 100001 ; i++) {
    		prime[i] = true;
    	}
    	for (p=2 ; p*p<=100000 ; p++)
        {
            if (prime[p] == true)
            {
                for (i=p*2 ; i<=100000 ; i += p)
                    prime[i] = false;
            }
        }
    	freq[1] = 0;
        for (p=2 ; p<=100000 ; p++) {
           if (prime[p] == true) {
              freq[p] = freq[p-1] + 1;
           } else {
        	   freq[p] = freq[p-1];
           }
        }
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        g = Integer.parseInt(br.readLine());
        while(g > 0) {
            n = Integer.parseInt(br.readLine());
            if(freq[n]%2 == 0) {
            	System.out.println("Bob");
            } else {
            	System.out.println("Alice");
            }
            g--;
        }
    }
}