package Arrays;
import java.util.HashSet;

public class FirstRepeated {
    //Approach 1 : using for loops
    public static int firstRepeated(int[] arr){

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    return i;
                }
            }
        }
        return -1;
    }

    //Approach 2: using hash map - Best method
    public static int firstReapetedUsingHas(int[] arr){

        HashSet<Integer> seen = new HashSet<>();

        for(int i = 0 ; i < arr.length ; i++){
            if( seen.contains(arr[i])){
                return i;
            }
            seen.add(arr[i]);
        }
        return -1;
    }
}
