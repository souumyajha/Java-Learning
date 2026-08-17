package Strings;
import java.util.Scanner;

public class Anagram {
    public static boolean isAnagram(String s1 , String s2){

        if(s1.length() != s2.length()){
            return false;
        }

        int[] freq = new int[26];

        for(int i = 0 ; i < s1.length() ; i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for(int count : freq){
            if( count != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        if(isAnagram(s1, s2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

        sc.close();
    }
}
