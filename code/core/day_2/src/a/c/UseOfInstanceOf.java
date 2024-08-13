package a.c;
abstract class Animal{
  abstract	void   sound();
}
class Dog extends Animal{

	@Override
	void sound() {
		System.out.println("bho bho");
	}
	
	public void nightWathmanShip() {
		System.out.println("jagato raho");
	}
}
class Cat extends Animal{

	@Override
	void sound() {
		System.out.println("meou..");
	}

}

public class UseOfInstanceOf {

	public static void main(String[] args) {
		Animal[]animals= {new Dog(), new Cat(), new Dog()};
		for(Animal animal: animals) {
			animal.sound();
			if(animal instanceof Dog) {
				((Dog) animal).nightWathmanShip();
			}
			
		}
	}
}






