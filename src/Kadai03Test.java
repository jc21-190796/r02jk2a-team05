import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai03Test {

	@Test
	void testReverseString() {
		Kadai03 k = new Kadai03();

		assertArrayEquals( new  char[] { 'A','E','L','P'},k.CharacterList("APPLE"));
		assertArrayEquals( new  char[] { 'A','E','L','P'},k.CharacterList("apple"));
		assertArrayEquals( new  char[] { 'A','E','L','P'},k.CharacterList("ApPle001"));
		assertArrayEquals( new  char[] { 'A'},k.CharacterList("AAAAAA"));
	}

}
