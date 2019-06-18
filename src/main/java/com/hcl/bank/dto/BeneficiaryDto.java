package com.hcl.bank.dto;

public class BeneficiaryDto {

	 private long beneficiaryAccNo;
	 private String beneficiaryIfscCode;
	 private String name;
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
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	 
	 
}
