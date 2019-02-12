package spring_web_step2.com.test.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void testBefore() {
		System.out.println("before");
	}
	
	
	@Test
	public void test() {
		Calculator cal= new Calculator();
		assertEquals(80, cal.multi(10, 8));
	}

}
