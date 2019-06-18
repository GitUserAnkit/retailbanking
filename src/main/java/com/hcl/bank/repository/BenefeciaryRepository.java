package com.hcl.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hcl.bank.entity.Beneficiary;

public interface BenefeciaryRepository extends JpaRepository<Beneficiary, Long> {

	@Query(value = "Select * from beneficiary where customer_id = :data",nativeQuery=true)
	List<Beneficiary> getBenfeciary(@Param("data") Long data);
}
