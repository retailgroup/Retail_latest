package com.Services.Retail.Retail.Shopping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Services.Retail.Retail.Shopping.model.Cart;

@Repository
public interface Cart_Repo extends JpaRepository<Cart,Integer> {

}
