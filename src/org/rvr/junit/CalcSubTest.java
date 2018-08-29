package org.rvr.junit;
import static org.junit.Assert.*;

import org.junit.Test;

//import org.junit.jupiter.api.Test;

public class CalcSubTest {

	@Test
	public void test() {
		Cal c = new Cal();
		int ans2 = c.sub(3, 2);
		assertEquals(1, ans2);
	}

}
