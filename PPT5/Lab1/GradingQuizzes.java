import java.util.Scanner;

public class GradingQuizzes
{
    public static void main (String args[])
    {
        boolean proc = false;
        
        do{
            System.out.println("num of the ans: ");
            Scanner scan = new Scanner(System.in);
            int numans;
            numans = scan.nextInt();
            int numcorrect = 0;
            int[] ans = new int[numans];
            int[] key = new int[numans];
            System.out.println("ans: ");
            for (int i = 0; i < numans; i ++)
            {
                ans[i] = scan.nextInt();
            }
            System.out.println("keys: ");
            for (int j : ans)
            {
                if (j == scan.nextInt())
                {
                    numcorrect ++;
                }
            }

            System.out.println("You got: " + numcorrect + " correct.");
            System.out.println("The percent is " + ((double)numcorrect / numans) + "%.");
            System.out.println("Grade another quiz? (y/n).");
            proc = scan.next().equalsIgnoreCase("y");
        }
        
        while (proc == true);
    }
}