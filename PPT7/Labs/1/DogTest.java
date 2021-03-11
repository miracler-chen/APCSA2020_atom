// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************

public class DogTest
{
	public static void main(String[] args)
	{
		Dog dog = new Dog("Spike");
		Dog dog1 = new Yorkshire("Jack");
		Dog dog2 = new Labrador("Tom", "Red");
		System.out.println(dog.getName() + " says " + dog.speak());
		System.out.println(dog1.avgBreedWeight() + dog2.avgBreedWeight());
	}
}
