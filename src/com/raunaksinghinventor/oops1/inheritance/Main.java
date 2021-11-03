package com.raunaksinghinventor.oops1.inheritance;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal("Animal", 1, 1, 5, 5);

		Dog dog = new Dog("Golden Retriever", 20, 97, 2, 4, 1, 20, "long silk");
		dog.eat();
		dog.walk();
		dog.run();
	}
}
