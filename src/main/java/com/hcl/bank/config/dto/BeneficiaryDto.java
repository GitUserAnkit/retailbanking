package com.hcl.bank.config.dto;

public class BeneficiaryDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;
	private long beneficiaryAccNo;
	private String beneficiaryIfscCode;
	private String name;

	public BeneficiaryDto() {
		// TODO Auto-generated constructor stub
	}

	public BeneficiaryDto(long id, long beneficiaryAccNo, String beneficiaryIfscCode, String name) {
		super();
		this.id = id;
		this.beneficiaryAccNo = beneficiaryAccNo;
		this.beneficiaryIfscCode = beneficiaryIfscCode;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}