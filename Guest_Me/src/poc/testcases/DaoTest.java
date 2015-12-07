package poc.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DaoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.out.println("Setting up before");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	System.out.println("Tearing down afrer");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Setting up");
	}

	@After
	public void tearDown() throws Exception {
	System.out.println("Tearing Down");
	}

	@Test
	public void test() {
		int a =2;
		int b=11;
		int c= a+b;

		assertEquals(13, c);
		
	}

}
