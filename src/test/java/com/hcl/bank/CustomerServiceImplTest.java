package com.hcl.bank;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hcl.bank.entity.Customer;
import com.hcl.bank.repository.CustomerRepository;
import com.hcl.bank.service.CustomerServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceImplTest {
	
	@InjectMocks
	CustomerServiceImpl customerServiceImpl;
	@Mock
	CustomerRepository customerRepository;
	@Test
	public void getAccountSummaryTest()
	{
		Customer customer=new Customer();
		customer.setAccountNo(1234L);
		customer.setAccountType("saving");
		customer.setBalance(10000.0);
		customer.setCustomerId(1L);
		customer.setIfscCode("ING0001");
		customer.setPassword("kiruthi123");
		customer.setUsername("kiruthika");
		Mockito.when(customerRepository.findById(1L)).thenReturn(Optional.of(customer));
		assertEquals(customer, (customerServiceImpl.getAccountSummary(1L)));
	}
	
	
	

}
