package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import service.NWD;

public class NWDtestt {

	private Integer a;
	private Integer b;
	private Integer c;
	private NWD nwd;
	
	@Before
	public void init() {
		
		a = 15;
		b = 10;
		c = 5;
		nwd = new NWD();
		
	}
	
	@Test
	public void checkNWD() {
		
		assertEquals(nwd.nwd(a,b), c, 0);
		assertNotSame(nwd.nwd(a,b), c+1);
		
	}
	
	@After
	public void close() {
		
		a = null;
		b = null;
		
	}

}
