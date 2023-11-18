class  problem1342 {
    public int numberOfSteps(int num) {
        // int steps = 0;
        // while(num != 0){
        //     if(num % 2 == 0){
        //         num =num/2;
        //         steps++;
        //     }
        //     else{
        //         num = num -1;
        //         steps++;
        //     }
        // }
        // return steps;
        int steps =helper(num,0);
        System.out.println(steps);
        return steps;
    }
    public static  int helper(int num,int steps){
        if(num == 0){
            return steps;
        }
        if(num % 2 == 0){
            steps++;
            num = num/2;
            return helper(num,steps);
        }
        num=num-1;
        steps++;
        return helper(num,steps);
    }
    public static void main(String[] args) {
        problem1342 obj1 = new problem1342();
        obj1.numberOfSteps(14);
    }
}