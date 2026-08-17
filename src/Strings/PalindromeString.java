package Strings;
import java.util.Scanner;

public class PalindromeString {

    //Approach 1 : Two pointers - BEST for DSA
    public static boolean isPalindrome(String s){
        int i = 0 ;
        int j = s.length() - 1;

        while(i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //Approach 2 : two pointer through one
    public static boolean isPalindromeUsingArray(String s){
        int i = 0 ;
        int j = s.length() - 1;

        char[] arr = s.toCharArray();

        while(i < j ){
            if(arr[i] != arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //main function
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        if(isPalindrome(s)){
            System.out.println(" Palindrome ");
        }else{
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
