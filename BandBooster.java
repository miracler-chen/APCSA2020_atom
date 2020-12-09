public class BandBooster
{
	private String name;
	private int boxesSold;
	BandBooster(String nm)
	{
		name = nm;
		boxesSold = 0;
	}
	
	public String getName()
	{
		return name;
	}

	public void updateSales(int updS)
	{
		boxesSold = updS;
	}

	public String toString()
	{
		return name + ": " + boxesSold + " boxes.";
	}
}