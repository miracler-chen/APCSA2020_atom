import java.util.Scanner;

public class LetterCount{
    public static void main(String[] args) {
        final int NUM = 26;
        int[] up = new int[NUM];
        int[] low = new int[NUM];
        int others = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input your sentence belowe: ");
        String target = scan.nextLine();

        char tLet;

        for (int check = 0; check < target.length(); check ++)
        {
            tLet = target.charAt(check);
            if (tLet <= 'Z' && tLet >= 'A') {
                up[tLet - 'A'] ++;
            }
            else {
                if (tLet <= 'z' && tLet >= 'a') {
                    low[tLet - 'a'] ++;
                }
                else {
                    others ++;
                }
            }
        }

        System.out.println("---------------- Result ----------------");
        for (int i = 0; i < NUM; i ++) {

            System.out.print((char)(i + 'A'));
            System.out.print("\t");
            System.out.print(up[i]);
            System.out.print("\t\t");
            System.out.print((char)(i + 'a'));
            System.out.print("\t");
            System.out.print(low[i]);
            System.out.println();
        }
        System.out.println("Others: \t" + others);

    }
}
