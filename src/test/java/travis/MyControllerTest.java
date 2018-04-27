package travis;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyControllerTest {
	@Test
	public void testTest(){
		assertEquals("{\"id\":test}", new MyController().test("test"));
	}
	
	@Test
	public void testTestWithString(){
		assertEquals("{\"id\":456}", new MyController().test("456"));
	}
	
	@Test
	public void testTestWith(){
		assertEquals("{\"id\":MORO}", new MyController().test("MORO"));
	}
}
