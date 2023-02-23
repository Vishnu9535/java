public class sortstr {
    public static void main(String[] args) {
        String[] str1={"Z","b", "a","M","B","L","c","X","c"};
        for(int i=0;i<str1.length;i++){
            for(int j=i+1;j<str1.length;j++){
                if((str1[i].compareToIgnoreCase(str1[j]))>0){
                    System.out.println(str1[i].compareToIgnoreCase(str1[j]));
                 String temp=str1[i];
                 str1[i]=str1[j];
                 str1[j]=temp;
                }
            }
        }
        for(int i=0;i<str1.length;i++){
            System.out.print(str1[i]+" ");
        }
    }
}
