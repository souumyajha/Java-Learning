package Trie;

public class WordBreakProblem {
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
    public static boolean search(String key){
        Node curr = root;
        for(int i = 0 ; i < key.length() ; i++){
            int ind = key.charAt(i) - 'a';
            Node node = curr.children[ind];
            if(node == null){
                return false;
            }
            if(i == key.length() - 1 && node.endOfWord == false){
                return false;
            }
            curr = node;
        }
        return true;
    }
    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i = 1 ; i <= key.length() ; i++){
            String firstPart = key.substring(0 , i);
            String secPart = key.substring(i);
            if(search(firstPart) && wordBreak(secPart)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        String[] words = {"i", "like","sam" , "samsung"};
        for(String word : words){
            insert(word);
        }
        String key = "ilikesamsun"; //false
        System.out.println(wordBreak(key));
    }
}
