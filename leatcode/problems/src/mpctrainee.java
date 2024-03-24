import java.util.Scanner;

public class mpctrainee {

    public static void mpc_exams(int[][] trainer){
        int[] averages = new int[3];
        for (int i = 0; i < trainer.length; i++) {
            int sum = 0;
            for (int j = 0; j < trainer[i].length; j++) {
                sum += trainer[i][j];
            }
            averages[i] = Math.round((float) sum / trainer[i].length);
        }

        int maxAverage = Integer.MIN_VALUE;
        for (int average : averages) {
            if (average > maxAverage) {
                maxAverage = average;
            }
        }

        if (maxAverage < 70) {
            System.out.println("All trainees are unfit.");
        } else {
            System.out.println("most fit trainee with the highest average oxygen level:");
            for (int i = 0; i < averages.length; i++) {
                if (averages[i] == maxAverage) {
                    System.out.println("Trainee " + (i + 1) + " with average oxygen level: " + maxAverage);
                }
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] trainer = new int[3][3];
        for (int round = 1; round <= 3; round++) {
            System.out.println("Round " + round + ":");
            for (int i = 0; i < trainer.length; i++) {
                System.out.print("Oxygen value of trainee " + (i + 1) + ": ");
                int oxygen = sc.nextInt();
                if (oxygen < 1 || oxygen > 100) {
                    System.out.println("INVALID INPUT");
                    return;
                }
                trainer[i][round - 1] = oxygen;
            }
        }
        mpc_exams(trainer);

    }
}
