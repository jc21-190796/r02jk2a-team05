import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai01test {
	@Test
	void testReverseString() {
		Kadai01 k=new Kadai01();
		assertEquals("100",k.ReverseString("001"));
		assertEquals(" ",k.ReverseString(" "));
		assertEquals("字漢",k.ReverseString("漢字"));
		assertNotNull(k.ReverseString(null));
	}

}