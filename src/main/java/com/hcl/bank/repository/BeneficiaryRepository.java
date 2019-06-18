package com.hcl.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.bank.entity.Beneficiary;

public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Long>{

}
