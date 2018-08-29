package org.rvr.junit;
import static org.junit.Assert.*;

import org.junit.Test;

 public class CalcMul 
{

	@Test
	public void test() 
	{
		Cal c = new Cal();
		int ans = c.mul(2, 3);
		assertEquals(6, ans);
		
	}
}
