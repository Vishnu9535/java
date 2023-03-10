import java.util.Arrays;

class question{
    public static void main(String[] args) {
        int [] arr={0,0,1,1,1,2,2,3,3,4};
            int count=sorting(arr);
            System.out.println(count);
        }
        public static int sorting(int[] arr) {
            int count=0;
            int x=arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]!=x){
                    count=count+1;
                    x=arr[i];
                    arr[i]=x;
                }

            }
            System.out.println(Arrays.toString(arr));

            return count;
        }
    }
