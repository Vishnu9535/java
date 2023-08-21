public class problem1768 {
    public String mergeAlternately(String word1, String word2){
     char [] arr1 = word1.toCharArray();
     char [] arr2 = word2.toCharArray();
     char[] merge = new char[arr1.length + arr2.length];
     int i =0,j=0;
     while(i < merge.length){
        if(j < arr1.length){
            merge[i] = arr1[j];
            i++;
        }
        if(j < arr2.length){
            merge[i] = arr2[j];
            i++;
        }
        j++;
     }
     return new String(merge);
    }
    public static void main(String[] args) {
        String word1 =  "abq";
        String word2 = "rpq";
        problem1768 obj = new problem1768();
        System.out.println(obj.mergeAlternately(word1, word2));
    }
}
