package ut;

import static org.junit.Assert.assertTrue;

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
		assertTrue(cl.doAdd(1, 2) == 3);
	}	

	@Test
	public void testSub() {
		assertTrue(cl.doSub(1, 1) == 0);
	}

	@Test
	public void testMul() {
		assertTrue(cl.doMul(9, 2) == 18);
	}

	@Test
	public void testDiv() {
		assertTrue(cl.doDiv(8, 2) == 4);
	}

	@Test
	public void testDiv1() {
		assertTrue(cl.doDiv(14, 2) == 7);
	}
	
	@Test
	public void testAdd1() {
		assertTrue(cl.doAdd(14, 3) == 17);
	}
	
	@Test
	public void testPow() {
		assertTrue(cl.doPower(2, 10) == 1024);
	}
}
