package Trie;

public class LongestSubstringwithAllPrefix {
    //longest word with all nodes as true kyuki those are all prefixes in the words array

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
            if(curr.children[ind] == null){
                curr.children[ind] = new Node();
            }if(i == words.length() - 1){
                curr.children[ind].endOfWord = true;
            }
            curr = curr.children[ind];
        }
    }

    // for longest word find all node whose eow is true;

    public static String ans = "";
    public static void longestSubstring(Node root , StringBuilder temp){

        if(root == null){
            return ;
        }

       for(int i = 0 ; i < 26 ; i++){

           if (root.children[i] != null && root.children[i].endOfWord == true) {
               //1) save it in temp
               //2)temp = ans
               //3)recursive child
               //4) do not update root value that completely changes the logic
               temp.append((char) (i + 'a'));
               if (ans.length() < temp.length()) {
                   ans = temp.toString();
               }
               longestSubstring(root.children[i], temp);
               temp.deleteCharAt(temp.length() - 1);
           }
       }

    }
    public static void main(String[] args){
        String[] words = {"a" , "banana" , "app" , "appl" , "ap" , "apply" , "apple"};
        for(String word : words){
            insert(word);
        }

        longestSubstring(root , new StringBuilder(""));
        System.out.println(ans);
    }
}
