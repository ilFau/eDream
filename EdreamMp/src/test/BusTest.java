package test;

import agency.*;

import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.not;

import org.junit.Before;
import org.junit.Test;

public class BusTest {
    Vehicles bus1, clonebus;
    
    @Before
    public void prepare(){
	bus1 = new Bus("A1", 60);
	clonebus = new Bus(bus1);
    }
    @Test
    public void testGet() {
	assertEquals("A1", bus1.getName());
	assertEquals(60, bus1.getSeats());
    }
    @Test
    public void testClone(){
	assertEquals(bus1.getName(), clonebus.getName());
	assertEquals(bus1.getSeats(), clonebus.getSeats());
	assertThat(bus1, not(sameInstance(clonebus)));
    }

}
