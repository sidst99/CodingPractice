package AlgoDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrieUse {
	public static void main(String[] args) throws IOException {
		int alphabet_size;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the alphabet size : ");
		alphabet_size = Integer.parseInt(br.readLine());
		Trie trie = new Trie(alphabet_size);
		trie.insert("the");
		trie.insert("a");
		trie.insert("there");
		trie.insert("answer");
		trie.insert("any");
		trie.insert("by");
		trie.insert("bye");
		trie.insert("their");
		System.out.println(trie.search("the"));
		System.out.println(trie.search("these"));
		System.out.println(trie.search("their"));
		System.out.println(trie.search("thaw"));
	}
}
