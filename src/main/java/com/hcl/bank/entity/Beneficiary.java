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
	@ManyToOne
	private Beneficiary beneficiary;
	
	@Column (name = "beneficiary_acc")
	private long beneficiaryAccNo;
	
	@Column (name = "beneficiary_ifsc")
	private String beneficiaryIfscCode;
	
	@Column (name = "name")
	private String Name;


	public long getId() {
		return id;
	}

	
	public void setId(long id) {
		this.id = id;
	}

	
	public Customer getCustomer() {
		return customer;
	}

	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	public long getBeneficiaryAccNo() {
		return beneficiaryAccNo;
	}

	public void setBeneficiaryAccNo(long beneficiaryAccNo) {
		this.beneficiaryAccNo = beneficiaryAccNo;
	}

	
	public String getBeneficiaryIfscCode() {
		return beneficiaryIfscCode;
	}

	public void setBeneficiaryIfscCode(String beneficiaryIfscCode) {
		this.beneficiaryIfscCode = beneficiaryIfscCode;
	}

	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	
}