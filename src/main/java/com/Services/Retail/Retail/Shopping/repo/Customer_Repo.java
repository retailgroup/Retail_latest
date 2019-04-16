package com.Services.Retail.Retail.Shopping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Services.Retail.Retail.Shopping.model.Customer;


@Repository
public interface Customer_Repo extends JpaRepository<Customer,Integer> {
	

}
