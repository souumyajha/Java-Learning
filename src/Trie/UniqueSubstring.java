package Trie;
//microsoft and google m aaya tha

public class UniqueSubstring {
    //1) find all suffix of strings
    //2)create a trie from suffix
    //3)count nodes of trie bcoz they are = unique substrings

    static class Node{
        Node[] children;
        boolean endOfWord;

        Node(){
            children = new Node[26];
            for(int i = 0 ; i < 26 ; i++){
                children[i] = null;
            }
        }
    }

    static Node root = new Node();

    public static void insert(String suffix){
        Node curr = root;
        for(int i = 0 ; i < suffix.length() ; i++){
            int ind = suffix.charAt(i) - 'a';
            if(curr.children[ind] == null){
                curr.children[ind] = new Node();
            }if(i == suffix.length()-1){
                curr.children[ind].endOfWord = true;
            }
            curr = curr.children[ind];
        }
    }
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i = 0 ; i < 26 ; i++){
            if(root.children[i] != null){
                count += countNodes(root.children[i]);
            }
        }
        return count+1;
    }
    public static void main(String[] args){
        String str = "apple";

        for(int i = 0 ; i < str.length() ; i++){
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countNodes(root));
    }

}
