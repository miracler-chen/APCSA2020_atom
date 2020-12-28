import java.util.Scanner;

public class ReverseArray
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Num of the integers: ");
		int elenum = scan.nextInt();
		int[] numin = new int[elenum];
		int k;

		System.out.println("Your array: ");
		for (int i = 0; i < elenum; i ++)
		{
			numin[i] = scan.nextInt();
		}

		System.out.println("Your initial array: ");
		for (int x = 0; x < elenum; x ++)
		{
			System.out.print(numin[x] + " ");
		}

		for (int j = 0; j < (elenum / 2); j ++)
		{
			k = numin[j];
			numin[j] = numin[elenum - j - 1];
			numin[elenum - 1 - j] = k;
		}
		System.out.println();
		System.out.println("Your final array: ");
		for (int y = 0; y < elenum; y ++)
		{
			System.out.print(numin[y] + " ");
		}
	}
}