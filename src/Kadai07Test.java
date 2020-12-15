import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class Kadai07Test {

	@Test
	void testisNumeric() {
		Kadai07 k = new Kadai07();
		String s = "7777888213333333";
		boolean i1 = k.isNumeric(s);
		assertThat(i1,is(true));
	}

}
