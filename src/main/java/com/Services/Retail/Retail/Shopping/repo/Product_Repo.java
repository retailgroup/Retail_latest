package com.Services.Retail.Retail.Shopping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Services.Retail.Retail.Shopping.model.Product;

@Repository
public interface Product_Repo extends JpaRepository<Product,Integer>  {

}
