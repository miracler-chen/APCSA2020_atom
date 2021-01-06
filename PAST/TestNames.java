public class TestNames
{
	public static void main (String args[])
	{
		Name nm1 = new Name("Mary", "Jane", "Smith");
		Name nm2 = new Name("Hello", "Merry", "Christmas");

		System.out.println(nm1.firstMiddleLast());
		System.out.println(nm1.lastFirstMiddle());
		System.out.println(nm1.initials());
		System.out.println(nm1.length());
		System.out.println(nm2.firstMiddleLast());
		System.out.println(nm2.lastFirstMiddle());
		System.out.println(nm2.initials());
		System.out.println(nm2.length());
	}
}