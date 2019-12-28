package ar.empanada.playground.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.empanada.playground.model.Cat;
import ar.empanada.playground.model.Dog;

/**
 * This is not a very handy name but I'm just playing and that's fine
 * */
public class CatServiceTest {
	
	@Test
	public void checkIfDogIsACat() {
		CatService service = new CatService();
		Dog dog = new Dog();
		assertFalse(service.isCat(dog));
	}
	
	@Test
	public void checkIfCatIsACat() {
		CatService service = new CatService();
		Cat cat = new Cat();
		assertTrue(service.isCat(cat));
		
	}
	
	

}
