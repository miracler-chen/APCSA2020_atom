public class ArrTest{
	public static void main (String args[])
	{
		// testing for array
		// creat an array, fills it with some values, modify one of the values
		// and then we will print the value in the array

		final int LIMIT = 15;
		final int MULTIPLE = 10;

		int [] list = new int [LIMIT]; // creat an array
		// initialize the array
		for (int index = 0; index < LIMIT; index ++)
		{
			list[index] = index * MULTIPLE;
		}

		list[3] = 999;
		

		for (int value:list)
		{
			System.out.println(value + " ");
		}
	}
}