package Trie;

public class SearchInTrie {
        static class Node {
            Node[] children;
            boolean endOfWord;

            Node() {
                children = new Node[26];
                for (int i = 0; i < 26; i++) {
                    children[i] = null;
                }
                endOfWord = false;
            }
        }
            static Node root = new Node();

            public static void insert(String words) {
                Node curr = root;
                for (int i = 0; i < words.length(); i++) {
                    int ind = words.charAt(i) - 'a';
                    Node node = curr.children[ind];
                    if (node == null) {
                        node = new Node();
                        curr.children[ind] = node;
                    }
                    if (i == words.length() - 1) {
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
    public static void main(String[] args){
        String[] words = {"the" , "their"};
        for(String word : words){
            insert(word);
        }
        System.out.println(search("the"));
        }
    }





