package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer prodId;
	@Column(name="code")
	private String prodCode;
	@Column(name="cost")
	private Double prodost;
	public Product() {
		super();
	}
	public Product(String prodCode, Double prodost) {
		super();
		this.prodCode = prodCode;
		this.prodost = prodost;
	}
	public Product(Integer prodId, String prodCode, Double prodost) {
		super();
		this.prodId = prodId;
		this.prodCode = prodCode;
		this.prodost = prodost;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodCode=" + prodCode + ", prodost=" + prodost + "]";
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public Double getProdost() {
		return prodost;
	}
	public void setProdost(Double prodost) {
		this.prodost = prodost;
	}
	
}
