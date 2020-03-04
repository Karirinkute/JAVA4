package oefening_2en3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class TestModel {

	@Test
	public void testIncrease() {
		Model model = new Model();
		int oldValue = model.getCounter();
		model.increase();
		int newValue = model.getCounter();
		assertEquals(1, newValue);

		oldValue = model.getCounter();
		model.increase();
		newValue = model.getCounter();
		assertEquals(oldValue + 1, newValue);
	}
	
	@Test 
	public void testSetCounter() {
		Model model = new  Model();
		int oldValue = model.getCounter();
		assertEquals(0, oldValue);
		
		int newValue = 34;
		model.setCounter(newValue);
		assertEquals(newValue, model.getCounter());
	}

//	@Test
//	public void testReset() {
//		Model model = new Model();
//		model.setCounter(1);
//		assertNotEquals(0, model.getCounter());
//		model.reset();
//		assertEquals(0, model.getCounter());
//	}

}
