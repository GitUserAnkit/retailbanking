package com.hcl.bank.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.bank.entity.Beneficiary;


public interface IBenificiaryRepository extends JpaRepository<Beneficiary,Long>{

}
