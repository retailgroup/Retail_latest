package com.Services.Retail.Retail.Shopping.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cart {

	@Id
	@GeneratedValue
	private Integer customer_id;
	private String product_name;
	private Integer item_count;
	
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public Integer getItem_count() {
		return item_count;
	}
	public void setItem_count(Integer item_count) {
		this.item_count = item_count;
	}
	
	@Override
	public String toString() {
		return "Cart [customer_id=" + customer_id + ", product_name=" + product_name + ", item_count=" + item_count
				+ "]";
	}
	
	
}
