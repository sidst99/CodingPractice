package AlgoDS;

public class Trie {
	final int alphabet_size;
	private TrieNode root;
	
	public Trie(int alphabet_size) {
		this.alphabet_size = alphabet_size;
		root = new TrieNode(this.alphabet_size);
	}
	
	private int charToIndex(char ch) {
		return (int)ch - 97;
	}
	
	public void insert(String key) {
		int level, length, index;
		length = key.length();
		TrieNode node = root;
		for(level = 0 ; level < length ; level++) {
			index = charToIndex(key.charAt(level));
			if(node.children[index] == null) {
				node.children[index] = new TrieNode(alphabet_size);	
			}
			node = node.children[index];
		}
		node.isLeaf = true;
	}
	
	public boolean search(String key) {
		int level, length, index;
		length = key.length();
		TrieNode node = root;
		for(level = 0 ; level < length ; level++) {
			index = charToIndex(key.charAt(level));
			if(node.children[index] == null) {
				return false;
			}
			node = node.children[index];
		}
		if(node.isLeaf == true) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean isFreeNode(TrieNode node) {
		int i;
		for(i=0 ; i < alphabet_size ; i++) {
			if(node.children[i] != null) {
				return false;
			}
		}
		return true;
	}
	
	private boolean deleteHelper(TrieNode node, String key, int level) {
		if(node == null) {
			return false;
		}
		if(level == key.length()) {
			if(node.isLeaf == true) {
				node.isLeaf = false;
				if(isFreeNode(node) == true) {
					return true;
				}
				return false;
			}
			return false;
		} else {
			int index = charToIndex(key.charAt(level));
			if(deleteHelper(node.children[index], key, level+1) == true) {
				node.children[index] = null;
				return (!node.isLeaf && isFreeNode(node));
			} else {
				return false;
			}
		}
	}
	
	public void delete(String key) {
		deleteHelper(root, key, 0);
	}
}
