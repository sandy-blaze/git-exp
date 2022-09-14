package ut;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import etasb.application.Calculator;

public class CalculatorTest {

	static Calculator cl;

	@BeforeClass
	public static void setUp() {
		cl = new Calculator();
	}

	@AfterClass
	public static void tearDown() {
		System.gc();
	}

	@Test
	public void testAdd() {
		assertEquals(3, (int)cl.doAdd(1, 2));
	}	

	@Test
	public void testSub() {
		assertEquals(0, (int)cl.doSub(1, 1));
	}

	@Test
	public void testMul() {
		assertEquals(18, (int)cl.doMul(9, 2));
	}

	@Test
	public void testDiv() {
		assertEquals(4, (int)cl.doDiv(8, 2));
	}

	@Test
	public void testDiv1() {
		assertEquals(7, (int)cl.doDiv(14, 2));
	}
	
	@Test
	public void testAdd1() {
		assertEquals(17, (int)cl.doAdd(14, 3));
	}
	
	@Test
	public void testPow() {
		assertEquals(1024, (int)cl.doPower(2, 10));
	}
}
