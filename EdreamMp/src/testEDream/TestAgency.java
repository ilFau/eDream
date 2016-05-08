package testEDream;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import eDreamPack.Customer;

public class TestAgency {
	Customer cliente1, cliente2, cliente3;
	
	@Before
	public void mockUp(){
	}
	
	@Test
	public void testCostructor() {
		//inutile testare i costruttori mavvabbé
		cliente1 = new Customer("Piero", "Scottex", "543948739");
		assertEquals("Piero",cliente1.getName());
		assertEquals("Scottex",cliente1.getLastName());
		assertEquals("543948739",cliente1.getFiscalCode());
	}
	
	@Test
	public void testEquals() {
		//inutile testare anche gli equals mavvabbé
		cliente1 = new Customer("Piero", "Scottex", "543948739");
		cliente2 = new Customer("Piero", "Scottex", "543948739");
		cliente3 = new Customer("Piero", "Scottex", "443948739");
		assertEquals(true,cliente1.equals(cliente2));
		assertEquals(false,cliente1.equals(cliente3));
	}

}
