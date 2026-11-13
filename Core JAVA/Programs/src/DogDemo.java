package aabed;

public class DogDemo {

	public static void main(String[] args) {
		Dog lucky = new Dog();
		lucky.name = "Matty";
		lucky.height = 2.4;
		lucky.age = 2;
		
		lucky.getDogInformation();
		lucky.bark();

	}

}
