import static org.junit.Assert.*;

import org.junit.Test;

public class DayCalculatorTest {
	DayCalculator dayCalculator;
	
	public void setUp() throws Exception {
		dayCalculator = new DayCalculator();
	}
	
	
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public void test00010101() {
		DayCalculator dayCalculator = new DayCalculator();
		assertEquals("Mon", dayCalculator.getDay(1,1,1));
	}
	@Test
	public void test00010102() {
		DayCalculator dayCalculator = new DayCalculator();
		assertEquals("Tue", dayCalculator.getDay(1,1,2));
	}
	@Test
	public void test00010103() {
		assertEquals("Wen", dayCalculator.getDay(1,1,3));
	}
	@Test
	public void test00010104() {
		assertEquals("Thu", dayCalculator.getDay(1,1,4));
	}
	@Test
	public void test00010110() {
		assertEquals("Wen", dayCalculator.getDay(1,1,10));
	}
	@Test
	public void test00010201() {
		assertEquals("Thu", dayCalculator.getDay(1, 2, 1));
	}
	@Test
	public void test00010202() {
		assertEquals("Fri", dayCalculator.getDay(1, 2, 2));
	}
	@Test
	public void test00010301() {
		assertEquals("Thu", dayCalculator.getDay(1, 3, 1));
	}
	@Test
	public void test00010401() {
		assertEquals("Fri", dayCalculator.getDay(1,4,1));
		System.out.println(dayCalculator.getDay(1, 12, 31));
	}

}
