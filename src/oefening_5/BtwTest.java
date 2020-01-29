package oefening_5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BtwTest {

	@Test
	public void getPrijsInclusiefBtw() {
		Btw btw = new Btw();
		
		btw.setPrijs(10);
		
		assertEquals(10*1.21d, btw.getPrijsInclusiefBtw());
		
		btw.setPrijs(0.99);
		
		assertEquals(1.20d, btw.getPrijsInclusiefBtw());
	}
	
	@Test
	public void getPrijsInclusiefBtw9() {
		Btw btw = new Btw();
		btw.setBtw(9);
		
		btw.setPrijs(10);
		
		assertEquals(10*1.09d, btw.getPrijsInclusiefBtw());
		
		btw.setPrijs(0.99);
		
		assertEquals(1.08d, btw.getPrijsInclusiefBtw());
	}
}
