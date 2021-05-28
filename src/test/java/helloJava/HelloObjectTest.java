package helloJava;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloObjectTest {

	@Test
	public void testLength() {
		HelloObject helloObj = new HelloObject();
		assertEquals(12, helloObj.printHello().length());
	}
	
	@Test
	public void testString() {
		HelloObject helloObj = new HelloObject();
		assertEquals("Hello, Java!", helloObj.printHello());
	}
}
