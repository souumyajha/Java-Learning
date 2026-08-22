package Trie;

import java.util.List;

public class ReplaceWords {
    static class Node{
        Node[] children;
        boolean eow;

        Node(){
            children = new Node[26];
            eow = false;
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
                node.eow = true;
            }
            curr = node;
        }
    }

    public static String search(String word){
        Node curr = root;
        for(int i = 0 ; i < word.length() ; i++){
            int ind = word.charAt(i) - 'a';
            Node node = curr.children[ind];
            if(node == null){
                return word ;
            }
            if(node.eow == true){
                return word.substring(0 ,i+1);
            }
            curr = node;
        }
        return word;
    }
    public static String replaceWords(List<String> dictionary , String sentence){
        for(String word: dictionary){
            insert(word);
        }
        String[] word = sentence.split(" ");

        for(int i = 0 ; i < word.length ; i++){
            word[i] = search(word[i]);
        }
        return String.join(" ",word);
    }
    public static void main(String[] args){
        List<String> dictionary = List.of("cat","bat","rat" , "catt");
        String sentence = "the cattle was rattled by the battery";

        System.out.println(replaceWords(dictionary , sentence));
    }
}
