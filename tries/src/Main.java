public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertWord("car");
        trie.insertWord("card");
        trie.insertWord("chip");
        trie.insertWord("trie");
        trie.insertWord("try");

        trie.printAllKeys();


        System.out.println(trie.isPrefixValid("tr"));
        System.out.println(trie.isPrefixValid("ee"));
        System.out.println(trie.isPrefixValid("try"));
    }
}