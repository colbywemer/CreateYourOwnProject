/**
 * @author cgwem - cgwemer
 * CIS175 - Spring 2022
 * Jan 27, 2022
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.bankAccount;

public class bankAccountTests {
	bankAccount account = new bankAccount();
	@Test
	public void testCheckBalance() {
		account.setName("Colby");
		account.setBalance(500.00);
		assertEquals("Colby has a balance of $500.00", account.checkBalance());
	}
	@Test
	public void testCheckPositiveBalance() {
		account.setBalance(1.00);
		assertTrue(account.getBalance() >= 0);
	}
	@Test
	public void testCheckNegitiveBalance() {
		account.setBalance(-.01);
		assertFalse(account.getBalance() >= 0);
	}
	
}
