import java.util.Scanner;

public class TrackBand
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		BandBooster bb1 = new BandBooster("BBS1");
		BandBooster bb2 = new BandBooster("BBS2");

		System.out.println("Enter the number of boxes sold by " + bb1.getName() + " this week:");
		bb1.updateSales(scan.nextInt());
		System.out.println(bb1.toString());
		System.out.println("Enter the number of boxes sold by " + bb2.getName() + " this week:");
		bb2.updateSales(scan.nextInt());
		System.out.println(bb2.toString());

	}
}