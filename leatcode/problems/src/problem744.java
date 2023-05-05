import java.util.*;

public class problem744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start <= end){
            int index=(start+end)/2;
            // if(letters[index] == target){
            //     return letters[index];
            // }
            if(letters[index] > target){
                end= index-1;
            }
            else{
                start=index+1;
            }
        }
        // if(start < letters.length)
        return letters[start];
        // else return letters[0];
    }
    public static void main(String[] args) {
        char[] arr={'c','f','j'};
        char a='c';
        problem744 obj1=new problem744();
        char r=obj1.nextGreatestLetter(arr, a);
        System.out.println(r);
    }
}
