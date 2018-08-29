package org.rvr.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalcAddTest.class, CalcMul.class, CalcSubTest.class })
public class AllTests {

}
