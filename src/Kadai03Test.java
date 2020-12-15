import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai03Test {

	@Test
	void testReverseString() {
		Kadai03 k = new Kadai03();

		assertEquals("A,E,L,P",k.CharacterList("APPLE"));

	}

}
