package com.hcl.bank.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private Long customerId;
	private String username;
	private String password;
	private Long accountNo;
	private String accountType;
	private Double balance;
	private String ifscCode;
	
	@OneToMany (mappedBy = "customer1")
	private List<Beneficiary> beneficiary;
	
	@OneToMany (mappedBy = "customer2")
	private List<Transaction> transaction;

	public Customer() {

	}

	public Customer(Long customerId, String username, String password, Long accountNo, String accountType,
			Double balance, String ifscCode) {
		super();
		this.customerId = customerId;
		this.username = username;
		this.password = password;
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.balance = balance;
		this.ifscCode = ifscCode;
	}
	
	

	/**
	 * @return the beneficiary
	 */
	public List<Beneficiary> getBeneficiary() {
		return beneficiary;
	}

	/**
	 * @param beneficiary the beneficiary to set
	 */
	public void setBeneficiary(List<Beneficiary> beneficiary) {
		this.beneficiary = beneficiary;
	}

	/**
	 * @return the transaction
	 */
	public List<Transaction> getTransaction() {
		return transaction;
	}

	/**
	 * @param transaction the transaction to set
	 */
	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", username=" + username + ", password=" + password
				+ ", accountNo=" + accountNo + ", accountType=" + accountType + ", balance=" + balance + ", ifscCode="
				+ ifscCode + "]";
	}

}
