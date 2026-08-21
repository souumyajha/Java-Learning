package Trie;

public class StartsWithProblem {
    static class Node{
        Node[] children;
        boolean endOfWord;

        Node(){
            children = new Node[26];
            for(int i = 0 ; i < 26 ; i++){
                children[i] = null;
            }
            endOfWord = false;
        }
    }

    static Node root = new Node();

    public static void insert(String words){
        Node curr = root;
        for(int i = 0 ; i < words.length() ; i++){
            int ind = words.charAt(i) - 'a';
            Node node = curr.children[ind];
            if(node == null){
                node = new Node();
                curr.children[ind] = node;
            }
            if(i == words.length()-1){
                node.endOfWord = true;
            }
            curr = node;
        }
    }
    public static boolean startsWith(String prefix){
        Node curr = root;
        for(int i = 0 ; i < prefix.length() ; i++){
            int ind = prefix.charAt(i) - 'a';
            if(curr.children[ind] == null){
                return false;
            }
            curr = curr.children[ind];
        }
        return true;
    }
  public static void main(String[] args){
        String[] words = {"apple"};
        String prefix = "ap";
        for(String word : words){
            insert(word);
        }
      System.out.println(startsWith(prefix));
  }
}
