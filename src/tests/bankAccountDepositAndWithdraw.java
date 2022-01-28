/**
 * @author cgwem - cgwemer
 * CIS175 - Spring 2022
 * Jan 27, 2022
 */
package tests;
import static org.junit.Assert.*;

import org.junit.Test;

import model.bankAccount;

public class bankAccountDepositAndWithdraw {
	bankAccount account = new bankAccount();
	@Test
	public void testWithdraw() {
		account.setBalance(500);
		account.withdraw(100);
		assertTrue(account.getBalance() == 400.00);
	}
	@Test
	public void testDeposit() {
		account.setBalance(500);
		account.deposit(100);
		assertTrue(account.getBalance() == 600.00);
	}


}
