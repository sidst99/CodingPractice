package AlgoDS;

public class TrieNode {
	boolean isLeaf;
	TrieNode[] children;
	
	public TrieNode(int alphabet_size) {
		isLeaf = false;
		children = new TrieNode[alphabet_size];
	}
}