package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import service.NWD;

public class NWDTest {

	private Integer a;
	private Integer b;
	private Integer c;
	private NWD nwd;
	
	@Test
	public void checkNWD1() {
		
		a = 15;
		b = 10;
		c = 5;
		nwd = new NWD();
		
	}
	
	@Test
	public void checkNWD2() {
		
		a = -20;
		b = 10;
		c = 10;
		nwd = new NWD();
		
	}
	
	@Test
	public void checkNWD3() {
		
		a = 8;
		b = -6;
		c = 2;
		nwd = new NWD();
		
	}
	
	@Test
	public void checkNWD4() {
		
		a = -8;
		b = -6;
		c = 2;
		nwd = new NWD();
		
	}
	
	@Test
	public void checkNWD5() {
		
		a = 0;
		b = -6;
		c = 0;
		nwd = new NWD();
		
	}
	
	@Test
	public void checkNWD6() {
		
		a = 8;
		b = 0;
		c = 0;
		nwd = new NWD();
		
	}
	
	@Test
	public void checkNWD7() {
		
		a = 0;
		b = 0;
		c = 0;
		nwd = new NWD();
		
	}
	
	@Test
	public void checkNWD() {
		
		a = 13;
		b = 11;
		c = 1;
		nwd = new NWD();
		
	}
	
	@After
	public void check() {
		
		assertEquals(nwd.nwd(a,b), c, 0);
		assertNotSame(nwd.nwd(a,b), c+1);
		
	}

}
