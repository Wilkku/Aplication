package travis;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyControllerTest {
	@Test
	public void testTest(){
		assertEquals("{\"id\":123}", new MyController().test("test"));
	}
}
