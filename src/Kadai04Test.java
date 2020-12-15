import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class Kadai04Test {

	@Test
	void testGetMax() {
		Kadai04 k = new Kadai04();
		String s = " ";
		char i1 = k.getMaxString(s);
		assertThat(i1,is(' '));

	}

}
