package Quiz3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {

	@Before
	public void setUp() throws Exception {
		Triangle tester = new Triangle(3.0, 4.0, 5.0);
	}

	@Test
	public void test() {
		Triangle tester = new Triangle(3.0, 4.0, 5.0);
		assertEquals("Testing Perimeter",tester.getPerimeter(), 12.0, .1);
		assertEquals("Testing Area", tester.getArea(), 6.0, .1);
	}

}
