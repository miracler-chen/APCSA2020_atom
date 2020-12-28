import java.util.Scanner;

public class GradingQuizzes {
    public static void main(String[] args) {
        boolean yes = false;

        do {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter number of questions: ");
            int qNum = scan.nextInt();
            int[] answers = new int[qNum];

            System.out.println("Enter the keys for the questions: ");
            for (int i = 0; i < qNum; i++) {
                answers[i] = scan.nextInt();
            }

            int numCorrect = 0;

            System.out.println("Enter the answers for the quiz to be graded: ");
            for (int ans : answers) {
                if (ans == scan.nextInt()) {
                    numCorrect++;
                }
            }

            System.out.println("Correct number: " + numCorrect);
            System.out.println("Correct percentage: " + (double) numCorrect / qNum + "%");

            System.out.println("Grade another quiz? (y/n): ");
            yes = scan.next().equalsIgnoreCase("y");

        } while (yes);
    }
}