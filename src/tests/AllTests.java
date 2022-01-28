/**
 * @author cgwem - cgwemer
 * CIS175 - Spring 2022
 * Jan 27, 2022
 */
package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({bankAccountTests.class, bankAccountDepositAndWithdraw.class})
public class AllTests {

}
