package com.b21.order;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shopping")
public class Order{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
@Column
	private String dateofpurchase;
@Column
	private float total;
@Column
	private int customerid;
@Column
	private String paymentmode;
@Column
	private int shopid;

public Order() {
}

	
	public Order(int id, String dateofpurchase, float total, int customerid, String paymentmode, int shopid) {
		super();
		this.id = id;
		this.dateofpurchase = dateofpurchase;
		this.total = total;
		this.customerid = customerid;
		this.paymentmode = paymentmode;
		this.shopid = shopid;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDateofpurchase() {
		return dateofpurchase;
	}


	public void setDateofpurchase(String dateofpurchase) {
		this.dateofpurchase = dateofpurchase;
	}


	public float getTotal() {
		return total;
	}


	public void setTotal(float total) {
		this.total = total;
	}


	public int getCustomerid() {
		return customerid;
	}


	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}


	public String getPaymentmode() {
		return paymentmode;
	}


	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}


	public int getShopid() {
		return shopid;
	}


	public void setShopid(int shopid) {
		this.shopid = shopid;
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", dateofpurchase=" + dateofpurchase + ", total=" + total + ", customerid="
				+ customerid + ", paymentmode=" + paymentmode + ", shopid=" + shopid + "]";
	}
	
	
	
	
	

}
