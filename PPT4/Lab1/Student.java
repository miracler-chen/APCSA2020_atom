import java.util.Scanner;

public class Student {

	String name;
	double grade1, grade2, avg;
	Scanner scan = new Scanner(System.in);

	public Student(String studentName)
	{
		name = studentName;
	}

	public void inputGrades()
	{
		System.out.println("Input your score of the first test: ");
		grade1 = scan.nextDouble();
		System.out.println("Input your score of the second test: ");
		grade2 = scan.nextDouble();
	}

	public double getAverage()
	{
		avg = (grade1 + grade2) / 2;
		return avg;
	}

	public String toString()
	{
		return "Name: " + name + "\t" + "Test1: " + grade1 + "\t" + "Test2: " + grade2 + "\t Avg: " + avg;
	}
}