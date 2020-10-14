package io.testmaven;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class personTest {

	@Test
	public void createPerson() {
		person person = new person();
		person.setAge(29);
		person.setNom("alpha");
		Assertions.assertEquals("alpha", person.getNom());
	}
	@Test 
	public void printPerson() {
		person person = new person();
		person.setAge(29);
		person.setNom("alpha");
		System.out.println("nom= "+person.getNom()+" age= "+person.getAge());
	}
}
