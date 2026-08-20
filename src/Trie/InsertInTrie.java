package Trie;

public class InsertInTrie {
    static class Node{
        Node[] children;
        boolean endOfWord;

        Node(){
            children = new Node[26];
            endOfWord = false;
        }
    }
    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i = 0 ; i < word.length() ; i++){
            int ind = word.charAt(i) - 'a';
            if(curr.children[ind] == null){
                curr.children[ind] = new Node();
            }
            if(i == word.length() - 1){
                curr.children[ind].endOfWord = true;
            }
            curr = curr.children[ind];
        }
    }
    public static void main(String[] args){
        String[] words = { "the" , "there"};
        for(String word : words){
            insert(word);
        }
    }
}
