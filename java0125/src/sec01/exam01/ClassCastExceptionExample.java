package sec01.exam01;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
//		Dog dog = new Dog();
//		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		//if(animal instanceof Dog) {
		//} 
		try {
			Dog dog = (Dog) animal;
		} catch (ClassCastException e) {
			System.out.println("변환 불가");
		}
							

	}
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

