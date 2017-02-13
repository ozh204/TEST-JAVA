package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import service.Calculator;

public class CalculatorTest {
	
	private Integer a;
	private Integer b;
	private Integer c;
	private Calculator dzialanie;
	
	@Before
	public void init1() {
		
		dzialanie = new Calculator();

	}
	
	@Test
	public void checkAdd1() {
		
		a = 13;
		b = 11;
		c = 24;
		
		assertEquals(dzialanie.add(a,b), c);
		assertNotSame(dzialanie.add(a,b), c+1);
		assertNotSame(dzialanie.add(a,b), c-1);
		
	}
	
	@Test
	public void checkAdd2() {
		
		a = -13;
		b = 11;
		c = -2;
		
		assertEquals(dzialanie.add(a,b), c);
		assertNotSame(dzialanie.add(a,b), c+1);
		assertNotSame(dzialanie.add(a,b), c-1);
		
	}
	
	@Test
	public void checkAdd3() {
		
		a = 13;
		b = -11;
		c = 2;
		
		assertEquals(dzialanie.add(a,b), c);
		assertNotSame(dzialanie.add(a,b), c+1);
		assertNotSame(dzialanie.add(a,b), c-1);
		
	}
	
	@Test
	public void checkSub1() {
		
		a = 13;
		b = 11;
		c = 2;
		
		assertEquals(dzialanie.sub(a,b), c);
		assertNotSame(dzialanie.sub(a,b), c+1);
		assertNotSame(dzialanie.sub(a,b), c-1);
		
	}
	
	@Test
	public void checkSub2() {
		
		a = 13;
		b = -11;
		c = 24;
		
		assertEquals(dzialanie.sub(a,b), c);
		assertNotSame(dzialanie.sub(a,b), c+1);
		assertNotSame(dzialanie.sub(a,b), c-1);
		
	}
	
	@Test
	public void checkSub3() {
		
		a = -13;
		b = 11;
		c = -24;
		
		assertEquals(dzialanie.sub(a,b), c);
		assertNotSame(dzialanie.sub(a,b), c+1);
		assertNotSame(dzialanie.sub(a,b), c-1);
		
	}
	
	@Test
	public void checkMulti1() {
		
		a = 2;
		b = 3;
		c = 6;
		
		assertEquals(dzialanie.multi(a,b), c);
		assertNotSame(dzialanie.multi(a,b), c+1);
		assertNotSame(dzialanie.multi(a,b), c-1);
		
	}
	
	@Test
	public void checkMulti2() {
		
		a = -2;
		b = 3;
		c = -6;
		
		assertEquals(dzialanie.multi(a,b), c);
		assertNotSame(dzialanie.multi(a,b), c+1);
		assertNotSame(dzialanie.multi(a,b), c-1);
		
	}
	
	@Test
	public void checkMulti3() {
		
		a = 2;
		b = -3;
		c = -6;
		
		assertEquals(dzialanie.multi(a,b), c);
		assertNotSame(dzialanie.multi(a,b), c+1);
		assertNotSame(dzialanie.multi(a,b), c-1);
		
	}
	
	@Test
	public void checkMulti4() {
		
		a = -2;
		b = -3;
		c = 6;
		
		assertEquals(dzialanie.multi(a,b), c);
		assertNotSame(dzialanie.multi(a,b), c+1);
		assertNotSame(dzialanie.multi(a,b), c-1);
		
	}
	
	@Test
	public void checkMulti5() {
		
		a = -2;
		b = -3;
		c = 6;
		
		assertEquals(dzialanie.multi(a,b), c);
		assertNotSame(dzialanie.multi(a,b), c+1);
		assertNotSame(dzialanie.multi(a,b), c-1);
		
	}
	
	@Test
	public void checkDiv1() {
		
		a = 8;
		b = 4;
		c = 2;
		
		assertEquals(dzialanie.div(a,b), c);
		assertNotSame(dzialanie.div(a,b), c+1);
		assertNotSame(dzialanie.div(a,b), c-1);
		
	}
	
	@Test
	public void checkDiv2() {
		
		a = -8;
		b = 4;
		c = -2;
		
		assertEquals(dzialanie.div(a,b), c);
		assertNotSame(dzialanie.div(a,b), c+1);
		assertNotSame(dzialanie.div(a,b), c-1);
		
	}
	
	@Test
	public void checkDiv3() {
		
		a = 8;
		b = -4;
		c = -2;
		
		assertEquals(dzialanie.div(a,b), c);
		assertNotSame(dzialanie.div(a,b), c+1);
		assertNotSame(dzialanie.div(a,b), c-1);
		
	}
	
	@Test
	public void checkDiv4() {
		
		a = -8;
		b = -4;
		c = 2;
		
		assertEquals(dzialanie.div(a,b), c);
		assertNotSame(dzialanie.div(a,b), c+1);
		assertNotSame(dzialanie.div(a,b), c-1);
		
	}
	
	@Test
	public void checkDiv5() {
		
		a = 0;
		b = 4;
		c = 0;
		
		assertEquals(dzialanie.div(a,b), c);
		assertNotSame(dzialanie.div(a,b), c+1);
		assertNotSame(dzialanie.div(a,b), c-1);
		
	}
	
	@Test(expected=ArithmeticException.class)
	public void checkDiv6() {
		
		a = 88;
		b = 0;
		c = dzialanie.div(a,b);
		
	}
	
	@Test
	public void checkGreater1() {
		
		a = 0;
		b = 4;
		
		assertEquals(dzialanie.greater(a,b), false);
		assertNotSame(dzialanie.greater(a,b), true);

	}
	
	@Test
	public void checkGreater2() {
		
		a = 10;
		b = 4;
		
		assertEquals(dzialanie.greater(a,b), true);
		assertNotSame(dzialanie.greater(a,b), false);

	}
	
	@Test
	public void checkGreater3() {
		
		a = 4;
		b = 4;
		
		assertEquals(dzialanie.greater(a,b), false);
		assertNotSame(dzialanie.greater(a,b), true);

	}
	
	@After
	public void close() {
		
		dzialanie = null;

	}

}
