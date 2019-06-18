package com.hcl.bank.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Transaction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer2;
	
	@Column (name = "beneficiary_acc")
	private long toAccNo;
	
	@Column (name = "beneficiary_ifsc")
	private double amountTrans ;
	
	@Column (name = "name")
	private String description;
	
	@Column (name = "date")
	private Date tranDate;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer2;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer2 = customer;
	}

	/**
	 * @return the toAccNo
	 */
	public long getToAccNo() {
		return toAccNo;
	}

	/**
	 * @param toAccNo the toAccNo to set
	 */
	public void setToAccNo(long toAccNo) {
		this.toAccNo = toAccNo;
	}

	/**
	 * @return the amountTrans
	 */
	public double getAmountTrans() {
		return amountTrans;
	}

	/**
	 * @param amountTrans the amountTrans to set
	 */
	public void setAmountTrans(double amountTrans) {
		this.amountTrans = amountTrans;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the tranDate
	 */
	public Date getTranDate() {
		return tranDate;
	}

	/**
	 * @param tranDate the tranDate to set
	 */
	public void setTranDate(Date tranDate) {
		this.tranDate = tranDate;
	}
	
	
}
