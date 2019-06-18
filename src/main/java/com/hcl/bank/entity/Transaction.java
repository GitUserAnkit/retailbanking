package com.hcl.bank.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Transaction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	
	
	private long toAccNo;
	

	private double amountTrans ;
	

	private String description;

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
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
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