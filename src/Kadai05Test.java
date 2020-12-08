import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class Kadai05Test {

	@Test
	void testGetMax() {
		Kadai05 k = new Kadai05();
		int [] e = {1,2,3,4,1,12,12,-100};
		int i1 = k.getMax(e);
		assertThat(i1,is(12));

	}

}
