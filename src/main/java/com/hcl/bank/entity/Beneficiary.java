package com.hcl.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "beneficiary")
public class Beneficiary {

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
	
	@Column (name = "beneficiary_acc")
	private long beneficiaryAccNo;
	
	@Column (name = "beneficiary_ifsc")
	private String beneficiaryIfscCode;
	
	@Column (name = "name")
	private String Name;

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
	 * @return the beneficiaryAccNo
	 */
	public long getBeneficiaryAccNo() {
		return beneficiaryAccNo;
	}

	/**
	 * @param beneficiaryAccNo the beneficiaryAccNo to set
	 */
	public void setBeneficiaryAccNo(long beneficiaryAccNo) {
		this.beneficiaryAccNo = beneficiaryAccNo;
	}

	/**
	 * @return the beneficiaryIfscCode
	 */
	public String getBeneficiaryIfscCode() {
		return beneficiaryIfscCode;
	}

	/**
	 * @param beneficiaryIfscCode the beneficiaryIfscCode to set
	 */
	public void setBeneficiaryIfscCode(String beneficiaryIfscCode) {
		this.beneficiaryIfscCode = beneficiaryIfscCode;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	
	
}
