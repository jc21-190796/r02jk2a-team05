import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai02Test {

	@Test
	void testReverseString() {
		Kadai02 k = new Kadai02();

		assertEquals(1,k.countString("AB12",'A'));
		assertEquals(0,k.countString("12345",'A'));
		assertEquals(2,k.countString("AABC",'A'));
		assertEquals(2,k.countString("ABCabc",'A'));

	}

}
