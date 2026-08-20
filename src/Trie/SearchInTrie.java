package Trie;

public class SearchInTrie {
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
            for(int i = 0 ; i < word.length() ; i++) {
                int ind = word.charAt(i) - 'a';
                if (curr.children[ind] == null) {
                    curr.children[ind] = new Node();
                }
                if (i == word.length() - 1) {
                    curr.children[ind].endOfWord = true;
                }
                curr = curr.children[ind];
            }
        }

        public static boolean search(String key){
            Node curr = root;
            for(int i = 0 ; i < key.length() ; i++){
                int ind = key.charAt(i) - 'a';
                if(curr.children[ind] == null){
                    return false;
                }else if(i == key.length() - 1 && curr.children[ind].endOfWord == false){
                    return false;
                }
                curr = curr.children[ind];
            }
            return true;
        }

        public static void main(String[] args){
            String[] words = { "the" , "there"};
            for(String word : words){
                insert(word);
            }
            System.out.println(search( "there"));
            System.out.println(search( "thor"));
            System.out.println(search( "and"));
        }
    }

