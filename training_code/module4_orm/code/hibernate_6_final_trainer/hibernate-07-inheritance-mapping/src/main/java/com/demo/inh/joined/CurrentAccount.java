package com.demo.inh.joined;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "current_acccount_table")
@Entity
public class CurrentAccount extends Account {

	//@Column(nullable = false)
	private double overdraft;

	public CurrentAccount() {}

	public CurrentAccount(String accountHolderName, double balance) {
		super(accountHolderName, balance);
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(String accountHolderName, double balance, double overdraft) {
		super(accountHolderName, balance);
		this.overdraft = overdraft;
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}


	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("CurrentAccount{");
		sb.append(super.toString())
				.append("overdraft=").append(overdraft);
		sb.append('}');
		return sb.toString();
	}
}