import java.util.Scanner;



public class Try{
    static class TryDri{
        private int hi;
        private int hi2;
        public TryDri(int i, int j){
            hi = i;
            hi2 = j;
        }

        public int getSum(){
            return hi + hi2;
        }

        public String toString(){
            return "Sum is " + getSum();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int in1;
        int in2;
        TryDri tr1;
        System.out.println("Input two ints: ");
        in1 = scan.nextInt();
        in2 = scan.nextInt();
        tr1 = new TryDri(in1, in2);
        System.out.println("The sum is " + tr1);
    }
}
