package test;

import static org.junit.Assert.*;
import org.junit.*;

import agency.Agency;
import static org.hamcrest.CoreMatchers.sameInstance;

public class TestAgency {
    Agency agenzia, agenzia2;
    
    @Before
    public void prepara(){
	agenzia = Agency.getInstance("Edream", "Firenze");
	agenzia2 = Agency.getInstance("Un altra", "Pistoia");
    }
    
    @Test
    public void test() {
	this.testNameAndTown();
	this.testUniqueAgency();
    }
    
    @Test
    public void testNameAndTown(){
	assertEquals("Edream", agenzia.getName());
	assertEquals("Firenze", agenzia.getTown());
    }
    
    @Test
    public void testUniqueAgency(){
	assertThat(agenzia, sameInstance(agenzia2));
    }
    
    @Test
    public void testUlterioreStesseInfo(){
	assertEquals("Edream", agenzia2.getName());
	assertEquals("Firenze", agenzia2.getTown());
    }

}
