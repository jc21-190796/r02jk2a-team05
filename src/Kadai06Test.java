import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class Kadai06Test {

	@Test
	void testGet2ndMax() {
		Kadai06 k = new Kadai06();
		int [] e = {1,2,3,4,1,12,12,-100};
		int i1 = k.get2ndMax(e);
		assertThat(i1,is(4));
	}

}
