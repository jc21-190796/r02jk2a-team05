import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai10Test {

	@Test
	void test() {
		Kadai10 k = new Kadai10();
		String str ="abc";
		String str1 ="abc";
		int size = 5;
		assertEquals(str1,k.replaceLongString(str, size));
	}

}
