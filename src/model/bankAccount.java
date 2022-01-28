/**
 * @author cgwem - cgwemer
 * CIS175 - Spring 2022
 * Jan 27, 2022
 */
package model;
import java.text.DecimalFormat;

public class bankAccount {
	public double balance;
	public String name;
	DecimalFormat formatMoney = new DecimalFormat("0.00");
	
	public bankAccount() {
		super();
	}
	public bankAccount(double balance, String name) {
		super();
		this.balance = balance;
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void deposit(double deposit) {
		this.balance += deposit;
		
	}
	public void withdraw(double withdraw) {
		this.balance -= withdraw;
	}
	public String checkBalance() {
		return name + " has a balance of $" + formatMoney.format(balance);
	}
	
}
