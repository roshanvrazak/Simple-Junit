package org.rvr.junit;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalcAddTest {

	@Test
	public void test() {
		Cal c = new Cal();
		int ans1 = c.add(2, 3);
		assertEquals(5, ans1);

	}

}
