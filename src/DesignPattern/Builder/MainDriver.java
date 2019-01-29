
package DesignPattern.Builder;

public class MainDriver {

	public static void main(String[] args) {
		//Using builder to get the object in a single line of code and 
                //without any inconsistent state or arguments management issues
		Person person = new Person.Builder("Nikhil Agrawal", "nik@gmail.com").build();

		Person personWithAge = new Person
							.Builder("Nikhil Agrawal", "nik@gmail.com")
							.setAge(10)
							.build();

		System.out.println(person.toString());
		System.out.println(personWithAge.toString());

	}

}
