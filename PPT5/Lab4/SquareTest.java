// ****************************************************************
// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.
//
// ****************************************************************
import java.io.*;
import java.util.Scanner;

public class SquareTest
{
    static class Square{
        int[][] square;
        //--------------------------------------
        //create new square of given size
        //--------------------------------------
        public Square(int size)
        {
            square = new int[size][size];
        }

        //--------------------------------------
        //return the sum of the values in the given row
        //--------------------------------------
        public int sumRow(int row)
        {
            int sumR = 0;
            for (int i = 0; i < square[row - 1].length; i ++){
                sumR += square[row - 1][i];
            }
            return sumR;
        }

        //--------------------------------------
        //return the sum of the values in the given column
        //--------------------------------------
        public int sumCol(int col)
        {
            int sumC = 0;
            for (int i = 0; i < square[col - 1].length; i ++){
                sumC += square[col - 1][i];
            }
            return sumC;
        }

        //--------------------------------------
        //return the sum of the values in the main diagonal
        //--------------------------------------
        public int sumMainDiag()
        {
            int sumM1 = 0;
            int sz = square.length;
            for (int j = 0; j < sz; j ++){
                sumM1 += square[j][j];
            }
            return sumM1;
        }

        //--------------------------------------
        //return the sum of the values in the other ("reverse") diagonal
        //--------------------------------------
        public int sumOtherDiag()
        {
            int sumM2 = 0;
            for (int j = (square.length - 1); j >= 0; j --){
                sumM2 += square[j][j];
            }
            return sumM2;
        }

        //--------------------------------------
        //return true if the square is magic (all rows, cols, and diags have
        //same sum), false otherwise
        //--------------------------------------
        public boolean magic()
        {
            if (sumMainDiag() == sumOtherDiag()){
                if (sumRow(square.length - 1) == sumOtherDiag()) {
                    if (sumCol(square.length - 1) == sumOtherDiag()) {
                        return true;
                    }
                }
            }

            return false;
        }

        //--------------------------------------
        //read info into the square from the input stream associated with the
        //Scanner parameter
        //--------------------------------------
        public void readSquare(Scanner scan)
        {
            for (int row = 0; row < square.length; row++)
            for (int col = 0; col < square.length; col ++)
            square[row][col] = scan.nextInt();
        }

        //--------------------------------------
        //print the contents of the square, neatly formatted
        //--------------------------------------
        public void printSquare()
        {

            for (int i = 0; i < square.length; i ++){
                for (int j : square[i]){
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(new File("/Users/chenbingan/github/APCSA2020_atom/PPT5/Lab4/magicData.txt"));

        int count = 1;                 //count which square we're on
        int size = scan.nextInt();     //size of next square

        //Expecting -1 at bottom of input file
        while (size != -1)
        {

            //create a new Square of the given size
            Square sq = new Square(size);
            //call its read method to read the values of the square
            sq.readSquare(scan);
            System.out.println("\n******** Square " + count + " ********");
            //print the square
            sq.printSquare();
            //print the sums of its rows
            System.out.println(sq.sumRow(size));
            //print the sums of its columns
            System.out.println(sq.sumCol(size));
            //print the sum of the main diagonal
            System.out.println(sq.sumMainDiag());
            //print the sum of the other diagonal
            System.out.println(sq.sumOtherDiag());
            //determine and print whether it is a magic square
            System.out.println(sq.magic());
            //get size of next square
            size = scan.nextInt();

            count ++;
        }
    }
}
