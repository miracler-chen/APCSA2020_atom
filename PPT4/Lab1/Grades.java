public class Grades
{
	public static void main (String[] args)
	{
		Student student1 = new Student("Mary");
		Student student2 = new Student("Jack");

		student1.inputGrades();
		student1.getAverage();
		System.out.println(student1);

		System.out.println();

		student2.inputGrades();
		student2.getAverage();
		System.out.println(student2);
	}
}
