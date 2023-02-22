package com.credersi.animals;

import static org.junit.Assert.*;

import org.junit.Test;

public class DogTest {

	@Test
	public void testCatsLiveLongerThanDogs() {
			Cat cat = new Cat(); 
			Dog dog = new Dog(); {
				for (int i = 0; i <= 16; i++) {
					cat.runs();
					dog.runs();
				};
			}
			assertTrue(cat.isAlive());
			assertTrue(!dog.isAlive());
	}
	
	@Test
	public void testDogEatsToDeath() {
		Dog dog = new Dog();{
			for (int i = 0; i < 5; i++) {
				dog.feeds();
			};
		};
		assertTrue(!dog.isAlive());
	}
}
