package com.demo.inh.table_per_con_class;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class SavingAccount extends Account {

	@Column(nullable = false)
	private double intrestRate;

	public SavingAccount() {}

	public SavingAccount(String accountHolderName, double balance) {
		super(accountHolderName, balance);
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(String accountHolderName, double balance, double intrestRate) {
		super(accountHolderName, balance);
		this.intrestRate = intrestRate;
	}

	public double getIntrestRate() {
		return intrestRate;
	}
	public void setIntrestRate(double intrestRate) {
		this.intrestRate = intrestRate;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("SavingAccount{");
		sb.append(super.toString())
		.append("intrestRate=").append(intrestRate);
		sb.append('}');
		return sb.toString();
	}
}
