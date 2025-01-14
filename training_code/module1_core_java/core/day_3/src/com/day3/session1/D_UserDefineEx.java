package com.day3.session1;
//throw and throws
//The serializable class NotSufficientFundException does not declare a 
//static final serialVersionUID field of type long

//class NotSufficientFundException extends Exception{
//	public NotSufficientFundException(String message) {
//		super(message);
//	}
//}

class OverFundException extends RuntimeException{
	public OverFundException(String message) {
		super(message);
	}
}

class NotSufficientFundException extends RuntimeException{
	public NotSufficientFundException(String message) {
		super(message);
	}
}
class Account{
	private int id;
	private String name;
	private int balance;
	
	public Account(int id, String name, int balance) {
		if(balance<10_000) {
			throw new NotSufficientFundException("not sufficient fund");
		}
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		int temp=balance+ amount;
		if(temp>=100_0000) {
			throw new OverFundException("Pls open a current acc");
		}
		balance=temp;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}
public class D_UserDefineEx {
	public static void main(String[] args)  {
		Account account;
		try {
			account = new Account(1, "raj", 20000);
			System.out.println(account);
			account.deposit(10_0000);
			System.out.println(account);
		} catch (NotSufficientFundException e) {
			System.out.println(e.getMessage());
		}catch (OverFundException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
