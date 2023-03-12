import java.util.*;

public class Trie {
    public Node root;

    public Trie() {
        this.root = new Node();
    }

    public void insertWord(String word) {
        Node currentNode = this.root;

        for (int i = 0; i < word.length(); i++) {
            Character currentLetter = word.charAt(i);
            Node child = currentNode.children.get(currentLetter);
            if (child == null) {
                child = new Node();
                currentNode.children.put(currentLetter, child);
            }
            currentNode = child;
        }
        currentNode.isCompleteWord = true;
    }

    boolean isPrefixValid(String prefix) {
        List<String> strings = this.auxPrefix(new ArrayList<>(), this.root, new StringBuilder());
        for (String item : strings) {
            if (item.contains(prefix)) {
                return true;
            }
        }
        return false;
    }


    boolean isWordValid(String word) {
        List<String> strings = this.auxPrefix(new ArrayList<>(), this.root, new StringBuilder());
        for (String item : strings) {
            if (item.equals(word)) {
                return true;
            }
        }
        return false;
    }

    private List<String> auxPrefix(List<String> l, Node node, StringBuilder c) {
        HashMap<Character, Node> children = node.children;
        boolean f = false;
        for (var entry : children.entrySet()) {
            auxPrefix(l, entry.getValue(), new StringBuilder(c + entry.getKey().toString()));
            f = true;
        }
        if (!f) {
            l.add(c.toString());
        }
        return l;
    }


    public void printAllKeys() {
        this.auxPrint(this.root, new StringBuilder());

    }

    private void auxPrint(Node node, StringBuilder c) {
        HashMap<Character, Node> children = node.children;
        boolean f = false;
        for (var entry : children.entrySet()) {
            auxPrint(entry.getValue(), new StringBuilder(c + entry.getKey().toString()));
            f = true;
        }
        if (!f) {
            System.out.println(c);
        }
    }


}
