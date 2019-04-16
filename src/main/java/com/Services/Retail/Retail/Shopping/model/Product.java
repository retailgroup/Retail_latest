package com.Services.Retail.Retail.Shopping.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private Integer product_id;
	private String product_name;
	private Integer inventory_count;
	private double price;
	private double discount;
	
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public Integer getInventory_count() {
		return inventory_count;
	}
	public void setInventory_count(Integer inventory_count) {
		this.inventory_count = inventory_count;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", inventory_count="
				+ inventory_count + ", price=" + price + ", discount=" + discount + "]";
	}
	
	
}
